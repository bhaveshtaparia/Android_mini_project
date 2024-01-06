package com.example.practise3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button button;
private EditText editTextTextPersonName2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        editTextTextPersonName2=findViewById(R.id.editTextTextPersonName2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a=editTextTextPersonName2.getText().toString();
                Toast.makeText(MainActivity.this, "Good Morning "+a, Toast.LENGTH_SHORT).show();
            }
        });

    }
}