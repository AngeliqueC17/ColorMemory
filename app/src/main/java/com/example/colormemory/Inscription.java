package com.example.colormemory;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inscription extends AppCompatActivity {

    private Button button_bBack;
    private Button button_bInscription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_inscription);
        button_bBack = findViewById(R.id.button_bBack);
        button_bBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        button_bInscription = findViewById(R.id.button_bInscription);
        button_bInscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDifficulty();
            }
        });
    }
    public void openMainActivity(){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }

    public void openDifficulty(){
        Intent intent = new Intent (this, Difficulty.class);
        startActivity(intent);
    }
}