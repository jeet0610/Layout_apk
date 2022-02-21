
package com.example.apk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {
    Button btnSamsung , btnRealMe,btnIphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnSamsung = findViewById(R.id.buttonSamsung);
        btnRealMe = findViewById(R.id.buttonRealMe);
        btnIphone = findViewById(R.id.buttoniphone);
        btnSamsung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "Samsung Details", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Samsung.class);

                startActivity(intent);



            }
        });
        btnRealMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "RealMe Details", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Realme.class);

                startActivity(intent);



            }
        });
        btnIphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "Iphone Details", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Iphone.class);

                startActivity(intent);



            }
        });

    }
}