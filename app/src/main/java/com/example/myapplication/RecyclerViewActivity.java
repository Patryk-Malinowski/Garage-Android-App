//Patryk Malinowski
//R00210173
//Garage App Project

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {
    MyRecyclerViewAdapter carListings;


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

    }

    // update recyclerView with car data from ArrayLists
    private void updateRecyclerViewWithCars() {
        // data for car titles
        ArrayList<String> carTitles = new ArrayList<>();
        carTitles.add("");
        carTitles.add("");
        carTitles.add("");
        carTitles.add("");
        carTitles.add("");
        carTitles.add("");
        carTitles.add("");
        carTitles.add("");
        carTitles.add("");
        carTitles.add("");
        carTitles.add("");
        carTitles.add("");
        carTitles.add("");
        carTitles.add("");
        carTitles.add("");

        // data for car years
        ArrayList<String> carYear = new ArrayList<>();
        carYear.add("2000");
        carYear.add("2000");
        carYear.add("2000");
        carYear.add("2000");
        carYear.add("2000");
        carYear.add("2000");
        carYear.add("2000");
        carYear.add("2000");
        carYear.add("2000");
        carYear.add("2000");
        carYear.add("2000");
        carYear.add("2000");
        carYear.add("2000");
        carYear.add("2000");
        carYear.add("2000");

        // data for car price
        ArrayList<Integer> carPrice = new ArrayList<>();
        carPrice.add(0);
        carPrice.add(0);
        carPrice.add(0);
        carPrice.add(0);
        carPrice.add(0);
        carPrice.add(0);
        carPrice.add(0);
        carPrice.add(0);
        carPrice.add(0);
        carPrice.add(0);
        carPrice.add(0);
        carPrice.add(0);
        carPrice.add(0);
        carPrice.add(0);
        carPrice.add(0);

        // data for car images
        ArrayList<Integer> carImage = new ArrayList<>();
        carImage.add(R.drawable.default_car_image);
        carImage.add(R.drawable.default_car_image);
        carImage.add(R.drawable.default_car_image);
        carImage.add(R.drawable.default_car_image);
        carImage.add(R.drawable.default_car_image);
        carImage.add(R.drawable.default_car_image);
        carImage.add(R.drawable.default_car_image);
        carImage.add(R.drawable.default_car_image);
        carImage.add(R.drawable.default_car_image);
        carImage.add(R.drawable.default_car_image);
        carImage.add(R.drawable.default_car_image);
        carImage.add(R.drawable.default_car_image);
        carImage.add(R.drawable.default_car_image);
        carImage.add(R.drawable.default_car_image);
        carImage.add(R.drawable.default_car_image);


        carListings.updateData(this, carTitles, carYear, carPrice, carImage);


        // limit the length of each title to 25 characters
        for (int i = 0; i < carTitles.size(); i++) {
            String originalTitle = carTitles.get(i);

            // limit the title to 25 characters
            String limitedTitle;
            if (originalTitle.length() > 25) {
                // if the original title is longer than 25 characters, truncate it to 25 characters and add an ellipsis (...)
                limitedTitle = originalTitle.substring(0, 25) + "...";
            } else {
                limitedTitle = originalTitle;
            }

            carTitles.set(i, limitedTitle);
        }
    }

    // update recyclerView with bike data from ArrayLists
    private void updateRecyclerViewWithBikes() {

    }

    // update recyclerView with other data from ArrayLists
    private void updateRecyclerViewWithOther() {

    }





    // toast method triggered when an item in the RecyclerView is clicked
    @Override
    public void onItemClick(View view, int position) {
        // Show a toast message indicating the clicked item for testing purposes
        Toast.makeText(RecyclerViewActivity.this, "You clicked on " + carListings.getItem(position), Toast.LENGTH_SHORT).show();

        // retrieve the data for the clicked item
        String selectedTitle = carListings.getTitle(position);
//        String selectedYear = carListings.getYear(position);
//        int selectedPrice = carListings.getPrice(position);
        int selectedImageResource = carListings.getImageResource(position);

        // creates new intent that navigates from RecyclerViewActivity to ListingActivity
        Intent intent = new Intent(RecyclerViewActivity.this, ListingActivity.class);

        // put the selected data into the Intent as extras
        intent.putExtra("title", selectedTitle);
//        intent.putExtra("year", selectedYear);
//        intent.putExtra("price", selectedPrice);
        intent.putExtra("imageResource", selectedImageResource);


        startActivity(intent);
    }


}