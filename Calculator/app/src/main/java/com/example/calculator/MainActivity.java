package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.time.LocalDate;

public class MainActivity extends AppCompatActivity {
private Button b1;
private  double c,d=0,e;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b0;
    private Button bc;
    private Button back;
    private Button be;
    private Button ba;
    private Button bs;
    private Button bm;
    private Button bd;
    private  Button pi;
    private TextView textView2;
    private TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        bc=findViewById(R.id.bc);
        be=findViewById(R.id.be);
        ba=findViewById(R.id.ba);
        bs=findViewById(R.id.bs);
        bm=findViewById(R.id.bm);
        bd=findViewById(R.id.bd);
        back=findViewById(R.id.back);
        textView2=findViewById(R.id.textView2);
        textView=findViewById(R.id.textView);
        pi=findViewById(R.id.pi);

        calculator(b0,0);
        calculator(b1,1);
        calculator(b2,2);
        calculator(b3,3);
        calculator(b4,4);calculator(b5,5);calculator(b6,6);
        calculator(b7,7);calculator(b8,8);calculator(b9,9);
        run(ba,1);run(bs,2);run(bm,3);run(bd,4);

        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    c = Math.PI;
                    textView2.setText("" + c);
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "you are doing wrong calculation", Toast.LENGTH_SHORT).show();
                    c=0;
                    textView2.setText(""+c);
                }
            }
        });


        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView2.setText("");
                textView.setText("");
                c=0;
                d=0;
                e=0;
            }
        });

back.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        if(c==0 ||c==1||c==2||c==3||c==4||c==4||c==5||c==6||c==7||c==8||c==9){
            textView2.setText("");
            c=0;
        }
        else{
            c = (int) (c / 10);
            textView2.setText(""+c);
        }
    }
});

        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
try{
    if(e==1){
        c=(d+c);
        textView2.setText(""+(c));
    }
    if(e==2){
        c=d-c;
        textView2.setText(""+(c));
    }
    if(e==3){
        c=d*c;
        textView2.setText(""+(c));
    }
    if(e==4){
        if(c==0){
            Toast.makeText(MainActivity.this, "infinity", Toast.LENGTH_SHORT).show();
        }
        else{
            c=d/c;
            textView2.setText(""+(c));
        }

    }
}catch (Exception e){
    textView2.setText("");
    c=0;
    d=0;
}


            }
        });

    }
    public void run(Button b,int f){

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    d = c;

                    e = f;
                    if (e == 1) textView.setText("+");
                    if (e == 2) textView.setText("-");
                    if (e == 3) textView.setText("X");
                    if (e == 4) textView.setText("%");
                    textView2.setText("");

                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "please give accurate calculation", Toast.LENGTH_SHORT).show();
                    textView.setText("");
                }
            }
        });

    }
    public void calculator(Button b,int a){

      b.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              try {
                  textView2.append("" + a);
                  String a = textView2.getText().toString();
                  c = Integer.parseInt(a);
              }catch (Exception e){
                  textView2.append("" + a);
                  Toast.makeText(MainActivity.this, "please give small value you are trying to harm the  calculator", Toast.LENGTH_SHORT).show();
              }
          }
      });


    }
}