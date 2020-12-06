package com.example.anusaanth.speedyrentals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setTitle("Main Menu");
        setSupportActionBar(toolbar);


        Button LocationsButton = (Button) findViewById(R.id.location);
        LocationsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLocations();
            }
        });

        Button RentButton = (Button) findViewById(R.id.rent);
        RentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPickUp();
            }
        });

        Button AboutButton = (Button) findViewById(R.id.about);
        AboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAboutUs();
            }
        });


    }

    private void openLocations(){

        Intent intent = new Intent(this,LocationActivity.class);
        startActivity(intent);
    }

    private void openPickUp(){

        Intent intent = new Intent(this,PickUpLocation.class);
        startActivity(intent);
    }

    private void openAboutUs(){

        Intent intent = new Intent(this,AboutUsActivity.class);
        startActivity(intent);
    }

}
