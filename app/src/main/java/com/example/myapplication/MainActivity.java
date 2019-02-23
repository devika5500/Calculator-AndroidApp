package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {

    TextView expression;
    String str="";
    String result_string;
    Button num1,num2,num3,num4,num5,num6,num7,num8,num9,num0,add,mul,divide,sub,result,clear,decimal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expression = (TextView)findViewById(R.id.exp);

        num1 = (Button)findViewById(R.id.n1);
        num2 = (Button)findViewById(R.id.n2);
        num3 = (Button)findViewById(R.id.n3);
        num4 = (Button)findViewById(R.id.n4);
        num5 = (Button)findViewById(R.id.n5);
        num6 = (Button)findViewById(R.id.n6);
        num7 = (Button)findViewById(R.id.n7);
        num8 = (Button)findViewById(R.id.n8);
        num9 = (Button)findViewById(R.id.n9);
        num0 = (Button)findViewById(R.id.n0);

        add = (Button)findViewById(R.id.add);
        mul = (Button)findViewById(R.id.mul);
        divide = (Button)findViewById(R.id.divide);
        sub = (Button)findViewById(R.id.sub);

        decimal = (Button)findViewById(R.id.decimal);
        clear = (Button)findViewById(R.id.clear);
        result = (Button)findViewById(R.id.result);

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str+= num1.getText().toString();
                expression.setText(str);
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str+= num2.getText().toString();
                expression.setText(str);
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str+= num3.getText().toString();
                expression.setText(str);
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str+= num4.getText().toString();
                expression.setText(str);
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str+= num5.getText().toString();
                expression.setText(str);
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str+= num6.getText().toString();
                expression.setText(str);
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str+= num7.getText().toString();
                expression.setText(str);
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str+= num8.getText().toString();
                expression.setText(str);
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str+= num9.getText().toString();
                expression.setText(str);
            }
        });
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str+= num0.getText().toString();
                expression.setText(str);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str+= add.getText().toString();
                expression.setText(str);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str+= sub.getText().toString();
                expression.setText(str);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str+= mul.getText().toString();
                expression.setText(str);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str+= divide.getText().toString();
                expression.setText(str);
            }
        });
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str+= decimal.getText().toString();
                expression.setText(str);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                expression.setText(String.valueOf("0"));
                str="";
            }
        });
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result_string = expression.getText().toString();
                Expression e = new Expression(result_string);
                String final_result = String.valueOf(e.calculate());
                expression.setText(final_result);
                str="";

            }
        });


    }
}
