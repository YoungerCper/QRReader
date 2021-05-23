package com.example.reader;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class ListActivity extends AppCompatActivity implements OnClickListener {

    private Button r1;
    private Button r2;
    private Button r3;
    private Button r4;
    private Button r5;

    private Button a1;
    private Button a2;
    private Button a3;
    private Button a4;
    private Button a5;

    private TextView c1;
    private TextView c2;
    private TextView c3;
    private TextView c4;
    private TextView c5;

    private Activity a = this;


    private Button next;

    private Zakaz n = new Zakaz();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        r4 = findViewById(R.id.r4);
        r5 = findViewById(R.id.r5);

        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);
        a3 = findViewById(R.id.a3);
        a4 = findViewById(R.id.a4);
        a5 = findViewById(R.id.a5);

        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);

        next = findViewById(R.id.n);

        r1.setOnClickListener(this);
        r2.setOnClickListener(this);
        r3.setOnClickListener(this);
        r4.setOnClickListener(this);
        r5.setOnClickListener(this);

        a1.setOnClickListener(this);
        a2.setOnClickListener(this);
        a3.setOnClickListener(this);
        a4.setOnClickListener(this);
        a5.setOnClickListener(this);

        next.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        int count;
        switch (v.getId()){
            case R.id.a1:
                n.setPosAdd(0);c1.setText(Integer.toString(n.getPos(0)));
                break;
            case R.id.a2:
                n.setPosAdd(1);c2.setText(Integer.toString(n.getPos(1)));
                break;
            case R.id.a3:
                n.setPosAdd(2);c3.setText(Integer.toString(n.getPos(2)));
                break;
            case R.id.a4:
                n.setPosAdd(3);c4.setText(Integer.toString(n.getPos(3)));
                break;
            case R.id.a5:
                n.setPosAdd(4);c5.setText(Integer.toString(n.getPos(4)));
                break;

            case R.id.r1:
                n.setPosRem(0);c1.setText(Integer.toString(n.getPos(0)));
                break;
            case R.id.r2:
                n.setPosRem(1);c2.setText(Integer.toString(n.getPos(1)));
                break;
            case R.id.r3:
                n.setPosRem(2);c3.setText(Integer.toString(n.getPos(2)));
                break;
            case R.id.r4:
                n.setPosRem(3);c4.setText(Integer.toString(n.getPos(3)));
                break;
            case R.id.r5:
                n.setPosRem(4);c5.setText(Integer.toString(n.getPos(4)));
                break;
            case R.id.n:
                String data = n.code();
                String number = getIntent().getStringExtra("number");
                String[] apn = number.split(" ");
                Client c;
                Toast.makeText(ListActivity.this, apn[1], Toast.LENGTH_SHORT).show();
                c = new Client(apn[2] + " " + data, apn[0], 2000);

                c.start();
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent intent = new Intent(this, OkActivivity.class);
                startActivity(intent);
                break;
        }
    }
}