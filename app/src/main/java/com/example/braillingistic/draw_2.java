package com.example.braillingistic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class draw_2 extends AppCompatActivity {

    ImageView left, rigth, a,b,c,d,e,f;
    TextView txt;
    int aux=9000000;
    int [] valores =new int[6];
    String [] abc = new String[27];
    int [] braille = new int[27];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_2);

        txt = (TextView) findViewById(R.id.textdrwa2);
        a= (ImageView) findViewById(R.id.draa); b= (ImageView) findViewById(R.id.drab); c= (ImageView) findViewById(R.id.drac);
        d= (ImageView) findViewById(R.id.drad); e= (ImageView) findViewById(R.id.drae); f= (ImageView) findViewById(R.id.draf);

        abc[0] = "A";        abc[1] = "B";        abc[2] = "C";        abc[3] = "D";
        abc[4] = "E";        abc[5] = "F";        abc[6] = "G";        abc[7] = "H";
        abc[8] = "I";        abc[9] = "J";        abc[10] = "K";        abc[11] = "L";
        abc[12] = "M";        abc[13] = "N";        abc[14] = "Ñ";        abc[15] = "O";
        abc[16] = "P";        abc[17] = "Q";        abc[18] = "R";        abc[19] = "S";
        abc[20] = "T";        abc[21] = "U";        abc[22] = "V";        abc[23] = "W";
        abc[24] = "X";        abc[25] = "Y";        abc[26] = "Z";

        valores[0]=0;           valores[1]=0;           valores[2]=0;           valores[3]=0;           valores[4]=0;           valores[5]=0;

        braille [0] =9100000;        braille [1] =9101000;        braille [2] =9110000;        braille [3] =9110100;
        braille [4] =9100100;        braille [5] =9111000;        braille [6] =9111100;        braille [7] =9101100;
        braille [8] =9011000;        braille [9] =9011100;        braille [10] =9100010;        braille [11] =9101010;
        braille [12] =9110010;        braille [13] =9110110;        braille [14] =9111101;        braille [15] =9100110;
        braille [16] =9111010;        braille [17] =9111110;        braille [18] =9101110;        braille [19] =9011010;
        braille [20] =9011110;        braille [21] =9100011;        braille [22] =9101011;        braille [23] =9011101;
        braille [24] =9110011;        braille [25] =9110111;        braille [26] =9100111;

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valores[0]=validar(valores[0]);
                if (valores[0]==0) {
                    a.setImageResource(R.drawable.nope);
                    aux=aux-10000;
                }else {
                    a.setImageResource(R.drawable.red);
                    aux=aux+10000;
                }
                letra();
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valores[1]=validar(valores[1]);
                if (valores[1]==0) {
                    b.setImageResource(R.drawable.nope);
                    aux=aux-100000;
                }else {
                    b.setImageResource(R.drawable.red);
                    aux=aux+100000;
                }
                letra();
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valores[2]=validar(valores[2]);
                if (valores[2]==0) {
                    c.setImageResource(R.drawable.nope);
                    aux=aux-100;
                }else {
                    c.setImageResource(R.drawable.red);
                    aux=aux+100;
                }
                letra();
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valores[3]=validar(valores[3]);
                if (valores[3]==0) {
                    d.setImageResource(R.drawable.nope);
                    aux=aux-1000;
                }else {
                    d.setImageResource(R.drawable.red);
                    aux=aux+1000;
                }
                letra();
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valores[4]=validar(valores[4]);
                if (valores[4]==0) {
                    e.setImageResource(R.drawable.nope);
                    aux=aux-1;
                }else {
                    e.setImageResource(R.drawable.red);
                    aux=aux+1;
                }
                letra();
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valores[5]=validar(valores[5]);
                if (valores[5]==0) {
                    f.setImageResource(R.drawable.nope);
                    aux=aux-10;
                }else {
                    f.setImageResource(R.drawable.red);
                    aux=aux+10;
                }
                letra();
            }
        });

    }

    public int validar(int valor) {
        int i = valor;
        if (i == 0) {
            i = 1;
        }else{
            i = 0;
        }
        return i;
    }

    public void letra(){
        int verificar = 0;

        for (int i=0; i<27; i++){
            if (aux==braille[i]) {
                txt.setText(abc[i]);
                verificar=1;
            }
        }
        if (verificar==0){
            txt.setText("Letra no disponible");
        }
    }
}