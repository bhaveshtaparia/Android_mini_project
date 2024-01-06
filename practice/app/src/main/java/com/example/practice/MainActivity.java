package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     TextView text;
     EditText editTextNumber;
     EditText editTextNumber2;
     Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        android.widget.Toast.makeText(context:this,text: "Good morning", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Thanks for using this app", Toast.LENGTH_SHORT).show();
        text= findViewById(R.id.text);
        button=findViewById(R.id.button);
        editTextNumber=findViewById(R.id.editTextNumber);
        editTextNumber2=findViewById(R.id.editTextNumber2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=editTextNumber.getText().toString();
                String e=editTextNumber2.getText().toString();
                int a=Integer.parseInt(s);
                int b=Integer.parseInt(e);
                int c=a+b;
                text.setText("The addition of number is: "+c);

            }
        });
    }
}