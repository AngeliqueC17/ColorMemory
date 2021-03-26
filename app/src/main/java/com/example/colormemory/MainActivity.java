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
    private EditText Email, Password;

    SQLiteHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db=new SQLiteHelper(getApplicationContext());

        Email=findViewById(R.id.editTextText_Email);
        Password=findViewById(R.id.editTextText_Password);

        //Bouton permettant de se connecter avec les informations saisies qui sont comparés avec les informations dans
        //la base de donnée

        button_connexion = findViewById(R.id.button_Connexion);
        button_connexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(db.connection(Email.getText().toString(), Password.getText().toString())) {
                    Intent intent = new Intent (MainActivity.this, Difficulty.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this, "Login ou password incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Bouton pour aller sur la page d'inscription

        button_inscription = findViewById(R.id.button_Inscription);
        button_inscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, Inscription.class);
                startActivity(intent);
            }
        });

        //Bouton pour aller sur la page d'information

        button_Information = findViewById(R.id.button_Information);
        button_Information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, Information.class);
                startActivity(intent);
            }
        });

    }
}