package com.example.colormemory;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Difficulty extends AppCompatActivity {

    private Button button_facile;
    private Button button_Difficult;
    private Button button_Expert;
    private Button button_Chrono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_difficulty);
        button_facile = findViewById(R.id.button_Easy);
        button_facile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGame();
            }
        });

        button_Difficult = findViewById(R.id.button_Difficult);
        button_Difficult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGame();
            }
        });

        button_Expert = findViewById(R.id.button_Expert);
        button_Expert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGame();
            }
        });

        button_Chrono = findViewById(R.id.button_Chrono);
        button_Chrono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGame();
            }
        });

    }

    public void openGame(){
        Intent intent = new Intent(this, ColorGame.class);
        startActivity(intent);
    }
}