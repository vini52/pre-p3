package com.example.expre_p3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvTitulo = (TextView) findViewById(R.id.tvTitulo);
        EditText etNum = (EditText) findViewById(R.id.etNum);
        TextView tvRes = (TextView) findViewById(R.id.tvRes);
        Button btnCalc = (Button) findViewById(R.id.btnCalc);
        
        btnCalc.setOnClickListener(view -> calcular(etNum, tvRes));
    }

    private void calcular(EditText etNumero, TextView resultado){
        double num = Double.parseDouble(etNumero.getText().toString());
        double resSerie = 0.0;
        if(num < 0.0 || num > 20.0){
            resultado.setText("Digite um número de 0 até 20.");
        } else{
            for(double i = 1; i <= num; i++){
                resSerie = resSerie + (i / (i*i));
            }
            resultado.setText("Resultado: " + resSerie);
        }
    }
}