package com.example.aulaindents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class recebe_dado extends AppCompatActivity {
    Intent iten;
    TextView dadorecebido, tcpf, tende,temail;
    Button toback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebe_dado);
        String recebendo,cpf,ende,email;
        dadorecebido = (TextView) findViewById(R.id.dadorecebido);
        tcpf = (TextView) findViewById(R.id.tcpf);
        tende = (TextView) findViewById(R.id.tende);
        temail = (TextView) findViewById(R.id.temail);
        toback = (Button) findViewById(R.id.toback);
        iten=getIntent();


        recebendo = iten.getStringExtra("dados");
        cpf = iten.getStringExtra("cpf");
        ende = iten.getStringExtra("ende");
        email = iten.getStringExtra("email");
        dadorecebido.setText(String.valueOf(recebendo));
        tcpf.setText(String.valueOf(cpf));
        tende.setText(String.valueOf(ende));
        temail.setText(String.valueOf(email));



        toback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
