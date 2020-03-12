package com.example.calculanota;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtNome, txtSobre, nota1, nota2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        txtNome = (EditText) findViewById(R.id.txtNome);
        txtSobre = (EditText) findViewById(R.id.txtsobre);
        nota1 = (EditText) findViewById(R.id.nota1);
        nota2 = (EditText) findViewById(R.id.nota2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double primnota = Double.parseDouble(nota1.getText().toString());
                double segnota = Double.parseDouble(nota2.getText().toString());
                String nome = txtNome.getText().toString();
                String sobre = txtSobre.getText().toString();
                double media = (primnota + segnota) / 2;

                if(media<6){
                    Alerta(media,nome+" "+sobre+", você foi reprovado");
                }
                else if(media>6.8 && media<7){
                    Alerta(media,nome+" "+sobre+ ", foi quase! Você esta de recuperação!");
                }
                else if(media==7){
                    Alerta(media,nome+" "+sobre+", você passou na média!");
                }else if(media==10){
                Alerta(media," Uau! "+nome+" "+sobre+", você passou com nota máxima!");
                }else{
                    Alerta(media,nome+" "+sobre+", Você passou!");
                }
            }
        });

    }
    public void Alerta(Double res, String msg){
        AlertDialog.Builder resposta = new AlertDialog.Builder(MainActivity.this);
        resposta.setTitle(msg);
        resposta.setMessage("Sua nota: "+res);
        resposta.setNeutralButton("Ok", null);
        resposta.show();
    }
}
