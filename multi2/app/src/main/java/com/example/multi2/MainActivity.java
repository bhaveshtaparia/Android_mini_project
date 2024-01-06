package com.example.multi2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button _0;
private Button _1;
    private Button _2;
    private Button _3;
    private Button _4;
    private Button _5;
    private Button _6;
    private Button _7;
    private Button _8;
    private Button _9;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        _0=findViewById(R.id._0);
        _1=findViewById(R.id._1);
        _2=findViewById(R.id._2);
        _3=findViewById(R.id._3);
        _4=findViewById(R.id._4);
        _5=findViewById(R.id._5);
        _6=findViewById(R.id._6);
        _7=findViewById(R.id._7);
        _8=findViewById(R.id._8);
        _9=findViewById(R.id._9);
listen(_0,textView,0);listen(_1,textView,1);listen(_2,textView,2);listen(_3,textView,3);listen(_4,textView,4);
        listen(_5,textView,5);listen(_6,textView,6);listen(_7,textView,7);listen(_8,textView,8);listen(_9,textView,9);
    }

    public static void listen(Button a ,TextView T,int i){
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
//                int m=0;
//                T.setText(""+m+""+i);
//                m=i;
                T.setText(""+i);

            }
        });
//        return i;
    }
}