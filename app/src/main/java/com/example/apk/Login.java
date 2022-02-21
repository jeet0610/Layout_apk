package com.example.apk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText etmobile,passWord;
    Button btnLogin , signUp;
    SharedPreferences settings;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etmobile = findViewById(R.id.Email);
        passWord = findViewById(R.id.PassWord);
        btnLogin = findViewById(R.id.loginButton);

        settings = getSharedPreferences("test",0);
        editor = settings.edit();


        String Username = settings.getString("username","abc");
        String password = settings.getString("password","abc");


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Home.class);

                startActivity(intent);
                finish();



            }
        });

    }
}