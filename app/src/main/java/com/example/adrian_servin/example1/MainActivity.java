package com.example.adrian_servin.example1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends ActionBarActivity{

    EditText txtNumA, txtNumB;
    Button btnSum,btnRes,btnMul,btnDiv,btnClean;
    TextView lblResult;
    float NumA, NumB, Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumA = (EditText) findViewById(R.id.txtNumA);
        txtNumB = (EditText) findViewById(R.id.txtNumB);
        btnSum = (Button) findViewById(R.id.btnPlus);
        btnRes = (Button) findViewById(R.id.btnMin);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnClean = (Button) findViewById(R.id.btnClean);
        lblResult = (TextView) findViewById(R.id.lblResult);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if (String.valueOf(txtNumA.getText()).equals("")
                      ||String.valueOf(txtNumB.getText()).equals("")) {

                  lblResult.setText("Error: " + "Pon Un Número");


              }else{
                  NumA = Float.parseFloat(String.valueOf(txtNumA.getText()));
                  NumB = Float.parseFloat(String.valueOf(txtNumB.getText()));
                  Result = NumA + NumB;
                  lblResult.setText("Resultado: " + Result);
              }



            }
        });

        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (String.valueOf(txtNumA.getText()).equals("")
                        ||String.valueOf(txtNumB.getText()).equals("")) {

                    lblResult.setText("Error: " + "Pon Un Número");


                }else{
                    NumA = Float.parseFloat(String.valueOf(txtNumA.getText()));
                    NumB = Float.parseFloat(String.valueOf(txtNumB.getText()));
                    Result = NumA - NumB;
                    lblResult.setText("Resultado: " + Result);
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (String.valueOf(txtNumA.getText()).equals("")
                        ||String.valueOf(txtNumB.getText()).equals("")) {

                    lblResult.setText("Error: " + "Pon Un Número");


                }else{
                    NumA = Float.parseFloat(String.valueOf(txtNumA.getText()));
                    NumB = Float.parseFloat(String.valueOf(txtNumB.getText()));
                    Result = NumA * NumB;
                    lblResult.setText("Resultado: " + Result);
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (String.valueOf(txtNumA.getText()).equals("")
                        ||String.valueOf(txtNumB.getText()).equals("")) {

                    lblResult.setText("Error: " + "Pon Un Número");


                }else if (String.valueOf(txtNumB.getText()).equals("0")) {

                    lblResult.setText("Error: " + "Div Entre 0");

                }else{

                    NumA = Float.parseFloat(String.valueOf(txtNumA.getText()));
                    NumB = Float.parseFloat(String.valueOf(txtNumB.getText()));
                    Result = NumA / NumB;
                    lblResult.setText("Resultado: " + Result);
                }
            }
        });

        btnClean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtNumA.setText("");
                txtNumB.setText("");
                lblResult.setText("Resultado: ");

            }
        });

    }

}
