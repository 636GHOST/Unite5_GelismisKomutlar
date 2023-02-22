package com.example.unite5_gelismiskomutlar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void uyg1Goster(View view){
        Intent i =new Intent(MainActivity.this,Uyg1MainActivity.class);
        startActivity(i);
    }
}
