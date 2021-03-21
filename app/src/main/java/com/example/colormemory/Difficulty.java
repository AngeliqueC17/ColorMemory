package com.example.colormemory;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Difficulty extends AppCompatActivity {

    Button button_facile;

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

    }

    public void openJeu(){
        Intent intent = new Intent (this, Jeu.class);
        startActivity(intent);
    }
}