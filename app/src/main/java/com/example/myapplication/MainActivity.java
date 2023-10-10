//Patryk Malinowski
//R00210173
//Garage App Project

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button cars = findViewById(R.id.buttonCars);
        Button bikes = findViewById(R.id.buttonBikes);
        Button other = findViewById(R.id.buttonOther);


        // cars button
        cars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                startActivity(intent);
                finish();
            }
        });

        // bikes button
        bikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // other button
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });











    }



}