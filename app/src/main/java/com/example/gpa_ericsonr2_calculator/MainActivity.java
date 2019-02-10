package com.example.gpa_ericsonr2_calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                EditText thirdNumEditText = (EditText) findViewById(R.id.thirdNumEditText);
                EditText fourthNumEditText = (EditText) findViewById(R.id.fourthNumEditText);
                EditText fifthNumEditText = (EditText) findViewById(R.id.fifthNumEdittext);

                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int num3 = Integer.parseInt(thirdNumEditText.getText().toString());
                int num4 = Integer.parseInt(fourthNumEditText.getText().toString());
                int num5 = Integer.parseInt(fifthNumEditText.getText().toString());


                double classes = 5;
                double totalCredits = 15;
                double total1 = 0;
                double total2 = 0;
                double total3 = 0;
                double total4 = 0;
                double total5 = 0;
                double qp;


                if (num1 >= 90) {
                    qp = 12;
                    total1 += qp;

                } else if (num1 < 90 && num1 >= 80) {
                    qp = 9;
                    total1 += qp;

                } else if (num1 < 80 && num1 >= 70) {
                    qp = 6;
                    total1 += qp;

                } else if (num1 < 70 && num1 >= 60) {
                    qp = 3;
                    total1 += qp;

                } else if (num1 < 60) {
                    qp = 0;
                    total1 += qp;

                }

                if (num2 >= 90) {
                    qp = 12;
                    total2 += qp;

                } else if (num2 < 90 && num2 >= 80) {
                    qp = 9;
                    total2 += qp;

                } else if (num2 < 80 && num2 >= 70) {
                    qp = 6;
                    total2 += qp;

                } else if (num2 < 70 && num2 >= 60) {
                    qp = 3;
                    total2 += qp;

                } else if (num2 < 60) {
                    qp = 0;
                    total2 += qp;

                }

                if (num3 >= 90) {
                    qp = 12;
                    total3 += qp;

                } else if (num3 < 90 && num3 >= 80) {
                    qp = 9;
                    total3 += qp;

                } else if (num3 < 80 && num3 >= 70) {
                    qp = 6;
                    total3 += qp;

                } else if (num3 < 70 && num3 >= 60) {
                    qp = 3;
                    total3 += qp;

                } else if (num3 < 60) {
                    qp = 0;
                    total3 += qp;

                }


                if (num4 >= 90) {
                    qp = 12;
                    total4 += qp;

                } else if (num4 < 90 && num4 >= 80) {
                    qp = 9;
                    total4 += qp;

                } else if (num4 < 80 && num4 >= 70) {
                    qp = 6;
                    total4 += qp;

                } else if (num4 < 70 && num4 >= 60) {
                    qp = 3;
                    total4 += qp;

                } else if (num4 < 60) {
                    qp = 0;
                    total4 += qp;

                }

                if (num5 >= 90) {
                    qp = 12;
                    total5 += qp;

                } else if (num5 < 90 && num5 >= 80) {
                    qp = 9;
                    total5 += qp;

                } else if (num5 < 80 && num5 >= 70) {
                    qp = 6;
                    total5 += qp;

                } else if (num5 < 70 && num5 >= 60) {
                    qp = 3;
                    total5 += qp;

                } else if (num5 < 60) {
                    qp = 0;
                    total5 += qp;

                }


                double GPA = (total1 + total2 + total3 + total4 + total5) / totalCredits;
                resultTextView.setText(GPA + "");


            }
        });
    }

}
