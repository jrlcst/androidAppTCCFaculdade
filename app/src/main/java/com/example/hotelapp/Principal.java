package com.example.hotelapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Principal extends AppCompatActivity {

    ImageButton checkInButton,checkoutButton,servicoButton,ajudaButton,limpezaButton,nperturbeButton;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        checkInButton = findViewById(R.id.checkInButton);
        checkoutButton = findViewById(R.id.checkoutButton);
        servicoButton = findViewById(R.id.servicoButton);
        ajudaButton = findViewById(R.id.ajudaButton);
        limpezaButton = findViewById(R.id.limpezaButton);
        nperturbeButton = findViewById(R.id.nperturbeButton);

        checkInButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Principal.this, "Check-In Feito!!", Toast.LENGTH_LONG).show();
            }
        });
        checkoutButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Principal.this, "Check-Out Feito!!", Toast.LENGTH_LONG).show();
            }
        });
        servicoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Principal.this, "Servico Solicitado, seu Concilierge ligará em breve.", Toast.LENGTH_LONG).show();
            }
        });
        ajudaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Principal.this, "Vamos te ligar, fique atento ao telefone!!", Toast.LENGTH_LONG).show();
            }
        });
        limpezaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Principal.this, "Uma agente de limpeza foi encaminhada ao quarto.", Toast.LENGTH_LONG).show();
            }
        });
        nperturbeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Principal.this, "Não faremos solicitaçoes.", Toast.LENGTH_LONG).show();
            }
        });
    }
    public void sair(View view) {
        finish();
    }
}