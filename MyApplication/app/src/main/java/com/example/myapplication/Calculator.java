package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {


   private TextView tv;
   private Button b;
   private float result;
   private float a,b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        tv= (TextView) findViewById(R.id.result);
        tv.setText("0");


    }


    public void acClicked(View view) {

        tv.setText("0");
    }

    public void squareClicked(View view) {
        float a=Float.parseFloat(tv.getText().toString());
        result=a*a;
        tv.setText(result+"");


    }



    public void sevenClicked(View view) {

        if(tv.getText()!="0")
        {
            if(tv.getText().length()<=6) {
                String s = tv.getText() + "7";
                tv.setText(s);
            }
        }
        else if(tv.getText().length()<=6)
            tv.setText("7");
    }

    public void eightClicked(View view) {

        if(tv.getText()!="0" )
        {
            if(tv.getText().length()<=6) {
                String s = tv.getText() + "8";
                tv.setText(s);
            }
        }
        else if(tv.getText().length()<=6)
            tv.setText("8");
    }

    public void nineClicked(View view) {

        if(tv.getText()!="0" ) {
            if(tv.getText().length()<=6) {
                String s = tv.getText() + "9";
                tv.setText(s);
            }
        }
        else if(tv.getText().length()<=6)
            tv.setText("9");
    }



    public void fourClicked(View view) {

        if(tv.getText()!="0" ) {
            if(tv.getText().length()<=6) {
                String s = tv.getText() + "4";
                tv.setText(s);
            }
        }
        else if(tv.getText().length()<=6)
            tv.setText("4");
    }

    public void fiveClicked(View view) {

        if(tv.getText()!="0" ) {
            if(tv.getText().length()<=6) {
                String s = tv.getText() + "5";
                tv.setText(s);
            }
        }
        else if(tv.getText().length()<=6)
            tv.setText("5");

    }

    public void sixClicked(View view) {

        if(tv.getText()!="0" ) {
            if(tv.getText().length()<=6) {
                String s = tv.getText() + "6";
                tv.setText(s);
            }
        }
        else if(tv.getText().length()<=6)
            tv.setText("6");
    }


    public void oneClicked(View view) {

        if(tv.getText()!="0" ) {
            if(tv.getText().length()<=6) {
                String s = tv.getText() + "1";
                tv.setText(s);
            }
        }
        else if(tv.getText().length()<=6)
            tv.setText("1");
    }

    public void twoClicked(View view) {

        if(tv.getText()!="0" ) {
            if(tv.getText().length()<=6) {
                String s = tv.getText() + "2";
                tv.setText(s);
            }
        }
        else if(tv.getText().length()<=6)
            tv.setText("2");
    }

    public void threeClicked(View view) {

        if(tv.getText()!="0" ) {
            if(tv.getText().length()<=6) {
                String s = tv.getText() + "3";
                tv.setText(s);
            }
        }
        else if(tv.getText().length()<=6)
            tv.setText("3");
    }


    public void zeroClicked(View view) {
        if(tv.getText()!="0" ) {
            if(tv.getText().length()<=6) {
                String s = tv.getText() + "0";
                tv.setText(s);
            }
        }
        else if(tv.getText().toString().length()<=6||tv.getText().toString().equals("0"))
            tv.setText("0");
    }

    public void pointClicked(View view) {

        String s = tv.getText() + ".";
        if(tv.getText()!="0" ) {
            if(tv.getText().length()<2) {

                tv.setText(s);
            }
        }
        else if(tv.getText().length()<2||!tv.getText().toString().equals(s))
            tv.setText("0.");
    }








    public void addClicked(View view) {

        b= (Button) findViewById(R.id.btn_add);
        a=Float.parseFloat(tv.getText().toString());
        tv.setText("0");



    }


    public void subClicked(View view) {

        b= (Button) findViewById(R.id.btn_sub);
        a=Float.parseFloat(tv.getText().toString());
        tv.setText("0");

    }

    public void perClicked(View view) {
        float a=Float.parseFloat(tv.getText().toString());
        result= a/100;
        tv.setText(result+"");
    }

    public void mulClicked(View view) {
        b= (Button) findViewById(R.id.btn_mul);
        a=Float.parseFloat(tv.getText().toString());
        tv.setText("0");

    }


    public void divClicked(View view) {
        b= (Button) findViewById(R.id.btn_div);
        a=Float.parseFloat(tv.getText().toString());
        tv.setText("0");

    }



    public void eqClicked(View view) {

        b1=Float.parseFloat(tv.getText().toString());

        if(b.getId()==(R.id.btn_add)) {

            result = a + b1;

        }
        else if(b.getId()==(R.id.btn_sub)) {

            result = a - b1;

        }
        else if(b.getId()==(R.id.btn_mul)) {

            result = a * b1;

        }
        else if(b.getId()==(R.id.btn_div)) {

            result = a / b1;

        }

           tv.setText(result + "");
    }




}
