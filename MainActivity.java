package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7;
    Button btn1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.stname);
        ed2 = findViewById(R.id.mark1);
        ed3 = findViewById(R.id.mark2);
        ed4 = findViewById(R.id.mark3);
        ed5 = findViewById(R.id.total);
        ed6 = findViewById(R.id.cutoff);
        ed7 = findViewById(R.id.grade);
        btn1 = findViewById(R.id.button);
        btn1.setOnClickListener(v -> stmarks());


    }
    public void stmarks()
    {
        float m1,m2,m3;
        float tot;
        double cutoff;
        m1 = Integer.parseInt(ed2.getText().toString());
        m2 = Integer.parseInt(ed3.getText().toString());
        m3 = Integer.parseInt(ed4.getText().toString());
        tot = m1 + m2 + m3;
        ed5.setText(String.valueOf(tot));
        cutoff = m1 + ((m2 + m3)/2);
        ed6.setText(String.valueOf(cutoff));
        if(cutoff > 75)
        {
            ed7.setText("A");
        }
        else if(cutoff > 65)
        {
            ed7.setText("B");
        }
        else if(cutoff > 55)
        {
            ed7.setText("C");
        }
        else if(cutoff > 40)
        {
            ed7.setText("S");
        }
        else
        {
            ed7.setText("F");
        }
    }

}

