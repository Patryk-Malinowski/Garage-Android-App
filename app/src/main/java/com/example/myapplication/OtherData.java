//Patryk Malinowski
//R00210173
//Garage App Project

package com.example.myapplication;

import android.content.Context;

import java.util.ArrayList;

public class OtherData {
    public static ArrayList<String> otherTitles = new ArrayList<>();
    public static ArrayList<Integer> otherPrice = new ArrayList<>();
    public static ArrayList<Integer> otherImage = new ArrayList<>();
    public static ArrayList<String> otherUrl = new ArrayList<>();
    public static ArrayList<String> otherYear = new ArrayList<>();
    public static void loadOtherData(Context context) {


        // data for other titles
        otherTitles.add("");
        otherTitles.add("");
        otherTitles.add("");
        otherTitles.add("");
        otherTitles.add("");
        otherTitles.add("");
        otherTitles.add("");
        otherTitles.add("");
        otherTitles.add("");
        otherTitles.add("");
        otherTitles.add("");
        otherTitles.add("");
        otherTitles.add("");
        otherTitles.add("");
        otherTitles.add("");

        // data for other years (NOT USED, ITS HERE TO SIMPLIFY THE LOADING LOGIC OF LISTINGS)
        otherYear.add("");
        otherYear.add("");
        otherYear.add("");
        otherYear.add("");
        otherYear.add("");
        otherYear.add("");
        otherYear.add("");
        otherYear.add("");
        otherYear.add("");
        otherYear.add("");
        otherYear.add("");
        otherYear.add("");
        otherYear.add("");
        otherYear.add("");
        otherYear.add("");


        // data for other price
        otherPrice.add(0);
        otherPrice.add(0);
        otherPrice.add(0);
        otherPrice.add(2);
        otherPrice.add(0);
        otherPrice.add(0);
        otherPrice.add(0);
        otherPrice.add(0);
        otherPrice.add(0);
        otherPrice.add(0);
        otherPrice.add(0);
        otherPrice.add(0);
        otherPrice.add(0);
        otherPrice.add(0);
        otherPrice.add(0);

        // data for other images
        otherImage.add(R.drawable.default_car_image);
        otherImage.add(R.drawable.default_car_image);
        otherImage.add(R.drawable.default_car_image);
        otherImage.add(R.drawable.default_car_image);
        otherImage.add(R.drawable.default_car_image);
        otherImage.add(R.drawable.default_car_image);
        otherImage.add(R.drawable.default_car_image);
        otherImage.add(R.drawable.default_car_image);
        otherImage.add(R.drawable.default_car_image);
        otherImage.add(R.drawable.default_car_image);
        otherImage.add(R.drawable.default_car_image);
        otherImage.add(R.drawable.default_car_image);
        otherImage.add(R.drawable.default_car_image);
        otherImage.add(R.drawable.default_car_image);
        otherImage.add(R.drawable.default_car_image);

        // data for other URLs
        otherUrl.add("");
        otherUrl.add("");
        otherUrl.add("");
        otherUrl.add("");
        otherUrl.add("");
        otherUrl.add("");
        otherUrl.add("");
        otherUrl.add("");
        otherUrl.add("");
        otherUrl.add("");
        otherUrl.add("");
        otherUrl.add("");
        otherUrl.add("");
        otherUrl.add("");
        otherUrl.add("");
    }

}
