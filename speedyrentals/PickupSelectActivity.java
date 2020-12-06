package com.example.anusaanth.speedyrentals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PickupSelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickup_select);

        ImageButton chevyButton = (ImageButton) findViewById(R.id.chevyColo);
        chevyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimeFrame();
            }
        });

        ImageButton ramButton = (ImageButton) findViewById(R.id.ram1500);
        ramButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimeFrame();
            }
        });

        ImageButton fordButton = (ImageButton) findViewById(R.id.fordF150);
        fordButton.setOnClickListener(new View.OnClickListener() {
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
