package com.example.colormemory;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button_inscription, button_connexion, button_Information;
    private EditText editTextText_Email, editTextText_Password;

    SQLiteHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_inscription = findViewById(R.id.button_Inscription);
        button_inscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInscription();
            }
        });

        button_Information = findViewById(R.id.button_Information);
        button_Information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openInformation();
            }
        });

        db=new SQLiteHelper(getApplicationContext());
        button_connexion = findViewById(R.id.button_Connexion);

        button_connexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(db.connection(editTextText_Email.getText().toString(), editTextText_Password.getText().toString())) {
                    Intent intent = new Intent (MainActivity.this, Difficulty.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this, "Login ou password incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void openInscription(){
        Intent intent = new Intent (this, Inscription.class);
        startActivity(intent);
    }


    public void openInformation(){
        Intent intent = new Intent (this, Information.class);
        startActivity(intent);
    }
}