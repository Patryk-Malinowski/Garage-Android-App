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
        carListings = new MyRecyclerViewAdapter(this, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());

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
            updateRecyclerViewWithBikes();
        } else if ("other".equals(category)) {
            updateRecyclerViewWithOther();
        }

    // Find the switch
        SwitchCompat priceSwitch = findViewById(R.id.switchPrice);

        // Set an OnCheckedChangeListener for the switch
        priceSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            sortByPrice = isChecked;
            // use the category to determine which data to display
            if ("cars".equals(category)) {
                updateRecyclerViewWithCars();
            } else if ("bikes".equals(category)) {
                updateRecyclerViewWithBikes();
            } else if ("other".equals(category)) {
                updateRecyclerViewWithOther();
            }
        });
    }

    // update recyclerView with car data from ArrayLists
    private void updateRecyclerViewWithCars() {
        // Clear existing data
        CarData.carTitles.clear();
        CarData.carYear.clear();
        CarData.carPrice.clear();
        CarData.carImage.clear();
        CarData.carUrl.clear();


        CarData.loadCarData();


        if (sortByPrice) {
            SortDataByPrice.sort(CarData.carTitles, CarData.carYear, CarData.carPrice, CarData.carImage, CarData.carUrl);
            carListings.notifyDataSetChanged();
        }
        else {
            carListings.notifyDataSetChanged();
        }

        carListings.updateData(this, CarData.carTitles, CarData.carYear, CarData.carPrice, CarData.carImage, CarData.carUrl);

        TitleCharLimit.limitTitleLength(CarData.carTitles);
    }

    // update recyclerView with bike data from ArrayLists
    private void updateRecyclerViewWithBikes() {
        // Clear existing data
        BikeData.bikeTitles.clear();
        BikeData.bikeYear.clear();
        BikeData.bikePrice.clear();
        BikeData.bikeImage.clear();
        BikeData.bikeUrl.clear();

        BikeData.loadBikeData();


        if (sortByPrice) {
            SortDataByPrice.sort(BikeData.bikeTitles, BikeData.bikeYear, BikeData.bikePrice, BikeData.bikeImage, BikeData.bikeUrl);
            carListings.notifyDataSetChanged();
        }
        else {
            carListings.notifyDataSetChanged();
        }

        carListings.updateData(this, BikeData.bikeTitles, BikeData.bikeYear, BikeData.bikePrice, BikeData.bikeImage, BikeData.bikeUrl);

        TitleCharLimit.limitTitleLength(BikeData.bikeTitles);
    }

    // update recyclerView with other data from ArrayLists
    private void updateRecyclerViewWithOther() {
        // Clear existing data
        OtherData.otherTitles.clear();
        OtherData.otherYear.clear();
        OtherData.otherPrice.clear();
        OtherData.otherImage.clear();
        OtherData.otherUrl.clear();

        OtherData.loadOtherData();


        if (sortByPrice) {
            SortDataByPrice.sort(OtherData.otherTitles, OtherData.otherYear, OtherData.otherPrice, OtherData.otherImage, OtherData.otherUrl);
            carListings.notifyDataSetChanged();
        }
        else {
            carListings.notifyDataSetChanged();
        }

        carListings.updateData(this, OtherData.otherTitles, OtherData.otherYear, OtherData.otherPrice, OtherData.otherImage, OtherData.otherUrl);

        TitleCharLimit.limitTitleLength(OtherData.otherTitles);
    }





    @Override
    public void onItemClick(View view, int position) {
        // retrieve the data for the clicked item
        String selectedTitle = carListings.getTitle(position);
        int selectedImageResource = carListings.getImageResource(position);
        String selectedUrl = carListings.getUrl(position);

        // creates new intent that navigates from RecyclerViewActivity to ListingActivity
        Intent intent = new Intent(RecyclerViewActivity.this, ListingActivity.class);

        // put the selected data into the Intent as extras
        intent.putExtra("title", selectedTitle);
        intent.putExtra("imageResource", selectedImageResource);
        intent.putExtra("url", selectedUrl);


        startActivity(intent);
    }





}