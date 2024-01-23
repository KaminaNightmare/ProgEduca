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

    public class GmailValidador {

        public static boolean validarEmailGmail(String email) {
            // Expressão regular para validar um endereço de e-mail do Gmail
            String regex = "^[a-zA-Z0-9_]+@gmail\\.com$";

            // Compilar a expressão regular em um padrão
            Pattern pattern = Pattern.compile(regex);

            // Criar um objeto Matcher para comparar o padrão com o e-mail fornecido
            Matcher matcher = pattern.matcher(email);

            // Retornar true se o e-mail corresponder ao padrão, indicando que é um Gmail válido
            return matcher.matches();
        }



    public void Proximo(View v){

        Intent it = new Intent(getApplicationContext(), MainActivity2.class);
        it.putExtra("nome",edtNome.getText().toString());
        it.putExtra("email", edtEmail.getText().toString());
        startActivity(it);

    }
}