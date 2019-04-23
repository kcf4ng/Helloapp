package com.example.helloapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView x = findViewById(R.id.lblHello);
       // x.setText("Hello");
        x.setText((new CLottoGen()).GetLotto());
    }
}
