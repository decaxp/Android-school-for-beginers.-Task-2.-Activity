package com.example.dmitry.activity_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private int k = 0;

    private TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            text = (TextView) findViewById(R.id.mtextView);

            Button button1 = (Button) findViewById(R.id.button1);
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    k++;
                    text.setText(String.valueOf(k));
                }
            });

            Button button3 = (Button) findViewById(R.id.button3);
            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    k=k+3;
                    text.setText(String.valueOf(k));
                }
            });

            Button button5 = (Button) findViewById(R.id.button5);
            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    k=k+5;
                    text.setText(String.valueOf(k));
                }
            });

            Button buttonClear = (Button) findViewById(R.id.buttonClear);
            buttonClear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    k=0;
                    text.setText(String.valueOf(k));
                }
            });
        }



}
