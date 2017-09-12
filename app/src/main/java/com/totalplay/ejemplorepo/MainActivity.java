package com.totalplay.ejemplorepo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.totalplay.utilities.pojos.Persona;

public class MainActivity extends AppCompatActivity {
    TextView text;
    Button boton;
    Persona rey=new Persona();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text= (TextView)findViewById(R.id.textv);
        boton= (Button)findViewById(R.id.button);
        rey.nombre="Reynaldo";
        rey.edad="22";
        rey.sexo="masculino";
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(new String("nombre = " + rey.nombre + "  edad = " + rey.edad + "   sexo = " + rey.sexo));
            }
        });
    }



}