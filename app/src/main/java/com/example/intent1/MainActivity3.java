package com.example.intent1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView Kq;
    EditText c1,c2,c3;
    Button Tínhtg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);

        Kq = findViewById(R.id.tv5);
        Tínhtg = findViewById(R.id.bt2);
        Tínhtg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(c1.getText().toString());
                float b = Float.parseFloat(c2.getText().toString());
                float c = Float.parseFloat(c3.getText().toString());
                float d = a + b + c;
                float p = (float) Math.sqrt(d);
                float e = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c)) ;
                String diems = String.format("%.2f", e);
                Kq.setText("chu vi :"+String.valueOf(d)+"\n diện tích:"+diems);



            }
        });
    }
}