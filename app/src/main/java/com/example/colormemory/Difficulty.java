package com.example.colormemory;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Difficulty extends AppCompatActivity {

    Button button_facile;
    private Button id_button_difficile;
    private Button id_button_expert;
    private Button id_button_chrono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_difficulty);
        button_facile = findViewById(R.id.button_facile);
        button_facile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openJeu();
            }
        });

        id_button_difficile = findViewById(R.id.id_button_difficile);
        id_button_difficile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openJeu();
            }
        });

        id_button_expert = findViewById(R.id.id_button_expert);
        id_button_expert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openJeu();
            }
        });

        id_button_chrono = findViewById(R.id.id_button_chrono);
        id_button_chrono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openJeu();
            }
        });

    }

    public void openJeu(){
        Intent intent = new Intent(this, ColorGame.class);
        startActivity(intent);
    }
}