package com.example.braillingistic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class third_2 extends AppCompatActivity {

    Button game1;
    Button game2;

    ImageView lupa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_2);

        game1= (Button) findViewById(R.id.game3);

        game1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(third_2.this, game3.class);
                startActivity(intent);

            }
        });

        game2= (Button) findViewById(R.id.game4);

        game2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent (third_2.this, game4.class);
                startActivity(intent);

            }
        });

        lupa= (ImageView) findViewById(R.id.lupa2);

        lupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent (third_2.this, draw_2.class);
                startActivity(intent);
            }
        });

    }
}
