package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ListingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);

        // retrieve data from the Intent
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String year = intent.getStringExtra("year");
        int price = intent.getIntExtra("price", 0);  // 0 is the default value if the key is not found
        int imageResource = intent.getIntExtra("imageResource", 0);

        // we use retrieved data and set it as TextView and ImageView
        TextView titleTextView = findViewById(R.id.textViewTitle);
        ImageView imageView = findViewById(R.id.imageView);

        // set the ImageView height based on a percentage of the screen height
        double percentageOfScreenHeight = 0.35; // adjust the percentage as needed
        int screenHeight = getResources().getDisplayMetrics().heightPixels;
        int targetHeightInPixels = (int) (percentageOfScreenHeight * screenHeight);

        // Set the calculated dimensions to the ImageView
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
        layoutParams.height = targetHeightInPixels;
        imageView.setLayoutParams(layoutParams);

        titleTextView.setText(title);
        imageView.setImageResource(imageResource);


        // initialize buttons
        FloatingActionButton viewAdButton = findViewById(R.id.adButton);
        FloatingActionButton goBackButton = findViewById(R.id.backButton);
        FloatingActionButton homeButton = findViewById(R.id.homeButton);

        // set onClickListeners
        viewAdButton.setOnClickListener(v -> onViewAdClick());
        goBackButton.setOnClickListener(v -> onGoBackClick());
        homeButton.setOnClickListener(v -> onHomeClick());
    }

    public void onViewAdClick() {

    }

    public void onGoBackClick() {
        finish(); // close the current activity -> go to previous activity
    }

    public void onHomeClick() {
        // creates new intent that navigates from current activity to MainActivity
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); // clear the activity stack
        startActivity(intent);
    }


}