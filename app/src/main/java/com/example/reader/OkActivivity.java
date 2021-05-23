package com.example.reader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class OkActivivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ok_activivity);
        Toast t;
        if(Client.result.substring(0, 14).equals("Your connected")) {
            t = Toast.makeText(this, "Заказ отправлен", Toast.LENGTH_SHORT);
        }
        else{
            t = Toast.makeText(this, "Что-то пошло не так повторите попытку", Toast.LENGTH_SHORT);
        }
        t.show();
    }
}