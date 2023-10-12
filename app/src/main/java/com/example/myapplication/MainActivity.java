//Patryk Malinowski
//R00210173
//Garage App Project

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton cars = findViewById(R.id.imageButtonCars);
        ImageButton bikes = findViewById(R.id.imageButtonBikes);
        ImageButton other = findViewById(R.id.imageButtonOther);


        // cars imageButton
        cars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // creates new intent that navigates from MainActivity to RecyclerViewActivity
                Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);

                // add category information to the Intent
                intent.putExtra("category", "cars");

                startActivity(intent);
            }
        });

        // bikes imageButton
        bikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // creates new intent that navigates from MainActivity to RecyclerViewActivity
                Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);

                // add category information to the Intent
                intent.putExtra("category", "bikes");

                startActivity(intent);
            }
        });

        // other imageButton
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // creates new intent that navigates from MainActivity to RecyclerViewActivity
                Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);

                // add category information to the Intent
                intent.putExtra("category", "other");

                startActivity(intent);
            }
        });











    }



}