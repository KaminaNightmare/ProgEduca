package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MainActivity extends AppCompatActivity {

    EditText edtNome,edtEmail;
    Button btnVamos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNome = findViewById(R.id.edtNome);
        edtEmail = findViewById(R.id.edtEmail);
        btnVamos = findViewById(R.id.btnVamos);

        btnVamos.setEnabled(false);

        if (edtEmail.getText().toString().equals(""))

            edtNome.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable s) {


                if (!edtNome.getText().toString().equals("")) {
                    btnVamos.setEnabled(true);
                } else {
                    btnVamos.setEnabled(false);
                }
            }
        });


}




    public void Proximo(View v){

        Intent it = new Intent(getApplicationContext(), MainActivity2.class);
        it.putExtra("nome",edtNome.getText().toString());
        it.putExtra("email", edtEmail.getText().toString());
        startActivity(it);

    }
}