package com.example.vgb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Confusion extends AppCompatActivity {
private ListView listView;
private EditText ed;
private Button button5;
private  Button button6;
private TextView textView13;
int m=0;
String i="choice";
    String arr[]={i,"","","","","","","","","",""};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confusion);
        listView=findViewById(R.id.listview);
        ed=findViewById(R.id.ed);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        textView13=findViewById(R.id.textView13);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    i=ed.getText().toString();
                    if(i.equals("")){
                        Toast.makeText(Confusion.this, "Please enter some value", Toast.LENGTH_SHORT).show();
                    }
                    else {


                        arr[m] = i;
                        m++;
                        ed.setText("");
                        Toast.makeText(Confusion.this, "yaa " + i + " is set", Toast.LENGTH_SHORT).show();
                        if (m > 11) {
                            Toast.makeText(Confusion.this, "Sorry,👀 your Confusion level is high for that we cannot help you", Toast.LENGTH_SHORT).show();
                        }
                    }
                }catch (Exception e){
                    Toast.makeText(Confusion.this, "Sorry,👀 your Confusion level is high for that we cannot help you", Toast.LENGTH_SHORT).show();
                }

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Random r=new Random();
                    int k=r.nextInt(m);
                    textView13.setText("suggesion is : 👀 "+arr[k]);
                }catch (Exception e){
                    Toast.makeText(Confusion.this, "Please fill some choice", Toast.LENGTH_SHORT).show();
                }

            }
        });

        ArrayAdapter ad= new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
        listView.setAdapter(ad);
    }
}