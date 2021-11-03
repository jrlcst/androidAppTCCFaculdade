package com.example.hotelapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtEmail,edtSenha;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEmail = findViewById(R.id.edtEmail);
        edtSenha = findViewById(R.id.edtSenha);
        btnLogin = findViewById(R.id.btnLogin);

        edtEmail.requestFocus();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edtEmail.getText().toString().isEmpty() || edtSenha.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Preencha os campos", Toast.LENGTH_LONG).show();
                    edtEmail.requestFocus();
                }else if(edtEmail.getText().toString().equals("97") &&
                         edtSenha.getText().toString().equals("31546988741")){

                    Intent intent = new Intent(getApplicationContext(),Principal.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this, "Login Incorreto!", Toast.LENGTH_LONG).show();
                    edtEmail.requestFocus();
                }


            }
        });



    }
}