package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity2 extends AppCompatActivity {

    private String nome,email;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        Intent it = getIntent();
        nome = it.getStringExtra("nome");
        email = it.getStringExtra("email");

    }



    public void Proximo2 (View v) {

        Intent it = new Intent(getApplicationContext(), MainActivity3.class);
        it.putExtra("nome", nome);
        it.putExtra("email", email);
        startActivity(it);



    }
}