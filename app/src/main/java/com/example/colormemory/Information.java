package com.example.colormemory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Information extends AppCompatActivity {

    private Button button_backinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_information);

        button_backinfo = findViewById(R.id.button_backinfo);
        button_backinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMenu();
            }
        });
    }

    public void openMenu(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}