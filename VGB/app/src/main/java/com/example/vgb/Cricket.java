package com.example.vgb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Cricket extends AppCompatActivity {


    public  static final String Extra_Name="com.example.vgb.extra.NAME";
private Button button4;
private TextView textView4;
private ImageButton imageButton;
private ImageButton imageButton2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cricket);
        button4=findViewById(R.id.button4);
        textView4=findViewById(R.id.textView4);
        imageButton=findViewById(R.id.imageButton);
        imageButton2=findViewById(R.id.imageButton2);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView4.setText("Head or Tail ?");
                imageButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(Cricket.this, "let start game", Toast.LENGTH_SHORT).show();

                        Intent intent=new Intent(Cricket.this,LetsStart.class);
                        String a="head";
                        intent.putExtra(Extra_Name,a);
                        startActivity(intent);
                    }
                });
                imageButton2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(Cricket.this, "let start the Game", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(Cricket.this,LetsStart.class);
                        String a="tail";
                        intent.putExtra(Extra_Name,a);
                        startActivity(intent);
                    }
                });
            }

        });
    }
}