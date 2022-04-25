package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText display;
    double num1, num2;
    String operator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.displayView);
        /*to disable the keyboard from popping up when the user clicks on the textViewer*/
        display.setShowSoftInputOnFocus(false);
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            /*to remove what is written within the textViewer when the user clicks on it
            * note that only the default text will be removed*/
            public void onClick(View view) {
                if(getString(R.string.display).equals(display.getText().toString()))
                {
                    display.setText("");
                }
            }
        });
    }

    private void updateText(String strToAdd)
    {;
        String oldStr = display.getText().toString();
        if (getString(R.string.display).equals(display.getText().toString()))
        {
         display.setText("");
        }
        if(strToAdd.equals(""))
        {
         oldStr="";
        }

        else {
            oldStr += strToAdd;
            display.setText(oldStr);
            //getting current cursor position
            int cursorPos = display.getSelectionStart();

            if (getString(R.string.display).equals(display.getText().toString())) {

                display.setText(oldStr);
                display.setSelection(cursorPos + 1);

            } else {
                //fixing the cursor position

                display.setSelection(cursorPos + 1);
            }

        }

    }

    public void zeroBTN(View view)
    {
        updateText("0");
    }
    public void oneBTN(View view)
    {
        if (getString(R.string.display).equals(display.getText().toString()) || display.getText().toString().equals("Enter a number"))
        {
            display.setText("");
        }
        updateText("1");

    }
    public void twoBTN(View view)
    {
        if (getString(R.string.display).equals(display.getText().toString()) || display.getText().toString().equals("Enter a number"))
        {
            display.setText("");
        }
        updateText("2");

    }
    public void threeBTN(View view)
    {
        if (getString(R.string.display).equals(display.getText().toString()) || display.getText().toString().equals("Enter a number"))
        {
            display.setText("");
        }
        updateText("3");

    }
    public void fourBTN(View view)
    {
        if (getString(R.string.display).equals(display.getText().toString()) || display.getText().toString().equals("Enter a number"))
        {
            display.setText("");
        }
        updateText("4");

    }
    public void fiveBTN(View view)
    {
        if (getString(R.string.display).equals(display.getText().toString()) || display.getText().toString().equals("Enter a number"))
        {
            display.setText("");
        }
        updateText("5");

    }
    public void sixBTN(View view)
    {
        if (getString(R.string.display).equals(display.getText().toString()) || display.getText().toString().equals("Enter a number"))
        {
            display.setText("");
        }
        updateText("6");

    }
    public void sevenBTN(View view)
    {
        if (getString(R.string.display).equals(display.getText().toString()) || display.getText().toString().equals("Enter a number"))
        {
            display.setText("");
        }
        updateText("7");

    }
    public void eightBTN(View view)
    {
        if (getString(R.string.display).equals(display.getText().toString()) || display.getText().toString().equals("Enter a number"))
        {
            display.setText("");
        }
        updateText("8");

    }
    public void nineBTN(View view)
    {
        if (getString(R.string.display).equals(display.getText().toString()) || display.getText().toString().equals("Enter a number"))
        {
            display.setText("");
        }
        updateText("9");

    }
    public void pointBTN(View view)
    {
        if (getString(R.string.display).equals(display.getText().toString()) || display.getText().toString().equals("Enter a number"))
        {
            display.setText("");
        }
        else if(!display.getText().toString().contains(".")) {
            updateText(".");
        }
    }
    public void clearBTN(View view)
    {
        display.setText("");
    }
    public void plusBTN(View view)
    {
        operator = "+";
        if(display.getText().toString().equals("") || display.getText().toString().equals("Enter a number"))
        {
            display.setText("Enter a number");
        }
        else
        {
            String temp = display.getText().toString();
            num1 = Double.valueOf(temp);
            updateText("");
            display.setText("");
        }

    }
    public void minusBTN(View view)
    {
        operator = "-";
        if(display.getText().toString().equals("") || display.getText().toString().equals("Enter a number"))
        {
            display.setText("Enter a number");
        }
        else {
            String temp = display.getText().toString();
            num1 = Double.valueOf(temp);
            updateText("");
            display.setText("");
        }
    }
    public void multiplyBTN(View view) {
        operator = "*";
        if (display.getText().toString().equals("") || display.getText().toString().equals("Enter a number"))
        {
            display.setText("Enter a number");
        } else {
            String temp = display.getText().toString();
            num1 = Double.valueOf(temp);
            updateText("");
            display.setText("");

        }
    }
    public void divideBTN(View view)
    {
        operator = "/";
        if(display.getText().toString().equals("") || display.getText().toString().equals("Enter a number"))
        {
            display.setText("Enter a number");
        }
        else {
            String temp = display.getText().toString();
            num1 = Double.valueOf(temp);
            updateText("");
            display.setText("");
        }
    }
    public void equalBTN(View view)
    {
        String temp1 = "";
        temp1 = display.getText().toString();
        if(temp1.equals("") || display.getText().toString().equals("Enter a number"))
        {
            display.setText("Enter a number");
        }
        else {
            num2 = Double.valueOf(temp1);

            if (operator.equals("+")) {
                double result = num1 + num2;
                display.setText(Double.toString(result));
            } else if (operator.equals("-")) {
                double result = num1 - num2;
                display.setText(Double.toString(result));
            } else if (operator.equals("*")) {
                double result = num1 * num2;
                display.setText(Double.toString(result));
            } else if (operator.equals("/")) {
                if (num2 == 0) {
                    display.setText("Can not divide by 0");
                    num2 = 1;
                }

                double result = num1 / num2;
                display.setText(Double.toString(result));
            }
        }
    }
}