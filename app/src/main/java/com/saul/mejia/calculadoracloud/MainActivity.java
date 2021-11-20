package com.saul.mejia.calculadoracloud;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonSuma;
    private Button buttonResta;
    private Button buttonMultiplicacion;
    private Button buttonTangente;
    private Button buttonDivis;
    private Button buttonConversor1;
    private Button buttonConversor2;
    private Button buttonConversor3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSuma = findViewById(R.id.buttonSuma );
        buttonSuma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                abrirSuma();
            }

        });

        buttonResta = findViewById(R.id.buttonResta );
        buttonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirResta();
            }

        });


        buttonMultiplicacion = findViewById(R.id.buttonMulti );
        buttonMultiplicacion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                abrirMultiplicacion();
            }

        });

        buttonDivis = findViewById(R.id.buttonDivision );
        buttonDivis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                abrirDivis();
            }

        });
        buttonTangente = findViewById(R.id.buttonTang );
        buttonTangente.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                abrirTangente();
            }

        });
        buttonConversor1 = findViewById(R.id.buttonConversor1 );
        buttonConversor1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                abrirConversor1();
            }

        });

        buttonConversor2 = findViewById(R.id.buttonConversor2 );
        buttonConversor2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                abrirConversor2();
            }

        });

        buttonConversor3 = findViewById(R.id.buttonConversor3 );
        buttonConversor3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                abrirConversor3();
            }

        });


    }

    private void abrirConversor3() {
        Intent intent = new Intent(this, Conversor3.class);
        startActivity(intent);
    }

    private void abrirConversor2() {
        Intent intent = new Intent(this, Conversor2.class);
        startActivity(intent);
    }

    private void abrirTangente() {
        Intent intent = new Intent(this, ConvertirActivity.class);
        startActivity(intent);
    }

    private void abrirConversor1() {
        Intent intent = new Intent(this, Conversor1.class);
        startActivity(intent);
    }

    private void abrirDivis() {
        Intent intent = new Intent(this, DivisionActivity.class);
        startActivity(intent);
    }

    private void abrirMultiplicacion() {
        Intent intent = new Intent(this, MultiplicacionActivity.class);
        startActivity(intent);
    }
    private void abrirSuma(){
        Intent intent = new Intent(this, SumaActivity.class);
        startActivity(intent);
    }
    private void abrirResta(){
        Intent intent = new Intent(this, RestaActivity.class);
        startActivity(intent);
    }


}