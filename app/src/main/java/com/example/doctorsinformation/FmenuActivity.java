package com.example.doctorsinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FmenuActivity extends AppCompatActivity {
    private Button button7;
    private Button button8;
    private Button button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fmenu);
        button7= (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMmenuActivity();
            }
        });
        button8= (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNActivity();
            }
        });
        button9= (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAActivity();
            }
        });
    }
    public void openMmenuActivity(){
        Intent intent=new Intent(this,MmenuActivity.class);
        startActivity(intent);
    }
    public void openNActivity(){
        Intent intent=new Intent(this,NActivity.class);
        startActivity(intent);
    }
    public void openAActivity(){
        Intent intent=new Intent(this,AActivity.class);
        startActivity(intent);
    }
}