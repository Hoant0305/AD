package com.example.intent1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4  extends AppCompatActivity {
    TextView Kq;
    EditText Bankinh;
    Button Tínhbk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Bankinh = findViewById(R.id.bk1);
        Kq = findViewById(R.id.kq);
        Tínhbk = findViewById(R.id.bt3);
        Tínhbk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(Bankinh.getText().toString());
                float b = (float) (a*a*Math.PI);
                float c = (float) (2*a*Math.PI);
                String d = String.format("%.2f", b);
                String e = String.format("%.2f",c);
                Kq.setText("chu vi :"+e+"\n diện tích:"+d);


            }
        });
    }
}