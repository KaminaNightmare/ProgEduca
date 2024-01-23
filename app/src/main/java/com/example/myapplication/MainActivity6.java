package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity6 extends AppCompatActivity {

    private String nome, email;
    ImageView imageView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        imageView=findViewById(R.id.imageView9);



        Intent it = getIntent();
        nome = it.getStringExtra("nome");
        email = it.getStringExtra("email");

    }

    public void Rodar (View v ) {

        imageView.setImageResource(R.drawable.imagem_6);

    }
}