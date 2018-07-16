package com.example.acer.basiccalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText number1EditText;
    private EditText number2EditText;
    private Button addButton, subtractButton,muliplyButton,divideButton;
    private TextView answerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1EditText=(EditText) findViewById(R.id.number1EditText);
        number2EditText=(EditText) findViewById(R.id.number2EditText);
        addButton=(Button) findViewById(R.id.addButton);
        subtractButton=(Button) findViewById(R.id.subtractButtom);
        muliplyButton=(Button) findViewById(R.id.multiplyButton);
        divideButton=(Button) findViewById(R.id.divideButton);
        answerTextView=(TextView) findViewById(R.id.answerTextView);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1=number1EditText.getText().toString();
                String n2=number2EditText.getText().toString();
                int number1= Integer.parseInt(n1);
                int number2=Integer.parseInt(n2);
                int answer=number1+number2;
                answerTextView.setText("Addition is :"+answer);
            }
        });
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1=number1EditText.getText().toString();
                String n2=number2EditText.getText().toString();
                int number1= Integer.parseInt(n1);
                int number2=Integer.parseInt(n2);
                int answer=number1-number2;
                answerTextView.setText("Subtraction is :"+answer);
            }
        });
        muliplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1=number1EditText.getText().toString();
                String n2=number2EditText.getText().toString();
                int number1= Integer.parseInt(n1);
                int number2=Integer.parseInt(n2);
                int answer=number1*number2;
                answerTextView.setText("Multiplication is :"+answer);
            }
        });
        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1=number1EditText.getText().toString();
                String n2=number2EditText.getText().toString();
                int number1= Integer.parseInt(n1);
                int number2=Integer.parseInt(n2);
                int answer=number1/number2;
                answerTextView.setText("Division is :"+answer);
            }
        });
    }

}
