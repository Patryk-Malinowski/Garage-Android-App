//Patryk Malinowski
//R00210173
//Garage App Project

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener{
    MyRecyclerViewAdapter carListings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // set the content view to the layout defined in activity_recycler_view.xml
        setContentView(R.layout.activity_recycler_view);

        // find the RecyclerView by its ID
        RecyclerView rv = findViewById(R.id.recyclerView1);

        // sample data for car titles
        ArrayList<String> carTitles = new ArrayList<>();
        carTitles.add("Mercedes C250 AMG");
        carTitles.add("Audi A6 S-Line");
        carTitles.add("181 Range Rover Sport");

        // limit the length of each title to 45 characters
        for (int i = 0; i < carTitles.size(); i++) {
            String originalTitle = carTitles.get(i);

            // limit the title to 45 characters
            String limitedTitle;
            if (originalTitle.length() > 45) {
                // if the original title is longer than 45 characters, truncate it to 45 characters and add an ellipsis (...)
                limitedTitle = originalTitle.substring(0, 45) + "...";
            } else {
                limitedTitle = originalTitle;
            }

            carTitles.set(i, limitedTitle);
        }

        // sample data for car years
        ArrayList<String> carYear = new ArrayList<>();
        carYear.add("2020");
        carYear.add("2019");
        carYear.add("2018");

        // sample data for car price
        ArrayList<Integer> carPrice = new ArrayList<>();
        carPrice.add(20000);
        carPrice.add(15000);
        carPrice.add(35000);

        // sample data for car images
        ArrayList<Integer> carImage = new ArrayList<>();
        carImage.add(R.drawable.default_car_image);
        carImage.add(R.drawable.audi);
        carImage.add(R.drawable.default_car_image);

        // sets up RecycleView with a LinearLayoutManager
        rv.setLayoutManager(new LinearLayoutManager(this));

        // create an instance of the custom adapter (MyRecyclerViewAdapter) with the sample data
        carListings = new MyRecyclerViewAdapter(this, carTitles, carYear, carPrice, carImage);

        // set the click listener for the adapter allowing the handling of click events within the RecycleView
        carListings.setClickListener(this);

        // set carListings as the adapter for RecyclerView (rv)
        rv.setAdapter(carListings);


    }


    // toast method triggered when an item in the RecyclerView is clicked
    @Override
    public void onItemClick(View view, int position) {
        // Show a toast message indicating the clicked item for testing purposes
        Toast.makeText(RecyclerViewActivity.this, "You clicked on " + carListings.getItem(position), Toast.LENGTH_SHORT).show();
    }


}