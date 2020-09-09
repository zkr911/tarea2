package com.nilson.tareaapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //primero el tipo de dato luego su clase y el nombre de esa clase  se declara el componente
    private EditText txtnombre; //nombre
    private Button btnvalorar; //boton de valorar
    private RatingBar ratingBar; // rating de estrellas
    private RadioGroup rg; //grupo de radio buton del si o no
    private CheckBox cbxc;
    private  CheckBox cbtrail;
    private CheckBox cbenduro;

    private boolean nombreok = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //se enlasa el componente

        txtnombre = findViewById(R.id.txtnombre);
        btnvalorar = findViewById(R.id.btnvalorar);
        ratingBar = findViewById(R.id.ratingBar);
        rg = findViewById(R.id.rg);
        cbxc = findViewById(R.id.cbxc);
        cbtrail = findViewById(R.id.cbtrail);
        cbenduro = findViewById(R.id.cbenduro);



        ratingBar.setEnabled(false);
        btnvalorar.setEnabled(false);
        cbxc.setEnabled(false);
        cbtrail.setEnabled(false);
        cbenduro.setEnabled(false);


        //se le agrega un escuchador al radiogroup para detectar el cambio
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if(i == R.id.btnsi){
                    ratingBar.setEnabled(true);
                    btnvalorar.setEnabled(true);
                    cbxc.setEnabled(true);
                    cbtrail.setEnabled(true);
                    cbenduro.setEnabled(true);

                    if(nombreok == true){

                        btnvalorar.setEnabled(true);
                    }


                }else{
                    ratingBar.setRating(0); // resetear el ratingbar
                    ratingBar.setEnabled(false);//inabilitar ratingbar
                    btnvalorar.setEnabled(false);
                    cbxc.setEnabled(false);
                    cbxc.setChecked(false);//de un chekbox se puede desabilitar la palomita

                    cbtrail.setEnabled(false);
                    cbtrail.setChecked(false);

                    cbenduro.setEnabled(false);
                    cbenduro.setChecked(false);
                    if(nombreok == true){
                        btnvalorar.setEnabled(true);
                    }


                }

            }
        });


        //un escuchador para el nombre

    txtnombre.setOnKeyListener(new View.OnKeyListener() {
        @Override
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            Toast.makeText(MainActivity.this,"texto : "+txtnombre.getText().toString(),Toast.LENGTH_SHORT).show();


            if(txtnombre.getText().length() <3 ){
                txtnombre.setError("El nombre es muy corto");
                return false;

            }else{

                nombreok = true;

            }












            return false;
        }
    });



    }
}