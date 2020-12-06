package com.example.anusaanth.speedyrentals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TimeFrameActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_frame);


        Button nextButton = (Button) findViewById(R.id.next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPay();
            }
        });

        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("0");
        categories.add("1");
        categories.add("2");
        categories.add("3");
        categories.add("4");
        categories.add("5");
        categories.add("6");
        categories.add("7");
        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);


        // Spinner element
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);

        // Spinner click listener
        spinner2.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories2 = new ArrayList<String>();
        categories2.add("0");
        categories2.add("1");
        categories2.add("2");
        categories2.add("3");
        categories2.add("4");
        categories2.add("5");
        categories2.add("6");
        categories2.add("7");
        categories2.add("8");
        categories2.add("9");
        categories2.add("10");
        categories2.add("11");
        categories2.add("12");
        categories2.add("13");
        categories2.add("14");
        categories2.add("15");
        categories2.add("16");
        categories2.add("17");
        categories2.add("18");
        categories2.add("19");
        categories2.add("20");
        categories2.add("21");
        categories2.add("22");
        categories2.add("23");
        categories2.add("24");


        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories2);

        // Drop down layout style - list view with radio button
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        spinner2.setAdapter(dataAdapter2);


    }


    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

    private void openPay(){

        Intent intent = new Intent(this,PayActivity.class);
        startActivity(intent);
    }
}
