package com.app.therider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import android.os.Bundle;

public class Dashboard extends AppCompatActivity {

    TextView startProcessChecklist;
    TextView stopProcessChecklist;
/*
    CardView aboutCard = findViewById(R.id.aboutCard);
    CardView documentCard = findViewById(R.id.documentsCard);
    CardView helpCard = findViewById(R.id.helpCard);
    CardView settingsCard = findViewById(R.id.settingsCard);
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);



        setupUI();
        setupListeners();
    }


/*
    // handle each of the cards with the OnClickListener
    aboutCard.setOnClickListener {
        Toast.makeText(getApplicationContext(), "Contribute Articles", Toast.LENGTH_SHORT).show();
    }
*/
    private void setupUI() {

        startProcessChecklist = findViewById(R.id.textView1);
        stopProcessChecklist = findViewById(R.id.textView20);
    }


    private void setupListeners() {
        /*
    }
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkUsername();
            }
        });*/

        startProcessChecklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), StartChecklist.class);
                startActivity(i);
            }
        });

        stopProcessChecklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), StopChecklist.class);
                startActivity(i);
            }
        });

        aboutCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), StopChecklist.class);
                startActivity(i);
            }
        });
    }
}


