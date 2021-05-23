package com.example.reader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View.OnClickListener;

public class ConfirmActivity extends AppCompatActivity implements OnClickListener {

    //private Client c;

    private Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        confirm = findViewById(R.id.confirm);

        confirm.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String data = getIntent().getStringExtra("zakaz");
        String number = getIntent().getStringExtra("number1");
        String[] apn = number.split(" ");
        Client c;
        c = new Client(apn[2] + " " + data, apn[0], Integer.parseInt(apn[1]));
        c.start();
    }
}