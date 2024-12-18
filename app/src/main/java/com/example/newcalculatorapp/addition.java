package com.example.newcalculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class addition extends AppCompatActivity {
  Button btn1;
  EditText et1,et2;
  String n1,n2,result;
  int num1,num2 ,sum;
  TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_addition);

        btn1=(Button) findViewById(R.id.add);
        et1=(EditText) findViewById(R.id.number1);
        et2=(EditText) findViewById(R.id.number2);
        tv=(TextView) findViewById(R.id.t1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n1=et1.getText().toString();
                n2=et2.getText().toString();
                num1=Integer.parseInt(n1);
                num2=Integer.parseInt(n2);
                sum=num1+num2;
                result=String.valueOf(sum);
                tv.setText(result);
                Toast.makeText(getApplicationContext(),result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}