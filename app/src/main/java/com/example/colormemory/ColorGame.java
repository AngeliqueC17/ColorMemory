package com.example.colormemory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ColorGame extends AppCompatActivity {

    private Button button_bDifficulty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_colorgame);
        button_bDifficulty = findViewById(R.id.button_bDifficulty);
        button_bDifficulty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDifficulty();
            }
        });
    }
    public void openDifficulty(){
        Intent intent = new Intent(this, Difficulty.class);
        startActivity(intent);
    }

}