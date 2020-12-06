package com.example.anusaanth.speedyrentals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CoupeSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupe_select);

        ImageButton toyotaButton = (ImageButton) findViewById(R.id.toyota);
        toyotaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimeFrame();
            }
        });

        ImageButton dodgeButton = (ImageButton) findViewById(R.id.dodgeChallenger);
        dodgeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimeFrame();
            }
        });

        ImageButton PorscheButton = (ImageButton) findViewById(R.id.porsche);
        PorscheButton.setOnClickListener(new View.OnClickListener() {
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
