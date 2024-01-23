package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    private String nome,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Intent it = getIntent();
        nome = it.getStringExtra("nome");
        email = it.getStringExtra("email");
    }
    public void Proximo4 (View v){

        Intent it = new Intent(getApplicationContext(), MainActivity5.class);
        it.putExtra("nome", nome);
        it.putExtra("email", email);
        startActivity(it);

    }
}