package com.nilson.tareaapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {


    private EditText txtnombre;
    private Button btnvalorar;

    private RatingBar ratingBar;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre = findViewById(R.id.txtnombre);
        btnvalorar = findViewById(R.id.btnvalorar);

        ratingBar = findViewById(R.id.ratingBar);





    }
}