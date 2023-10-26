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
        otherTitles.add("Toyota altezza V2 front bumper");
        otherTitles.add("Clutch & Dual Mass Flywheel Kit");
        otherTitles.add("Formula Atlantic 4age engine");
        otherTitles.add("VOLKSWAGEN GOLF POLO PASSAT CARPLAY");
        otherTitles.add("SPORTCHIP ecu remapping and tuning");
        otherTitles.add("Mitsubshi outlander front end");
        otherTitles.add("Mazda mx5 NC mk3 for breaking");
        otherTitles.add("Motorbike gear");
        otherTitles.add("Akrapovic exhaust tenere 700.");
        otherTitles.add("S1000 rr parts");
        otherTitles.add("X-Lite X-803 RS Ultra Carbon Helmet");
        otherTitles.add("Motorcycle jacket & pants");
        otherTitles.add("Kawasaki zx10 r wheels");
        otherTitles.add("Harley Davidson wind deflectors");
        otherTitles.add("Motorcycle Trailer");

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
        otherPrice.add(350);
        otherPrice.add(379);
        otherPrice.add(20000);
        otherPrice.add(250);
        otherPrice.add(150);
        otherPrice.add(1000);
        otherPrice.add(1);
        otherPrice.add(200);
        otherPrice.add(550);
        otherPrice.add(150);
        otherPrice.add(420);
        otherPrice.add(350);
        otherPrice.add(450);
        otherPrice.add(50);
        otherPrice.add(450);

        // data for other images
        otherImage.add(R.drawable.other1);
        otherImage.add(R.drawable.other2);
        otherImage.add(R.drawable.other3);
        otherImage.add(R.drawable.other4);
        otherImage.add(R.drawable.other5);
        otherImage.add(R.drawable.other6);
        otherImage.add(R.drawable.other7);
        otherImage.add(R.drawable.other8);
        otherImage.add(R.drawable.other9);
        otherImage.add(R.drawable.other10);
        otherImage.add(R.drawable.other11);
        otherImage.add(R.drawable.other12);
        otherImage.add(R.drawable.other13);
        otherImage.add(R.drawable.other14);
        otherImage.add(R.drawable.other15);

        // data for other URLs
        otherUrl.add(context.getString(R.string.otherUrl1));
        otherUrl.add(context.getString(R.string.otherUrl2));
        otherUrl.add(context.getString(R.string.otherUrl3));
        otherUrl.add(context.getString(R.string.otherUrl4));
        otherUrl.add(context.getString(R.string.otherUrl5));
        otherUrl.add(context.getString(R.string.otherUrl6));
        otherUrl.add(context.getString(R.string.otherUrl7));
        otherUrl.add(context.getString(R.string.otherUrl8));
        otherUrl.add(context.getString(R.string.otherUrl9));
        otherUrl.add(context.getString(R.string.otherUrl10));
        otherUrl.add(context.getString(R.string.otherUrl11));
        otherUrl.add(context.getString(R.string.otherUrl12));
        otherUrl.add(context.getString(R.string.otherUrl13));
        otherUrl.add(context.getString(R.string.otherUrl14));
        otherUrl.add(context.getString(R.string.otherUrl15));
    }

}
