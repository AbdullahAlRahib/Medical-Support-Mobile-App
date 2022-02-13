package com.example.doctorsinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MmenuActivity extends AppCompatActivity {
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        button2= (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMActivity();
            }
        });
        button3= (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSActivity();
            }
        });
        button4= (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEActivity();
            }
        });
        button5= (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKActivity();
            }
        });
        button6= (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCActivity();
            }
        });
    }
    public void openMActivity(){
        Intent intent=new Intent(this,MActivity.class);
        startActivity(intent);
    }
    public void openSActivity(){
        Intent intent=new Intent(this,SActivity.class);
        startActivity(intent);
    }
    public void openEActivity(){
        Intent intent=new Intent(this,EActivity.class);
        startActivity(intent);
    }
    public void openKActivity(){
        Intent intent=new Intent(this,KActivity.class);
        startActivity(intent);
    }
    public void openCActivity(){
        Intent intent=new Intent(this,CActivity.class);
        startActivity(intent);
    }

}