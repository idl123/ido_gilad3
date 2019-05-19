package com.example.ido_gilad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int b[] = {R.id.b0,R.id.b1, R.id.b2, R.id.b3, R.id.b4, R.id.b5, R.id.b6, R.id.b7, R.id.b8, R.id.b9, R.id.bDot, R.id.bDiv,
            R.id.bX, R.id.bM, R.id.bP, R.id.bbr1, R.id.bbr2, R.id.bE, R.id.bDel, R.id.bAc};
    int index = 0;
    int num1,num2;
    long res,bob;
    String state = "";
    String[] num = {"",""};
    public  void display(String x){
        TextView t1 = findViewById(R.id.txt1);
        num[index] += x;
        t1.setText(num[index]);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn[] = new Button[20];
        for (int i = 0; i < b.length; i++) {
            btn[i] = findViewById(b[i]);
        }
        final TextView t1 = findViewById(R.id.txt1);

        btn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               display("0");
            }
        });
        btn[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("1");
            }
        });
        btn[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("2");
            }
        });
        btn[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("3");
            }
        });
        btn[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("4");
            }
        });
        btn[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("5");
            }
        });
        btn[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("6");
            }
        });
        btn[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("7");
            }
        });
        btn[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("8");
            }
        });
        btn[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display("9");
            }
        });
        btn[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText("");
                check("/");
            }
        });
        btn[17].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index == 0){

                }else {
                    switch (state){
                        case "/":
                            num2 = Integer.parseInt(num[index]);
                            res = num1/num2;
                            t1.setText("" + res);
                            num1 = num2;
                            break;
                        /*case "x":
                            num2 = Integer.parseInt(num[index]);
                            res = num1*num2;
                            t1.setText("" + res);
                            num1 = num2;
                            index = 0;
                            break;
                        case "+":
                            num2 = Integer.parseInt(num[index]);
                            res = num[1]+nums[2];
                            t1.setText("" + res);
                            num1 = num2;
                            index = 1;
                            break;
                        case "-":
                            nums[2] = Integer.parseInt(num[index]);
                            res = num[1]-num[2];
                            t1.setText("" + res);
                            num1 = num2;
                            index = 1;
                            break;*/
                    }
                }
            }
        });
        btn[18].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num[index].length() == 0){

                }else{
                    num[index] = num[index].substring(0,num[index].length() - 1);
                    t1.setText(num[index]);
                }
            }
        });
        btn[19].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num[0] = "";
                num[1] = "";
                index = 0;
                t1.setText("");
            }
        });
    }
    public void check(String y){
        num1 = Integer.parseInt(num[index]);
        index = 1;
        num[index] = "";
        state = y;
    }
}
