package com.example.listadecompras;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6;
    Button btSoma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        checkBox6 = (CheckBox) findViewById(R.id.checkBox6);
        btSoma = (Button) findViewById(R.id.btSoma);

        btSoma.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                double resp=0;
                if(checkBox1.isChecked()){
                    resp += 3.00;
                }if(checkBox2.isChecked()){
                    resp += 3.50;
                }if(checkBox3.isChecked()){
                    resp += 25.00;
                }if(checkBox4.isChecked()){
                    resp += 2.50;
                }if(checkBox5.isChecked()){
                    resp += 8.00;
                }if(checkBox6.isChecked()){
                    resp += 5.00;
            }
                Alerta(resp);
            }
        });


    }
    public void Alerta(Double res){
        AlertDialog.Builder resposta = new AlertDialog.Builder(MainActivity.this);
        resposta.setTitle("Total da compra");
        resposta.setMessage("Deu: "+res);
        resposta.setNeutralButton("Ok", null);
        resposta.show();
    }
}
