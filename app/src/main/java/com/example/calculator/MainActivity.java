package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.displayView);
        /*to disable the keyboard from popping up when the user clicks on the textViewer*/
        display.setShowSoftInputOnFocus(false);
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            /*to remove what is written within the textViewer when the user clicks on it*/
            public void onClick(View view) {
                if(getString(R.string.display).equals(display.getText().toString()))
                {
                    display.setText("");
                }
            }
        });
    }
    public void zeroBTN(View view)
    {

    }
    public void oneBTN(View view)
    {

    }
    public void twoBTN(View view)
    {

    }
    public void threeBTN(View view)
    {

    }
    public void fourBTN(View view)
    {

    }
    public void fiveBTN(View view)
    {

    }
    public void sixBTN(View view)
    {

    }
    public void sevenBTN(View view)
    {

    }
    public void eightBTN(View view)
    {

    }
    public void nineBTN(View view)
    {

    }
    public void pointBTN(View view)
    {

    }
    public void clearBTN(View view)
    {

    }
    public void plusBTN(View view)
    {

    }
    public void minusBTN(View view)
    {

    }
    public void multiplyBTN(View view)
    {

    }
    public void divideBTN(View view)
    {

    }
    public void equalBTN(View view)
    {

    }
}