package com.example.calculadora;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText primNum, segNum;
    Button btsub, btsoma, btdivi, btmult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        primNum = (EditText) findViewById(R.id.primNum);
        segNum = (EditText) findViewById(R.id.segNum);
        btsoma = (Button) findViewById(R.id.btsoma);
        btsub = (Button) findViewById(R.id.btsub);
        btmult = (Button) findViewById(R.id.btmult);
        btdivi = (Button) findViewById(R.id.btdivi);

        btsoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(primNum.getText().toString());
                double num2 = Double.parseDouble(segNum.getText().toString());
                double res = num1 + num2;
                Alerta("soma",res);
            }
        });
        btsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(primNum.getText().toString());
                double num2 = Double.parseDouble(segNum.getText().toString());
                double res = num1 - num2;
                Alerta("subtracao",res);
            }
        });
        btmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(primNum.getText().toString());
                double num2 = Double.parseDouble(segNum.getText().toString());
                double res = num1 * num2;
                Alerta("multiplicacao", res);
            }
        });
        btdivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(primNum.getText().toString());
                double num2 = Double.parseDouble(segNum.getText().toString());
                double res = num1 / num2;
                Alerta("divisao", res);
            }
        });

    }


    public void Alerta(String msg, Double res){
        AlertDialog.Builder resposta = new AlertDialog.Builder(MainActivity.this);
        resposta.setTitle("Resposta da "+msg);
        resposta.setMessage("Deu: "+res);
        resposta.setNeutralButton("Ok", null);
        resposta.show();
    }
}
