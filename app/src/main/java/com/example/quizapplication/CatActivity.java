package com.example.quizapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CatActivity extends AppCompatActivity {
private TextView it;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);
        it = findViewById(R.id.btn_it);



    }

    public void lunchit(View view) {
        Intent itintent = new Intent(CatActivity.this,ItActivity.class);
        startActivity(itintent);
    }
}
