package com.example.anusaanth.speedyrentals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FilterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);


        Button SedanSelectButton = (Button) findViewById(R.id.sedan);
        SedanSelectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSedanSelect();
            }
        });

        Button CoupeSelectButton = (Button) findViewById(R.id.coupe);
        CoupeSelectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCoupeSelect();
            }
        });

        Button SuvSelectButton = (Button) findViewById(R.id.suv);
        SuvSelectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSuvSelect();
            }
        });

        Button PickupSelectButton = (Button) findViewById(R.id.pickup);
        PickupSelectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPickupSelect();
            }
        });
    }



    private void openSedanSelect(){

        Intent intent = new Intent(this,SedanSelectActivity.class);
        startActivity(intent);
    }

    private void openCoupeSelect(){

        Intent intent = new Intent(this,CoupeSelectActivity.class);
        startActivity(intent);
    }

    private void openSuvSelect(){

        Intent intent = new Intent(this,SuvSelectActivity.class);
        startActivity(intent);
    }

    private void openPickupSelect(){

        Intent intent = new Intent(this,PickupSelectActivity.class);
        startActivity(intent);
    }
}
