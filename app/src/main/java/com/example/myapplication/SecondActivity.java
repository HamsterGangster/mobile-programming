package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
       setTitle("Second 액티비티");

    Button btnReturn = (Button) findViewById(R.id.btnReturn);
    btnReturn.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            System.out.printf("Back into FirstActivity");
            finish();
            }
        });
    Button btnEnter = (Button) findViewById(R.id.btnEnter);
    btnEnter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.printf("Go into ThirdActivity");
                Intent intent = new Intent(getApplicationContext(),
                        ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
}