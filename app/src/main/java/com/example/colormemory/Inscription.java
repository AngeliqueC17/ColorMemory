package com.example.colormemory;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inscription extends AppCompatActivity {

    private Button button_b_retour;
    private Button button_b_inscription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_inscription);
        button_b_retour = findViewById(R.id.button_b_retour);
        button_b_retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        button_b_inscription = findViewById(R.id.button_b_inscription);
        button_b_inscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDifficultes();
            }
        });
    }
    public void openMainActivity(){
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
    }

    public void openDifficultes(){
        Intent intent = new Intent (this, Difficultes.class);
        startActivity(intent);
    }
}