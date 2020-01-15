package com.example.android.theweatherapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ChangeCity extends AppCompatActivity {
EditText ed;

ImageButton Imv;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_city);
        ed = findViewById(R.id.queryET);

        Imv  = findViewById(R.id.backButton);
        ed.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                String newCity = ed.getText().toString().trim();
                Intent newCityIntent = new Intent(ChangeCity.this, MainActivity.class);

                // Adds what was entered in the EditText as an extra to the intent.
                newCityIntent.putExtra("city", newCity);

                // We started this activity for a result, so now we are setting the result.
                setResult(Activity.RESULT_OK, newCityIntent);

                // This destroys the ChangeCityController.
                finish();
                return true;


            }
        });




                Imv.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                    }
                });


    }}
