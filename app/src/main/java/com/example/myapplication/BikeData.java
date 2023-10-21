//Patryk Malinowski
//R00210173
//Garage App Project

package com.example.myapplication;

import android.content.Context;

import java.util.ArrayList;

public class BikeData {
    public static ArrayList<String> bikeTitles = new ArrayList<>();
    public static ArrayList<String> bikeYear = new ArrayList<>();
    public static ArrayList<Integer> bikePrice = new ArrayList<>();
    public static ArrayList<Integer> bikeImage = new ArrayList<>();
    public static ArrayList<String> bikeUrl = new ArrayList<>();
    public static void loadBikeData(Context context) {


        // data for bike titles
        bikeTitles.add("Kawasaki Z1000SX");
        bikeTitles.add("Harley Davidson 115th Anniversary FLHCS Heritage 114 Limited Edition");
        bikeTitles.add("Suzuki DL1050 V-Strom");
        bikeTitles.add("Triumph 1200 Speed Twin");
        bikeTitles.add("Suzuki DL1000 V-Strom");
        bikeTitles.add("Triumph Tiger 800 XRX");
        bikeTitles.add("Honda Africa Twin CRF1100 D2 Adventure Sports");
        bikeTitles.add("Yamaha MT-10");
        bikeTitles.add("Kawasaki Z1000SX Ninja");
        bikeTitles.add("Honda CBR500R");
        bikeTitles.add("Honda ADV350");
        bikeTitles.add("Honda Deauville NT700");
        bikeTitles.add("Yamaha XSR 700");
        bikeTitles.add("Ducati Supersport S");
        bikeTitles.add("Suzuki SV650");

        // data for bike years
        bikeYear.add("2020");
        bikeYear.add("2018");
        bikeYear.add("2020");
        bikeYear.add("2019");
        bikeYear.add("2019");
        bikeYear.add("2016");
        bikeYear.add("2019");
        bikeYear.add("2023");
        bikeYear.add("2023");
        bikeYear.add("2022");
        bikeYear.add("2023");
        bikeYear.add("2007");
        bikeYear.add("2018");
        bikeYear.add("2021");
        bikeYear.add("2005");

        // data for bike price
        bikePrice.add(13950);
        bikePrice.add(19999);
        bikePrice.add(11500);
        bikePrice.add(9950);
        bikePrice.add(10290);
        bikePrice.add(8590);
        bikePrice.add(18490);
        bikePrice.add(15290);
        bikePrice.add(17950);
        bikePrice.add(7490);
        bikePrice.add(7500);
        bikePrice.add(4590);
        bikePrice.add(7590);
        bikePrice.add(15690);
        bikePrice.add(3690);

        // data for bike images
        bikeImage.add(R.drawable.bike1);
        bikeImage.add(R.drawable.bike2);
        bikeImage.add(R.drawable.bike3);
        bikeImage.add(R.drawable.bike4);
        bikeImage.add(R.drawable.bike5);
        bikeImage.add(R.drawable.bike6);
        bikeImage.add(R.drawable.bike7);
        bikeImage.add(R.drawable.bike8);
        bikeImage.add(R.drawable.bike9);
        bikeImage.add(R.drawable.bike10);
        bikeImage.add(R.drawable.bike11);
        bikeImage.add(R.drawable.bike12);
        bikeImage.add(R.drawable.bike13);
        bikeImage.add(R.drawable.bike14);
        bikeImage.add(R.drawable.bike15);

        // data for bike URLs
        bikeUrl.add(context.getString(R.string.bikeUrl1));
        bikeUrl.add(context.getString(R.string.bikeUrl2));
        bikeUrl.add(context.getString(R.string.bikeUrl3));
        bikeUrl.add(context.getString(R.string.bikeUrl4));
        bikeUrl.add(context.getString(R.string.bikeUrl5));
        bikeUrl.add(context.getString(R.string.bikeUrl6));
        bikeUrl.add(context.getString(R.string.bikeUrl7));
        bikeUrl.add(context.getString(R.string.bikeUrl8));
        bikeUrl.add(context.getString(R.string.bikeUrl9));
        bikeUrl.add(context.getString(R.string.bikeUrl10));
        bikeUrl.add(context.getString(R.string.bikeUrl11));
        bikeUrl.add(context.getString(R.string.bikeUrl12));
        bikeUrl.add(context.getString(R.string.bikeUrl13));
        bikeUrl.add(context.getString(R.string.bikeUrl14));
        bikeUrl.add(context.getString(R.string.bikeUrl15));
    }

}
