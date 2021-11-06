package com.example.braillingistic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class third_1 extends AppCompatActivity {

    Button game1;
    Button game2;
    ImageView lupa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_1);

        game1= (Button) findViewById(R.id.button5);

        game1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(third_1.this, game1.class);
                startActivity(intent);

            }
        });

        game2= (Button) findViewById(R.id.button6);

        game2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent (third_1.this, game2.class);
                startActivity(intent);

            }
        });

        lupa = (ImageView) findViewById(R.id.lupa);

        lupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent (third_1.this, draw_1.class);
                startActivity(intent);
            }
        });
    }
}
