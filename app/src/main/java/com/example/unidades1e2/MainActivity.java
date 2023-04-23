package com.example.unidades1e2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText edtPeso, edtAltura;
    TextView txtImc, txtClassificacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtAltura = findViewById(R.id.edtAltura);
        edtPeso = findViewById(R.id.edtPeso);
        txtImc = findViewById(R.id.txtImc);

        Button btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                double peso = Double.parseDouble(edtPeso.getText().toString());
                double altura = Double.parseDouble(edtAltura.getText().toString());
                double imc = peso / (altura * altura);

                DecimalFormat decimal = new DecimalFormat();
                String valorFormatado = decimal.format(imc);

                txtImc.setText("" + valorFormatado);

            }

        });

    }
}