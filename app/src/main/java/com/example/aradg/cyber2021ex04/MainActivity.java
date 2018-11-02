package com.example.aradg.cyber2021ex04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int i;
    Button btn;
    int kfulot = 7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i = 0;

        btn = (Button) findViewById(R.id.btnclick4);
    }

    public void onClick(View view) {
        i++;

        btn.setText("" + i);
        if(checkSeven(i, kfulot) ||   (i%kfulot == 0)) {
            btn.setText("BOOM!");
        }
    }

    public boolean checkSeven(int num, int divider){
            int modulo;
            while (num> 10) {
                modulo = num % 10;
                if (modulo == divider) {
                    return true;
                }
                num = num/10;
        }
            return false;
        }



            }








