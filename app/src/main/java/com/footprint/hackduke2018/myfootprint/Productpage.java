package com.footprint.hackduke2018.myfootprint;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Productpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productpage);
        Intent intent = getIntent();
        String value = intent.getStringExtra("key");





        View cPP = findViewById(R.id.contentProductPage);
        TextView brandLabel = (TextView) cPP.findViewById(R.id.textView3);
        brandLabel.setText(value);

        TextView crueltyLabel = (TextView) cPP.findViewById(R.id.cruelty);
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(getAssets().open("CrueltyCompanies.json")))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equals(value)) {
                    crueltyLabel.setText("Animal Cruelty: True");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new
            Intent(getApplicationContext(),Historypage.class));
            }
        });

    }

}
