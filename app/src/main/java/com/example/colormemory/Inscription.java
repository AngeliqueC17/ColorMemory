package com.example.colormemory;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Date;

public class Inscription extends AppCompatActivity {

    private Button button_bBack, button_bInscription;
    private EditText LastName, FirstName, Email, Password;
    private DatePicker Birth;
    private RadioButton Woman, Man;
    private String Gender;

    SQLiteHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_inscription);

        button_bInscription = findViewById(R.id.button_bInscription);

        LastName=findViewById(R.id.editTextText_LastName);
        FirstName=findViewById(R.id.editTextText_FirstName);
        Email=findViewById(R.id.editTextText_Email);
        Password=findViewById(R.id.editTextText_Password);
        Birth=findViewById(R.id.datePicker_Birth);

        Woman=findViewById(R.id.radioButton_Woman);
        Man=findViewById(R.id.radioButton_Man);
        if(Woman.isChecked()){
            Gender="feminin";
        }
        else if(Man.isChecked()) {
            Gender="masculin";
        }

        button_bInscription=findViewById(R.id.button_bInscription);

        db=new SQLiteHelper(getApplicationContext());

        button_bInscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (LastName.length() == 0 || FirstName.length() == 0 || (!(Woman.isChecked()) && !(Man.isChecked())) || Password.length() == 0 || Email.length() == 0) {
                    Toast.makeText(Inscription.this, "Un ou plusieurs champs ne sont pas remplis.", Toast.LENGTH_SHORT).show();
                } else {
                    if ((db.addPlayer(LastName.getText().toString(), FirstName.getText().toString(), Gender, Birth, Email.getText().toString(), Password.getText().toString(), 0))) {
                        Intent intent = new Intent(Inscription.this, MainActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(Inscription.this, "Il y a un probleme.", Toast.LENGTH_SHORT).show();
                    }
                }
            }

        });
    }
}