package com.example.colormemory;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_inscription;
    private Button button_connexion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_inscription = findViewById(R.id.button_inscription);
        button_inscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInscription();
            }
        });

        button_connexion = findViewById(R.id.button_connexion);
        button_connexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDifficulty();
            }
        });
    }

    public void openInscription(){
        Intent intent = new Intent (this, Inscription.class);
        startActivity(intent);
    }

    public void openDifficulty(){
        Intent intent = new Intent (this, Difficulty.class);
        startActivity(intent);
    }
}