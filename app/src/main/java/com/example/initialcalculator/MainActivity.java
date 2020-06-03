package com.example.initialcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import java.lang.*;


public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, button10, buttonC, buttonEqual, buttonmod;
    EditText crunchifyEditText;

    double mValueOne=0, mValueTwo=0;
    int ope=0;
    double res = 0;
    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision, modual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonadd);
        buttonSub = (Button) findViewById(R.id.buttonsub);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDivision = (Button) findViewById(R.id.buttondiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonmod = (Button) findViewById(R.id.buttonmod);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        crunchifyEditText = (EditText) findViewById(R.id.edt1);


        buttonC.setOnClickListener(new mClick());
        button1.setOnClickListener(new mClick());
        button2.setOnClickListener(new mClick());
        button3.setOnClickListener(new mClick());
        button4.setOnClickListener(new mClick());
        button5.setOnClickListener(new mClick());
        button6.setOnClickListener(new mClick());
        button7.setOnClickListener(new mClick());
        button8.setOnClickListener(new mClick());
        button9.setOnClickListener(new mClick());
        button0.setOnClickListener(new mClick());
        buttonAdd.setOnClickListener(new mClick());
        buttonSub.setOnClickListener(new mClick());
        buttonMul.setOnClickListener(new mClick());
        buttonDivision.setOnClickListener(new mClick());
        button10.setOnClickListener(new mClick());
        buttonEqual.setOnClickListener(new mClick());
        buttonmod.setOnClickListener(new mClick());



    }
class mClick implements View.OnClickListener{

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button0 :
                String str0=crunchifyEditText.getText().toString();
                str0+="0";
                crunchifyEditText.setText(str0);
                break;
            case R.id.button1 :
                String str1=crunchifyEditText.getText().toString();
                str1+="1";
                crunchifyEditText.setText(str1);
                break;
            case R.id.button2 :
                String str2=crunchifyEditText.getText().toString();
                str2+="2";
                crunchifyEditText.setText(str2);
                break;
            case R.id.button3 :
                String str3=crunchifyEditText.getText().toString();
                str3+="3";
                crunchifyEditText.setText(str3);
                break;
            case R.id.button4 :
                String str4=crunchifyEditText.getText().toString();
                str4+="4";
                crunchifyEditText.setText(str4);
                break;
            case R.id.button5 :
                String str5=crunchifyEditText.getText().toString();
                str5+="5";
                crunchifyEditText.setText(str5);
                break;
            case R.id.button6 :
                String str6=crunchifyEditText.getText().toString();
                str6+="6";
                crunchifyEditText.setText(str6);
                break;
            case R.id.button7 :
                String str7=crunchifyEditText.getText().toString();
                str7+="7";
                crunchifyEditText.setText(str7);
                break;
            case R.id.button8 :
                String str8=crunchifyEditText.getText().toString();
                str8+="8";
                crunchifyEditText.setText(str8);
                break;
            case R.id.button9 :
                String str9=crunchifyEditText.getText().toString();
                str9+="9";
                crunchifyEditText.setText(str9);
                break;
            case R.id.button10 :
                String str10=crunchifyEditText.getText().toString();
                str10+=".";
                crunchifyEditText.setText(str10);
                break;
            case R.id.buttonC :
                crunchifyEditText.setText(null);
                break;
            case R.id.buttonadd :
                String stradd=crunchifyEditText.getText().toString();
                if(stradd.equals(null))
                {
                    return;
                }
                mValueOne=Double.valueOf(stradd);
                crunchifyEditText.setText(null);
                ope=1;
            case R.id.buttonsub:
                String strsub=crunchifyEditText.getText().toString();
                if(strsub.equals(null))
                {
                    return;
                }
                mValueOne=Double.valueOf(strsub);
                crunchifyEditText.setText(null);
                ope=2;
                break;
            case R.id.buttonmul:
                String strmut=crunchifyEditText.getText().toString();
                if(strmut.equals(null))
                {
                    return;
                }
                mValueOne=Double.valueOf(strmut);
                crunchifyEditText.setText(null);
                ope=3;
                break;
            case R.id.buttondiv:
                String strdiv=crunchifyEditText.getText().toString();
                if(strdiv.equals(null))
                {
                    return;
                }
                mValueOne=Double.valueOf(strdiv);
                crunchifyEditText.setText(null);
                ope=4;
                break;
            case R.id.buttonmod:
                String strmod=crunchifyEditText.getText().toString();
                if(strmod.equals(null))
                {
                    return;
                }
                mValueOne=Double.valueOf(strmod);
                crunchifyEditText.setText(null);
                ope=5;
                break;
            case R.id.buttoneql:
                String strequ=crunchifyEditText.getText().toString();
                mValueTwo=Double.valueOf(strequ);
                crunchifyEditText.setText(null);
                switch (ope) {
                    case 1:
                        res = mValueOne + mValueTwo;
                        crunchifyEditText.setText(String.valueOf(mValueOne) + "+" + String.valueOf(mValueTwo) + "=" + String.valueOf(res));
                        break;
                    case 2:
                        res = mValueOne - mValueTwo;
                        crunchifyEditText.setText(String.valueOf(mValueOne) + "-" + String.valueOf(mValueTwo) + "=" + String.valueOf(res));
                        break;
                    case 3:
                        res = mValueOne * mValueTwo;
                        crunchifyEditText.setText(String.valueOf(mValueOne) + "*" + String.valueOf(mValueTwo) + "=" + String.valueOf(res));
                        break;
                    case 4:
                        if (mValueTwo == 0) {
                            crunchifyEditText.setText("cant divide by 0！");
                        } else {
                            res = mValueOne / mValueTwo;
                            crunchifyEditText.setText(String.valueOf(mValueOne) + "/" + String.valueOf(mValueTwo) + "=" + String.valueOf(res));
                        }
                        break;
                    case 5:
                            res = mValueOne % mValueTwo;
                            crunchifyEditText.setText(String.valueOf(mValueOne) + "%" + String.valueOf(mValueTwo) + "=" + String.valueOf(res));
                        }
                        break;
                    default:
                        res = 0;
                        break;
                }
        }
    }
    }

