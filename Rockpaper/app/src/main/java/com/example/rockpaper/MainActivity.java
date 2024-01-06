package com.example.rockpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
public class MainActivity extends AppCompatActivity {
private Button button;
    private Button button2;
    private Button button3;
    private TextView computer;
    private  TextView user;
    private  TextView display;
    private EditText point;
    private Button button4;
    String arr[]={"R","P","S"};
    int a=0,com=0,user1=0,p=10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        computer = findViewById(R.id.computer);
        user = findViewById(R.id.user);
        display = findViewById(R.id.display);
        point=findViewById(R.id.point);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    p = 10;
                    String points = point.getText().toString();
                    p = Integer.parseInt(points);
                    if (p <= 0) {
                        Toast.makeText(MainActivity.this, " 0 is not possible so for this we set points as a 10 ", Toast.LENGTH_SHORT).show();
                        p = 10;
                    } else if (p > 0) {
                        Toast.makeText(MainActivity.this, "you set a:" + p + "points of game", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Please set good points , now we are set point 10 ", Toast.LENGTH_SHORT).show();
                        p = 10;
                    }
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "please set atleast some value", Toast.LENGTH_SHORT).show();
                p=10;
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = 1;

                Random r = new Random();
                int b = r.nextInt(3);
                String n = arr[b];

                if ((n == "P" && a == 2) || (n == "S" && a == 3) || (n == "R" && a == 1)) {

                    display.setText("choice of coumpter is " + n + "\n Tie ");
                    computer.setText("" + com);
                    user.setText("" + user1);
                } else if ((n == "P" && a == 3) || (n == "S" && a == 1) || (n == "R" && a == 2)) {
                    user1++;

                    display.setText("choice of coumpter is " + n + "\n winner is user ");

                    computer.setText("" + com);
                    user.setText("" + user1);
                    if(user1>=p){
                        display.setText("\n winner is user It reach first "+p+" point");
                        user1=0;
                        com=0;
                    }
                    if(com>=p){
                        display.setText("\n winner is Computer It reach first "+p+" point");
                        user1=0;
                        com=0;
                    }

                } else {
                    com++;

                    display.setText("choice of coumpter is " + n + "\n winner is Computer");
                    computer.setText("" + com);
                    user.setText("" + user1);
                    if(user1>=p){
                        display.setText("\n winner is user It reach first "+p+" point");
                        user1=0;
                        com=0;
                    }
                    if(com>=p){
                        display.setText("\n winner is Computer It reach first "+p+" point");
                        user1=0;
                        com=0;
                    }
                }
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = 2;

                Random r = new Random();
                int b = r.nextInt(3);
                String n = arr[b];

                if ((n == "P" && a == 2) || (n == "S" && a == 3) || (n == "R" && a == 1)) {

                    display.setText("choice of coumpter is " + n + "\n Tie ");
                    computer.setText("" + com);
                    user.setText("" + user1);
                } else if ((n == "P" && a == 3) || (n == "S" && a == 1) || (n == "R" && a == 2)) {
                    user1++;

                    display.setText("choice of coumpter is " + n + "\n winner is user ");

                    computer.setText("" + com);
                    user.setText("" + user1);
                    if(user1>=p){
                        display.setText("\n winner is user It reach first "+p+" point");
                        user1=0;
                        com=0;
                    }
                    if(com>=p){
                        display.setText("\n winner is Computer It reach first"+ p+" point");
                        user1=0;
                        com=0;
                    }
                } else {
                    com++;

                    display.setText("choice of coumpter is " + n + "\n winner is Computer");
                    computer.setText("" + com);
                    user.setText("" + user1);
                    if(user1>=p){
                        display.setText("\n winner is user It reach first "+p+" point");
                        user1=0;
                        com=0;
                    }
                    if(com>=p){
                        display.setText("\n winner is Computer It reach first "+p+" point");
                        user1=0;
                        com=0;
                    }
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a = 3;

                Random r = new Random();
                int b = r.nextInt(3);
                String n = arr[b];

                if ((n == "P" && a == 2) || (n == "S" && a == 3) || (n == "R" && a == 1)) {

                    display.setText("choice of coumpter is " + n + "\n Tie ");
                    computer.setText("" + com);
                    user.setText("" + user1);
                } else if ((n == "P" && a == 3) || (n == "S" && a == 1) || (n == "R" && a == 2)) {
                    user1++;

                    display.setText("choice of coumpter is " + n + "\n winner is user ");

                    computer.setText("" + com);
                    user.setText("" + user1);
                    if(user1>=p){
                        display.setText("\n winner is user It reach first "+p+" point");
                        user1=0;
                        com=0;
                    }
                    if(com>=p){
                        display.setText("\n winner is Computer It reach first "+p+" point");
                        user1=0;
                        com=0;
                    }
                } else {
                    com++;

                    display.setText("choice of coumpter is " + n + "\n winner is Computer");
                    computer.setText("" + com);
                    user.setText("" + user1);
                    if(user1>=p){
                        display.setText("\n winner is user It reach first "+p+" point");
                        user1=0;
                        com=0;
                    }
                    if(com>=p){
                        display.setText("\n winner is Computer It reach first "+p+" point");
                        user1=0;
                        com=0;
                    }
                }

            }

        });
}
}