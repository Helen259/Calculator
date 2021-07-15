package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button plus, percent, power, multiply, decimal, minus, divide, equal, but0, root,
            but1, but2, but3, but4, but5, but6, but7, but8, but9, clear;

    TextView edit2, edit1;
    double value1, value2;
    double ans = 0;
    boolean subtraction, addition, division, multiplication, answer, remainderOfTheDivision, squareRoot, exponentiation;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        root = findViewById(R.id.root);
        power = findViewById(R.id.power);
        minus = findViewById(R.id.minus);
        plus = findViewById(R.id.plus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        but0 = findViewById(R.id.btn_0);
        but1 = findViewById(R.id.btn_1);
        but2 = findViewById(R.id.btn_2);
        but3 = findViewById(R.id.btn_3);
        but4 = findViewById(R.id.btn_4);
        but5 = findViewById(R.id.btn_5);
        but6 = findViewById(R.id.btn_6);
        but7 = findViewById(R.id.btn_7);
        but8 = findViewById(R.id.btn_8);
        but9 = findViewById(R.id.btn_9);
        equal = findViewById(R.id.equals);
        clear = findViewById(R.id.btn_clear);
        decimal = findViewById(R.id.decimal);
        edit1 = findViewById(R.id.editText1);
        edit2 = findViewById(R.id.editText2);
        percent = findViewById(R.id.percent);

        but0.setOnClickListener(view -> edit1.setText(edit1.getText() + "0"));
        but1.setOnClickListener(view -> edit1.setText(edit1.getText() + "1"));
        but2.setOnClickListener(view -> edit1.setText(edit1.getText() + "2"));
        but3.setOnClickListener(view -> edit1.setText(edit1.getText() + "3"));
        but4.setOnClickListener(view -> edit1.setText(edit1.getText() + "4"));
        but5.setOnClickListener(view -> edit1.setText(edit1.getText() + "5"));
        but6.setOnClickListener(view -> edit1.setText(edit1.getText() + "6"));
        but7.setOnClickListener(view -> edit1.setText(edit1.getText() + "7"));
        but8.setOnClickListener(view -> edit1.setText(edit1.getText() + "8"));
        but9.setOnClickListener(view -> edit1.setText(edit1.getText() + "9"));

        root.setOnClickListener(view -> {
            try {
                division = false;
                subtraction = false;
                addition = false;
                multiplication = false;
                remainderOfTheDivision = false;
                squareRoot = true;
                exponentiation = false;

                value1 = Float.parseFloat(edit1.getText() + "");
                edit2.setText("√" + edit1.getText());
                edit1.setText("");

            } catch (Exception e) {
                edit1.setText("Error");
            }
        });

        power.setOnClickListener(view -> {
            try {
                division = false;
                subtraction = false;
                addition = false;
                multiplication = false;
                remainderOfTheDivision = false;
                exponentiation = true;
                squareRoot = false;

                value1 = Float.parseFloat(edit1.getText() + "");
                edit2.setText(edit1.getText() + "^");
                edit1.setText("");

            } catch (Exception e) {
                edit1.setText("Error");
            }
        });

        percent.setOnClickListener(view -> {
            try {
                division = false;
                subtraction = false;
                addition = false;
                multiplication = false;
                remainderOfTheDivision = true;
                squareRoot = false;
                exponentiation = false;

                value1 = Float.parseFloat(edit1.getText() + "");
                edit2.setText(edit1.getText() + "%");
                edit1.setText("");

            } catch (Exception e) {
                edit1.setText("Error");
            }
        });

        clear.setOnClickListener(view -> {
            edit1.setText("");
            edit2.setText("");
        });

        plus.setOnClickListener(view -> {
            try {
                subtraction = false;
                addition = true;
                division = false;
                multiplication = false;
                remainderOfTheDivision = false;
                squareRoot = false;
                exponentiation = false;

                value1 = Float.parseFloat(edit1.getText() + "");
                edit2.setText(edit1.getText() + "+");
                edit1.setText("");
            } catch (Exception e) {
                edit1.setText("Error");
            }
        });

        minus.setOnClickListener(view -> {
            try {

                subtraction = true;
                addition = false;
                division = false;
                multiplication = false;
                remainderOfTheDivision = false;
                squareRoot = false;
                exponentiation = false;

                value1 = Float.parseFloat(edit1.getText() + "");
                edit2.setText(edit1.getText() + "-");
                edit1.setText("");
            } catch (Exception e) {
                edit1.setText("Error");
            }
        });


        divide.setOnClickListener(view -> {
            try {

                division = true;
                subtraction = false;
                addition = false;
                multiplication = false;
                remainderOfTheDivision = false;
                squareRoot = false;
                exponentiation = false;

                value1 = Float.parseFloat(edit1.getText() + "");
                edit2.setText(edit1.getText() + "/");
                edit1.setText("");
            } catch (Exception e) {
                edit1.setText("Error");
            }
        });

        multiply.setOnClickListener(view -> {
            try {
                multiplication = true;
                subtraction = false;
                division = false;
                addition = false;
                remainderOfTheDivision = false;
                squareRoot = false;
                exponentiation = false;

                value1 = Float.parseFloat(edit1.getText() + "");
                edit2.setText(edit1.getText() + "*");
                edit1.setText("");
            } catch (Exception e) {
                edit1.setText("Error");
            }
        });

        equal.setOnClickListener(view -> {
            try {
                answer = true;
                if (subtraction == true) {

                    value2 = Double.parseDouble(edit1.getText() + "");
                    String str = edit2.getText().toString() + edit1.getText().toString();
                    edit2.setText(str + "=");
                    ans = value1 - value2;

                } else if (addition == true) {

                    value2 = Double.parseDouble(edit1.getText() + "");
                    String str = edit2.getText().toString() + edit1.getText().toString();
                    edit2.setText(str + "=");
                    ans = value1 + value2;

                } else if (division == true) {

                    value2 = Double.parseDouble(edit1.getText() + "");
                    String str = edit2.getText().toString() + edit1.getText().toString();
                    edit2.setText(str + "=");
                    ans = value1 / value2;

                } else if (multiplication == true) {

                    value2 = Double.parseDouble(edit1.getText() + "");
                    String str = edit2.getText().toString() + edit1.getText().toString();
                    edit2.setText(str + "=");
                    ans = value1 * value2;

                } else if (remainderOfTheDivision == true) {

                    value2 = Double.parseDouble(edit1.getText() + "");
                    String str = edit2.getText().toString() + edit1.getText().toString();
                    edit2.setText(str + "=");
                    ans = value1 % value2;
                    ;

                } else if (squareRoot == true) {

                    String str = edit2.getText().toString() + edit1.getText().toString();
                    edit2.setText(str + "=");
                    ans = Math.sqrt(value1);

                } else if (exponentiation == true) {

                    value2 = Double.parseDouble(edit1.getText() + "");
                    String str = edit2.getText().toString() + edit1.getText().toString();
                    edit2.setText(str + "=");
                    ans = Math.pow(value1, value2);
                }
                edit1.setText(ans + "");

            } catch (Exception e) {
                edit1.setText("Error");
            }
        });
        decimal.setOnClickListener(view -> edit1.setText(edit1.getText() + "."));


    }
}