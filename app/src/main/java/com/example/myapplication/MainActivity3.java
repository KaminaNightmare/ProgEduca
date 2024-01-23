package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity3 extends AppCompatActivity {

    private String nome,email;


    RadioButton rbtn1,rbtn2,rbtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        rbtn1 = findViewById(R.id.rbtn1);
        rbtn2 = findViewById(R.id.rbtn2);
        rbtn3 = findViewById(R.id.rbtn3);
        

        Intent it = getIntent();
        nome = it.getStringExtra("nome");
        email = it.getStringExtra("email");

    }



 public void Proximo3 (View v) {

        Intent it = new Intent(getApplicationContext(), MainActivity4.class);
        it.putExtra("nome", nome);
        it.putExtra("email", email);
        startActivity(it);



    }
}