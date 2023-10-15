//Patryk Malinowski
//R00210173
//Garage App Project

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {
    MyRecyclerViewAdapter carListings;
    private boolean sortByPrice = false; // Default: do not sort by price



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // set the content view to the layout defined in activity_recycler_view.xml
        setContentView(R.layout.activity_recycler_view);

        // find the RecyclerView by its ID
        RecyclerView rv = findViewById(R.id.recyclerView1);

        // sets up RecycleView with a LinearLayoutManager
        rv.setLayoutManager(new LinearLayoutManager(this));

        // instantiate the carListings adapter
        carListings = new MyRecyclerViewAdapter(this, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

        // set the click listener for the adapter allowing the handling of click events within the RecycleView
        carListings.setClickListener(this);

        // set carListings as the adapter for RecyclerView (rv)
        rv.setAdapter(carListings);

        // retrieve the category from the intent
        String category = getIntent().getStringExtra("category");


        // use the category to determine which data to display
        if ("cars".equals(category)) {
            updateRecyclerViewWithCars();
        } else if ("bikes".equals(category)) {

        } else if ("other".equals(category)) {
        }

    // Find the switch
        SwitchCompat priceSwitch = findViewById(R.id.switchPrice);

        // Set an OnCheckedChangeListener for the switch
        priceSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            sortByPrice = isChecked;
            updateRecyclerViewWithCars(); // Call a method to update RecyclerView based on the sorting option
        });
    }

    // update recyclerView with car data from ArrayLists
    private void updateRecyclerViewWithCars() {
        CarData.loadCarData();


        if (sortByPrice) {
            SortDataByPrice.sort(CarData.carTitles, CarData.carYear, CarData.carPrice, CarData.carImage);
            carListings.notifyDataSetChanged();
        }
        else {
            carListings.notifyDataSetChanged();
        }

        carListings.updateData(this, CarData.carTitles, CarData.carYear, CarData.carPrice, CarData.carImage);


        // limit the length of each title to 25 characters
        for (int i = 0; i < CarData.carTitles.size(); i++) {
            String originalTitle = CarData.carTitles.get(i);

            // limit the title to 25 characters
            String limitedTitle;
            if (originalTitle.length() > 25) {
                // if the original title is longer than 25 characters, truncate it to 25 characters and add an ellipsis (...)
                limitedTitle = originalTitle.substring(0, 25) + "...";
            } else {
                limitedTitle = originalTitle;
            }

            CarData.carTitles.set(i, limitedTitle);
        }
    }

    // update recyclerView with bike data from ArrayLists
    private void updateRecyclerViewWithBikes() {

    }

    // update recyclerView with other data from ArrayLists
    private void updateRecyclerViewWithOther() {

    }





    @Override
    public void onItemClick(View view, int position) {
        // retrieve the data for the clicked item
        String selectedTitle = carListings.getTitle(position);
       int selectedImageResource = carListings.getImageResource(position);

        // creates new intent that navigates from RecyclerViewActivity to ListingActivity
        Intent intent = new Intent(RecyclerViewActivity.this, ListingActivity.class);

        // put the selected data into the Intent as extras
        intent.putExtra("title", selectedTitle);
        intent.putExtra("imageResource", selectedImageResource);


        startActivity(intent);
    }


}