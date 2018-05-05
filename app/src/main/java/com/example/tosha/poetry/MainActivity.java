package com.example.tosha.poetry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnBl;
    Button btnBr;
    Button btnEs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBl = (Button) findViewById(R.id.btnBl);
        btnBr = (Button) findViewById(R.id.btnBr);
        btnEs = (Button) findViewById(R.id.btnEs);
        btnBl.setOnClickListener(this);
        btnBr.setOnClickListener(this);
        btnEs.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnBl:
                break;
            case R.id.btnBr:
                break;
            case R.id.btnEs:
                break;
        }

    }
}
