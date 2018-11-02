package com.example.aradg.cyber2021ex04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int i;
    Button btn;
    int kfulut;
    int yehidot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kfulut = 2;
        i = 0;
        yehidot=0;
        btn = (Button) findViewById(R.id.btnclick4);
    }

    public void onClick(View view) {
        i++;
        btn.setText("" + i);
        if (i == 7+yehidot) {
            btn.setText("BOOM!");
            yehidot=yehidot+10;}
           else if (i==7*kfulut){
               btn.setText("BOOM!");
               kfulut++;
            }




            }
            }







