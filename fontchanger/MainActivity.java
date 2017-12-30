package com.win.fontchanger;// package name or application name

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int color=1;
    float font = 20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView T = (TextView)findViewById(R.id.textView);//creating text view
        Button fontSize = (Button) findViewById(R.id.sizeButton);// button using resourses
        fontSize.setOnClickListener( new View.OnClickListener(){
            @Override
            public void  onClick(View v){
                T.setTextSize(font);
                font=font+5;
                if (font==60)
                {
                    font=20;
                }
            }
        });
        Button fontColor =  (Button)findViewById(R.id.colorButton);
        fontColor.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                switch(color){
                    case 1:
                        T.setTextColor(Color.RED);
                        break;
                    case 2:
                        T.setTextColor(Color.YELLOW);
                        break;
                    case 3:
                        T.setTextColor(Color.BLUE);
                        break;
                    case 4:
                        T.setTextColor(Color.GREEN);
                        break;
                    case 5:
                        T.setTextColor(Color.CYAN);
                        break;
                    case 6:
                        T.setTextColor(Color.MAGENTA);
                        break;
                    default:
                        T.setTextColor(Color.BLACK);
                }
                color++;
                if(color==6)
                {
                    color=1;
                }
            }
        });

    }
}
