package com.example.intent1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView Kq;
    EditText Chieudai,Chieurong;
    Button Tínhcn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Chieudai = findViewById(R.id.et1);
        Chieurong = findViewById(R.id.et2);
        Kq = findViewById(R.id.tv4);
        Tínhcn = findViewById(R.id.bt1);
        Tínhcn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(Chieudai.getText().toString());
                float b = Float.parseFloat(Chieurong.getText().toString());
                float c = 2*(a+b);
                float d= a*b;
                Kq.setText("chu vi :"+String.valueOf(c)+"\n diện tích:"+d);


            }
        });
    }
}