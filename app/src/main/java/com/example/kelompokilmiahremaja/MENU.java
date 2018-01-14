package com.example.kelompokilmiahremaja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MENU extends AppCompatActivity {
    Button bt1, bt2, bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        bt1 = (Button) findViewById(R.id.Button1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MENU.this, InputData.class));
                Toast.makeText(MENU.this, "Please input your data", Toast.LENGTH_SHORT).show();

            }
        });

        bt2 = (Button) findViewById(R.id.Button2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(MENU.this,SahabatNabi.class));
                startActivity(new Intent(MENU.this, SahabatNabi.class));
                Toast.makeText(MENU.this, "Selamat membaca", Toast.LENGTH_SHORT).show();

            }
        });

        bt3 = (Button) findViewById(R.id.Button3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MENU.this, developer.class));
                Toast.makeText(MENU.this, "My Biodata", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
