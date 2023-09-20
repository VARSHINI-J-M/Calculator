package com.example.mybasiccalapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText op1,op2;
    Button btnadd,btnsub,btnmul,btndiv,btnclr;
    TextView txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        op1=(EditText) findViewById(R.id.op1);
        op2=(EditText) findViewById(R.id.op2);

        btnadd=(Button) findViewById(R.id.add);
        btnsub=(Button) findViewById(R.id.sub);
        btnmul=(Button) findViewById(R.id.mul);
        btndiv=(Button) findViewById(R.id.div);
        btnclr=(Button) findViewById(R.id.clr);

        txtresult=(TextView) findViewById(R.id.result);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op1.getText().length()>0&&op2.getText().length()>0)
                {
                    double oper1=Double.parseDouble(op1.getText().toString());
                    double oper2=Double.parseDouble(op2.getText().toString());
                    double result=oper1+oper2;

                    txtresult.setText(Double.toString(result));
                }
                else {
                    Toast.makeText(MainActivity.this,"Enter required Number",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op1.getText().length()>0&&op2.getText().length()>0)
                {
                    double oper1=Double.parseDouble(op1.getText().toString());
                    double oper2=Double.parseDouble(op2.getText().toString());
                    double result=oper1-oper2;

                    txtresult.setText(Double.toString(result));
                }
                else {
                    Toast.makeText(MainActivity.this,"Enter required Number",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op1.getText().length()>0&&op2.getText().length()>0)
                {
                    double oper1=Double.parseDouble(op1.getText().toString());
                    double oper2=Double.parseDouble(op2.getText().toString());
                    double result=oper1*oper2;

                    txtresult.setText(Double.toString(result));
                }
                else {
                    Toast.makeText(MainActivity.this,"Enter required Number",Toast.LENGTH_LONG).show();
                }
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op1.getText().length()>0&&op2.getText().length()>0)
                {
                    double oper1=Double.parseDouble(op1.getText().toString());
                    double oper2=Double.parseDouble(op2.getText().toString());
                    double result=oper1/oper2;

                    txtresult.setText(Double.toString(result));
                }
                else {
                    Toast.makeText(MainActivity.this,"Enter required Number",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op1.setText("");
                op2.setText("");
                op1.requestFocus();
                txtresult.setText("0.00");

            }
        });

    }
}