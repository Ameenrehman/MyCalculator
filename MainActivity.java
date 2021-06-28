package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.Math;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }
    public void onClickAdd(View view)
    {
        EditText e1 = findViewById(R.id.editText1);
        EditText e2 =findViewById(R.id.editText2);
        TextView t1 = findViewById(R.id.textView);
        Button b1Add = findViewById(R.id.addB);

        //int sum = Double.parseDouble(e1.getText().toString()) + Double.parseDouble(e2.getText().toString());
        t1.setText("Answer : " + (Double.parseDouble(e1.getText().toString()) + Double.parseDouble(e2.getText().toString())) );


    }

    public void onClickSubtract(View view)
    {
        EditText e1 = findViewById(R.id.editText1);
        EditText e2 =findViewById(R.id.editText2);
        TextView t1 = findViewById(R.id.textView);
        Button b2Subtract = findViewById(R.id.subB);
        double s1,s2;
        s1= Double.parseDouble(e1.getText().toString());
        s2= Double.parseDouble(e2.getText().toString());

        if(s1>s2)
            t1.setText("Answer : " + (Double.parseDouble(e1.getText().toString()) - Double.parseDouble(e2.getText().toString())) );
         else
            t1.setText("Answer : " + (Double.parseDouble(e1.getText().toString()) - (Double.parseDouble(e2.getText().toString()))) );

    }

    public void onClickMultiply(View view)
    {
        EditText e1 = findViewById(R.id.editText1);
        EditText e2 =findViewById(R.id.editText2);
        TextView t1 = findViewById(R.id.textView);
        Button b3Multiply = findViewById(R.id.mulB);

        t1.setText("Answer : " + (Double.parseDouble(e1.getText().toString()) * Double.parseDouble(e2.getText().toString())) );


    }

    public void onClickDivision(View view)
    {
        EditText e1 = findViewById(R.id.editText1);
        EditText e2 =findViewById(R.id.editText2);
        TextView t1 = findViewById(R.id.textView);
        Button b4Division= findViewById(R.id.divB);

        double d2;
        d2= Double.parseDouble(e2.getText().toString());

        if(d2==0)
            t1.setText("Cannot Divide By 0");

        else
          t1.setText("Answer : " + (Double.parseDouble(e1.getText().toString()) / d2 ));


    }

    public void onClickPower(View view)
    {
        EditText e1 = findViewById(R.id.editText1);
        EditText e2 =findViewById(R.id.editText2);
        TextView t1 = findViewById(R.id.textView);
        Button b5Power = findViewById(R.id.powB);

        t1.setText("Answer : " + (Math.pow(Double.parseDouble(e1.getText().toString()), Double.parseDouble(e2.getText().toString()))) );


    }

}