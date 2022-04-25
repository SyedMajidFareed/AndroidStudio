package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText display;
    int num1, num2;
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
        if (getString(R.string.display).equals(display.getText().toString()))
        {
            display.setText("");
        }
        updateText("1");

    }
    public void twoBTN(View view)
    {
        if (getString(R.string.display).equals(display.getText().toString()))
        {
            display.setText("");
        }
        updateText("2");

    }
    public void threeBTN(View view)
    {
        if (getString(R.string.display).equals(display.getText().toString()))
        {
            display.setText("");
        }
        updateText("3");

    }
    public void fourBTN(View view)
    {
        if (getString(R.string.display).equals(display.getText().toString()))
        {
            display.setText("");
        }
        updateText("4");

    }
    public void fiveBTN(View view)
    {
        if (getString(R.string.display).equals(display.getText().toString()))
        {
            display.setText("");
        }
        updateText("5");

    }
    public void sixBTN(View view)
    {
        if (getString(R.string.display).equals(display.getText().toString()))
        {
            display.setText("");
        }
        updateText("6");

    }
    public void sevenBTN(View view)
    {
        if (getString(R.string.display).equals(display.getText().toString()))
        {
            display.setText("");
        }
        updateText("7");

    }
    public void eightBTN(View view)
    {
        if (getString(R.string.display).equals(display.getText().toString()))
        {
            display.setText("");
        }
        updateText("8");

    }
    public void nineBTN(View view)
    {
        if (getString(R.string.display).equals(display.getText().toString()))
        {
            display.setText("");
        }
        updateText("9");

    }
    public void pointBTN(View view)
    {

        //updateText(".");

    }
    public void clearBTN(View view)
    {
        display.setText("");
    }
    public void plusBTN(View view)
    {
        String temp=display.getText().toString();
        num1 = Integer.valueOf(temp);
        updateText("");
        display.setText("");
    }
    public void minusBTN(View view)
    {
        String temp=display.getText().toString();
        num1 = Integer.valueOf(temp);
        updateText("");
        display.setText("");

    }
    public void multiplyBTN(View view)
    {
        String temp=display.getText().toString();
        num1 = Integer.valueOf(temp);
        updateText("");
        display.setText("");
    }
    public void divideBTN(View view)
    {
        String temp=display.getText().toString();
        num1 = Integer.valueOf(temp);
        updateText("");
        display.setText("");

    }
    public void equalBTN(View view)
    {
        String temp1 = "";
        temp1 = display.getText().toString();

        num2 = Integer.valueOf(temp1);

        int result = num1 + num2;
        display.setText(Integer.toString(result));

    }
}