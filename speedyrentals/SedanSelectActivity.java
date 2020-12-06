package com.example.anusaanth.speedyrentals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SedanSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sedan_select);

        ImageButton hondaButton = (ImageButton) findViewById(R.id.hondaCivic);
        hondaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimeFrame();
            }
        });

        ImageButton toyotaButton = (ImageButton) findViewById(R.id.toyotaCorolla);
        toyotaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimeFrame();
            }
        });

        ImageButton bmwButton = (ImageButton) findViewById(R.id.bmw3);
        bmwButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimeFrame();
            }
        });

        ImageButton mercedesButton = (ImageButton) findViewById(R.id.mercedes);
        mercedesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimeFrame();
            }
        });
    }


    private void openTimeFrame(){

        Intent intent = new Intent(this,TimeFrameActivity.class);
        startActivity(intent);
    }
}
