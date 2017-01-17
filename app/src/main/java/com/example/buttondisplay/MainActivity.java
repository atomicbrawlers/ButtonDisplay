package com.example.buttondisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declare Variables
    public int count;
    public TextView counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instantiate Variables
        count = 0;

        //Set the display
        counter = (TextView) findViewById(R.id.counterDisplay);
        counter.setTextSize(40);
        counter.setText("0");
    }

    public void updateCounter(View view){
        count++;
        counter.setText(String.format("%1$d", count)); //"d" formats to a decimal integer
    }
}
