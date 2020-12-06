package com.example.anusaanth.speedyrentals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SuvSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suv_select);

        ImageButton hondaButton = (ImageButton) findViewById(R.id.hondaCrv);
        hondaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimeFrame();
            }
        });

        ImageButton fordButton = (ImageButton) findViewById(R.id.fordEx);
        fordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimeFrame();
            }
        });

        ImageButton bmwButton = (ImageButton) findViewById(R.id.BmwX5);
        bmwButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimeFrame();
            }
        });

        ImageButton lincolnButton = (ImageButton) findViewById(R.id.lincolnNav);
        lincolnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimeFrame();
            }
        });

        ImageButton cadillacButton = (ImageButton) findViewById(R.id.cadillacEsc);
        cadillacButton.setOnClickListener(new View.OnClickListener() {
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
