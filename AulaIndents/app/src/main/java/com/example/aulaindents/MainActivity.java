package com.example.aulaindents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Intent iten;
    Button gonext;
    EditText dados,dadocpf,dadosEndere,dadosEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gonext= (Button)findViewById(R.id.gonext);
        dados= (EditText)findViewById(R.id.dados);
        dadocpf= (EditText)findViewById(R.id.dadocpf);
        dadosEndere= (EditText)findViewById(R.id.dadosEndere);
        dadosEmail= (EditText)findViewById(R.id.dadosEmail);

        gonext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String recebido, cpf, ende, email;
                recebido = dados.getText().toString();
                cpf = dadosEmail.getText().toString();
                ende = dadosEmail.getText().toString();
                email = dadosEmail.getText().toString();



                iten = new Intent(MainActivity.this, recebe_dado.class);

                iten.putExtra("dados",recebido);
                iten.putExtra("cpf",cpf);
                iten.putExtra("ende",ende);
                iten.putExtra("email",email);

                startActivity(iten);

            }
        });

    }
}
