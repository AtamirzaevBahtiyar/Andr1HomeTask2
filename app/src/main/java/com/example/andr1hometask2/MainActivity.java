package com.example.andr1hometask2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1, number2, number3;
    TextView result;
    Button btn;
    int num1;
    int num2;
    int num3;
    int res;
    private final String KEY1 = "num1";
    private final String KEY2 = "num2";
    private final String KEY3 = "num3";
    private final String RESULT = "res";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.et_number1);
        number2 = findViewById(R.id.et_number2);
        number3 = findViewById(R.id.et_number3);
        result = findViewById(R.id.result);
        btn = findViewById(R.id.btn);

        number1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable s) {

                num1 = Integer.valueOf(s.toString());
                num2 = Integer.valueOf(s.toString());
                num3 = Integer.valueOf(s.toString());
            }
        });

        number2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable s) {
                num2 = Integer.valueOf(s.toString());
            }
        });

        number3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {


            }

            @Override
            public void afterTextChanged(Editable s) {
                num3 = Integer.valueOf(s.toString());
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res = (num1 + num2) / num3;
            }

        });

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY1, num1);
        outState.putInt(KEY2, num2);
        outState.putInt(KEY3, num3);
        outState.putInt(RESULT, res);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        num1 = savedInstanceState.getInt(KEY1);
       number1.setText(String.valueOf(num1));
        num2 = savedInstanceState.getInt(KEY2);
        number2.setText(String.valueOf(num2));
        num3 = savedInstanceState.getInt(KEY3);
        number3.setText(String.valueOf(num3));
        res = savedInstanceState.getInt(RESULT);
        result.setText(String.valueOf(res));

    }
}