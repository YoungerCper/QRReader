package com.example.reader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class StartActivity extends AppCompatActivity implements OnClickListener {

    private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        start = (Button)findViewById(R.id.start);

        start.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.start){
            Intent intent = new Intent(StartActivity.this, MainActivity.class);
            startActivity(intent);
        }
    }
}