package com.example.braillingistic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class game4 extends AppCompatActivity {

    ImageView a,b,c,d,e,f;

    String [] abc = new String[27];
    int [] braille = new int[27];
    String [] opcions = new String[4];
    int randAux =0;
    TextView opa,opb,opc,opd;

    int rand =0,correcta=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game4);

        a= (ImageView) findViewById(R.id.afour); b= (ImageView) findViewById(R.id.bfour); c= (ImageView) findViewById(R.id.cfour);
        d= (ImageView) findViewById(R.id.dfour); e= (ImageView) findViewById(R.id.efour); f= (ImageView) findViewById(R.id.ffour);

        opa = (TextView) findViewById(R.id.aop); opb = (TextView) findViewById(R.id.bop);
        opc = (TextView) findViewById(R.id.cop); opd = (TextView) findViewById(R.id.dop);

        abc[0] = "A";        abc[1] = "B";        abc[2] = "C";        abc[3] = "D";
        abc[4] = "E";        abc[5] = "F";        abc[6] = "G";        abc[7] = "H";
        abc[8] = "I";        abc[9] = "J";        abc[10] = "K";        abc[11] = "L";
        abc[12] = "M";        abc[13] = "N";        abc[14] = "Ñ";        abc[15] = "O";
        abc[16] = "P";        abc[17] = "Q";        abc[18] = "R";        abc[19] = "S";
        abc[20] = "T";        abc[21] = "U";        abc[22] = "V";        abc[23] = "W";
        abc[24] = "X";        abc[25] = "Y";        abc[26] = "Z";

        braille [0] =9100000;        braille [1] =9101000;        braille [2] =9110000;        braille [3] =9110100;
        braille [4] =9100100;        braille [5] =9111000;        braille [6] =9111100;        braille [7] =9101100;
        braille [8] =9011000;        braille [9] =9011100;        braille [10] =9100010;        braille [11] =9101010;
        braille [12] =9110010;        braille [13] =9110110;        braille [14] =9111101;        braille [15] =9100110;
        braille [16] =9111010;        braille [17] =9111110;        braille [18] =9101110;        braille [19] =9011010;
        braille [20] =9011110;        braille [21] =9100011;        braille [22] =9101011;        braille [23] =9011101;
        braille [24] =9110011;        braille [25] =9110111;        braille [26] =9100111;

        inicializar();

        opa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(correcta==0){
                    inicializar();
                }else{
                    opa.setText("");
                }
            }
        });
        opb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(correcta==1){
                    inicializar();
                }else{
                    opb.setText("");
                }
            }
        });
        opc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(correcta==2){
                    inicializar();
                }else{
                    opc.setText("");
                }
            }
        });
        opd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(correcta==3){
                    inicializar();
                }else{
                    opd.setText("");
                }
            }
        });

    }


    public void inicializar(){
        opcions[0]=".";opcions[1]=".";opcions[2]=".";opcions[3]=".";

        rand = (int) (Math.random() * 26);

        letters(braille[rand]);

        randAux = (int) (Math.random() * 3);
        correcta = randAux;

        opcions[randAux]=abc[rand];

        int cont =0;

        while(cont<3){
            rand = (int) (Math.random() * 26);
            if(abc[rand]==opcions[0]|| abc[rand]==opcions[1]|| abc[rand]==opcions[2]|| abc[rand]==opcions[3]){

            }else{
                if(opcions[0]=="."){
                    opcions[0]=abc[rand];
                    cont++;
                }else if(opcions[1]=="."){
                    opcions[1]=abc[rand];
                    cont++;
                }else if(opcions[2]=="."){
                    opcions[2]=abc[rand];
                    cont++;
                }else if(opcions[3]=="."){
                    opcions[3]=abc[rand];
                    cont++;
                }
            }
        }

        opa.setText(opcions[0]);
        opb.setText(opcions[1]);
        opc.setText(opcions[2]);
        opd.setText(opcions[3]);
    }

    public void letters(int i){
        int num =i;
        //Izquierda 1
        if ((num-9000000)>=100000){
            num=num-100000;
            b.setImageResource(R.drawable.red);
        }else{
            b.setImageResource(R.drawable.nope);
        }
        //Derecha 1
        if(num-9000000>=10000){
            num=num-10000;
            a.setImageResource(R.drawable.red);
        }else {
            a.setImageResource(R.drawable.nope);
        }
        //Izquierda 2
        if(num-9000000>=1000){
            num=num-1000;
            d.setImageResource(R.drawable.red);
        }else{
            d.setImageResource(R.drawable.nope);
        }
        //Derecha 2
        if(num-9000000>=100){
            num=num-100;
            c.setImageResource(R.drawable.red);
        }else{
            c.setImageResource(R.drawable.nope);
        }
        //Izquierda 3
        if(num-9000000>=10){
            num=num-10;
            f.setImageResource(R.drawable.red);
        }else{
            f.setImageResource(R.drawable.nope);
        }
        //Derecha 3
        if(num-9000000>=1){
            e.setImageResource(R.drawable.red);
        }else{
            e.setImageResource(R.drawable.nope);
        }
    }


}
