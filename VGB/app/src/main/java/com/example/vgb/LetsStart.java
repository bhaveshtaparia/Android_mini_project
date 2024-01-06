package com.example.vgb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class LetsStart extends AppCompatActivity {
private TextView textView5;
private  TextView textView6;
private Button b0;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b6;
    private TextView textView8;
    private TextView textView9;
    private TextView textView10;
    private TextView textView11;
    int clc,bol=0,run,total=0,target,winp,winc;
    String choice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lets_start);
        textView5=findViewById(R.id.textView5);
        textView6=findViewById(R.id.textView6);
        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b6=findViewById(R.id.b6);
        textView8=findViewById(R.id.textView8);
        textView9=findViewById(R.id.textView9);
        textView10=findViewById(R.id.textView10);
        textView11=findViewById(R.id.textView11);
        Intent intent=getIntent();
        String a=intent.getStringExtra(Cricket.Extra_Name);

        String arr[]={"head","tail"};
        String arr2[]={"Batting","Filding"};
        Random random=new Random();
        int b=random.nextInt(2);
        int c=random.nextInt(2);
        String w=arr[b];
        String compter=arr2[c];

        if(a.equals(w)){
        textView5.setText(w+" is the Right choice ,Congratulation you win, you choose Batting");
        choice="Batting";
        }
        else{
            textView5.setText("oops "+w +" is the Right choice !  Sorry you lose, apposion choose "+compter+" ");
            choice=compter;
            if(choice.equals("Batting")){
                choice="Filding";
            }
            else if(choice.equals("Filding")){
                choice="Batting";
            }

        }
        if(choice=="Batting"){
            textView6.setText("Batting");}
        if(choice=="Filding"){
            textView6.setText("Filding");}
        click(b0,0);click(b1,1);click(b2,2);click(b3,3);click(b4,4);
        click(b6,6);


    }
void click(Button b,int clicked){
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(LetsStart.this, "Start", Toast.LENGTH_SHORT).show();
                clc=clicked;
                Random random=new Random();
                int play[]={0,1,2,3,4,6};
                int bb=random.nextInt(6);
                int FdBa=play[bb];


                if(choice=="Batting"){
                    textView6.setText("Batting");
if(bol>=6){
//    textView9.setText("Game over-Target"+total);
    Toast.makeText(LetsStart.this, "Game over-"+total, Toast.LENGTH_SHORT).show();
    winp=total;
    target++;
    if(target==2) {
        if (winp > winc) {
            textView11.setText("You Win");
        }
        if (winp == winc) {
            textView11.setText("Tie");
        }
        if (winp < winc) {
            textView11.setText("You Lose");
        }
    }
    if(target==1){
        textView10.setText("target:-"+(total+1));
        choice="Filding";
        bol=0;
        total=0;
        textView9.setText(" ");


    }
}
else {


    if (clc == FdBa) {
        textView9.append("Out  ");
        run = 0;
        bol++;
        total = run + total;
        textView8.setText("" + total);
        winp=total;



    } else {
        int big = (FdBa > clc) ? FdBa : clc;
        int small = (FdBa < clc) ? FdBa : clc;
        run = big - small;
        total = run + total;
        bol++;
        textView9.append("" + run+"  ");
        textView8.setText("" + total);
        winp=total;
    }
}
                }
                if(choice=="Filding") {
                    textView6.setText("Filding");
                    if (bol >= 6) {

//                        textView9.setText("Game over-Target" + total);
                        Toast.makeText(LetsStart.this, "Game over-"+total, Toast.LENGTH_SHORT).show();
                        target++;
                        winc=total;
                        if(target==2) {
                            if (winp > winc) {
                                textView11.setText("You Win");
                            }
                            if (winp == winc) {
                                textView11.setText("Tie");
                            }
                            if (winp < winc) {
                                textView11.setText("You Lose");
                            }
                        }
                        if(target==1){
                            textView10.setText("target:-"+total);
                            choice="Batting";
                            bol=0;
                            total=0;
                            textView9.setText(" ");
                        }
                    } else {


                        if (clc == FdBa) {
                            textView9.append("Out  ");
                            run = 0;
                            bol++;
                            total = run + total;
                            textView8.setText("" + total);
                            winc=total;

                        } else {
                            int big = (FdBa > clc) ? FdBa : clc;
                            int small = (FdBa < clc) ? FdBa : clc;
                            run = big - small;
                            total = run + total;
                            bol++;
                            textView9.append("" + run+"  ");
                            textView8.setText("" + total);
                            winc=total;
                        }
                    }
                }
            }
        });
}
}