package com.example.calculosalario;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    Button button;
    RadioButton id_30,id_45,id_50;
    RadioGroup radioGroup;
    EditText textSal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textSal = (EditText) findViewById(R.id.textSal);
        button = (Button) findViewById(R.id.button);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        id_30 = (RadioButton) findViewById(R.id.id_30);
        id_45 = (RadioButton) findViewById(R.id.id_45);
        id_50 = (RadioButton) findViewById(R.id.id_50);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double salario = Double.parseDouble(textSal.getText().toString());
                int op = radioGroup.getCheckedRadioButtonId();
                double novo_salario=0;
                if(op == R.id.id_30){
                    novo_salario = salario + (salario * 0.3);
                    Alerta(novo_salario);
                }else if(op == R.id.id_45){
                    novo_salario = salario + (salario * 0.45);
                    Alerta(novo_salario);
                }else{
                    novo_salario = salario + (salario * 0.5);
                    Alerta(novo_salario);
                }

            }
        });

    }
    public void Alerta(Double res){
        AlertDialog.Builder resposta = new AlertDialog.Builder(MainActivity.this);
        resposta.setTitle("Novo salário");
        resposta.setMessage("Deu: R$"+res);
        resposta.setNeutralButton("Ok", null);
        resposta.show();
    }
}
