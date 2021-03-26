package com.example.colormemory;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Difficulty extends AppCompatActivity {

    private Button button_F, button_D, button_E,button_C;
    private TextView name, score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_difficulty);

        name=findViewById(R.id.textView_Name);
        score=findViewById(R.id.textView_Score2);

        Intent intent=getIntent();
        Bundle bundle= intent.getExtras();
        name.setText("Prenom : " +bundle.getString("prenom"));
        score.setText("Score : " + bundle.getInt("score"));

        button_F = findViewById(R.id.button_Easy);
        button_F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGame();
            }
        });

        button_D = findViewById(R.id.button_Difficult);
        button_D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGame();
            }
        });

        button_E = findViewById(R.id.button_Expert);
        button_E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGame();
            }
        });

        button_C = findViewById(R.id.button_Chrono);
        button_C.setOnClickListener(new View.OnClickListener() {
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