package com.example.anusaanth.speedyrentals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);

        Button PayButton = (Button) findViewById(R.id.pay);
        PayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDropOff();
            }
        });
    }

    private void openDropOff(){

        Intent intent = new Intent(this,DropOffActivity.class);
        startActivity(intent);
    }
}
