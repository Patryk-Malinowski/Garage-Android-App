package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ListingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);

        // Retrieve data from the Intent
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String year = intent.getStringExtra("year");
        int price = intent.getIntExtra("price", 0);  // 0 is the default value if the key is not found
        int imageResource = intent.getIntExtra("imageResource", 0);

        // Now you can use the retrieved data as needed, e.g., set them to TextViews or ImageViews
        TextView titleTextView = findViewById(R.id.textViewTitle);
//        TextView yearTextView = findViewById(R.id.yearTextView);
//        TextView priceTextView = findViewById(R.id.priceTextView);
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
//        yearTextView.setText(year);
//        priceTextView.setText(String.valueOf(price));
        imageView.setImageResource(imageResource);
    }
}