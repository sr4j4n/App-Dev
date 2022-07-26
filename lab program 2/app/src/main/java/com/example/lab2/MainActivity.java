package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText n1, n2;
    TextView res;
    char op = '0';
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.num1);
        n2 = findViewById(R.id.num2);
        res = findViewById(R.id.result);
    }

    public void one(View v) {
        if(n1.hasFocus()) n1.append("1");
        if(n2.hasFocus()) n2.append("1");
    }
    public void two(View v) {
        if(n1.hasFocus()) n1.append("2");
        if(n2.hasFocus()) n2.append("2");
    }
    public void three(View v) {
        if(n1.hasFocus()) n1.append("3");
        if(n2.hasFocus()) n2.append("3");
    }
    public void four(View v) {
        if(n1.hasFocus()) n1.append("4");
        if(n2.hasFocus()) n2.append("4");
    }
    public void five(View v) {
        if(n1.hasFocus()) n1.append("5");
        if(n2.hasFocus()) n2.append("5");
    }
    public void six(View v) {
        if(n1.hasFocus()) n1.append("6");
        if(n2.hasFocus()) n2.append("6");
    }
    public void seven(View v) {
        if(n1.hasFocus()) n1.append("7");
        if(n2.hasFocus()) n2.append("7");
    }
    public void eight(View v) {
        if(n1.hasFocus()) n1.append("8");
        if(n2.hasFocus()) n2.append("8");
    }
    public void nine(View v) {
        if(n1.hasFocus()) n1.append("9");
        if(n2.hasFocus()) n2.append("9");
    }

    public void star(View v) {
        op = '*';
    }
    public void clear(View v) {
        n1.setText("");
        n2.setText("");
        res.setText("");
    }
    public void plus(View v) {
        op = '+';
    }
    public void minus(View v) {
        op = '-';
    }
    public void divide(View v) {
        op = '/';
    }
    public void zero(View v) {
        if(n1.hasFocus()) n1.append("0");
        if(n2.hasFocus()) n2.append("0");
    }
    public void compute(View v) {
        float num1, num2, answer = 0;
        num1 = Float.parseFloat(n1.getText().toString());
        num2 = Float.parseFloat(n2.getText().toString());
        switch(op) {
            case '0': {
//                res.setText("Choose Operator");
                break;
            }
            case '+': {
                answer= num1+num2;
                break;
            }
            case '-': {
                answer= num1-num2;
                break;
            }
            case '*': {
                answer= num1*num2;
                break;
            }
            case '/': {
                answer= num1/num2;
                break;
            }
        }
        res.setText(""+answer);
    }
}