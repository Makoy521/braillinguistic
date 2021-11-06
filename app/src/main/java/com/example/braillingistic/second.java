package com.example.braillingistic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second extends AppCompatActivity {

    Button thirdOne;
    Button thirdTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        thirdOne= (Button) findViewById(R.id.game3);

        thirdOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent (second.this, third_1.class);
                startActivity(intent);

            }
        });

        thirdTwo= (Button) findViewById(R.id.game4);

        thirdTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent (second.this, third_2.class);
                startActivity(intent);

            }
        });
    }
}
