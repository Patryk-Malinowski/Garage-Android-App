//Patryk Malinowski
//R00210173
//Garage App Project

package com.example.myapplication;

import android.content.Context;

import java.util.ArrayList;

public class CarData {
    public static ArrayList<String> carTitles = new ArrayList<>();
    public static ArrayList<String> carYear = new ArrayList<>();
    public static ArrayList<Integer> carPrice = new ArrayList<>();
    public static ArrayList<Integer> carImage = new ArrayList<>();
    public static ArrayList<String> carUrl = new ArrayList<>();
    public static void loadCarData(Context context) {


        // data for car titles
        carTitles.add("Nissan Juke");
        carTitles.add("Toyota AYGO");
        carTitles.add("Nissan Note");
        carTitles.add("Volkswagen UP");
        carTitles.add("Renault Captur");
        carTitles.add("Ford Fiesta");
        carTitles.add("Fiat 500");
        carTitles.add("Opel Corsa");
        carTitles.add("Hyundai IX35");
        carTitles.add("SEAT Ibiza");
        carTitles.add("Ford Focus");
        carTitles.add("Ford Fiesta");
        carTitles.add("Kia Venga");
        carTitles.add("Volkswagen Polo");
        carTitles.add("Volkswagen Polo");

        // data for car years
        carYear.add("2015");
        carYear.add("2015");
        carYear.add("2015");
        carYear.add("2014");
        carYear.add("2014");
        carYear.add("2015");
        carYear.add("2015");
        carYear.add("2017");
        carYear.add("2015");
        carYear.add("2016");
        carYear.add("2015");
        carYear.add("2015");
        carYear.add("2018");
        carYear.add("2015");
        carYear.add("2015");

        // data for car price
        carPrice.add(12995);
        carPrice.add(9495);
        carPrice.add(9995);
        carPrice.add(9995);
        carPrice.add(10495);
        carPrice.add(10495);
        carPrice.add(10995);
        carPrice.add(10995);
        carPrice.add(11945);
        carPrice.add(11950);
        carPrice.add(11995);
        carPrice.add(11995);
        carPrice.add(12250);
        carPrice.add(12450);
        carPrice.add(12450);

        // data for car images
        carImage.add(R.drawable.car16);
        carImage.add(R.drawable.car2);
        carImage.add(R.drawable.car3);
        carImage.add(R.drawable.car4);
        carImage.add(R.drawable.car5);
        carImage.add(R.drawable.car6);
        carImage.add(R.drawable.car7);
        carImage.add(R.drawable.car8);
        carImage.add(R.drawable.car9);
        carImage.add(R.drawable.car10);
        carImage.add(R.drawable.car11);
        carImage.add(R.drawable.car12);
        carImage.add(R.drawable.car13);
        carImage.add(R.drawable.car14);
        carImage.add(R.drawable.car15);

        // data for car URLs
        carUrl.add(context.getString(R.string.carUrl1));
        carUrl.add(context.getString(R.string.carUrl2));
        carUrl.add(context.getString(R.string.carUrl3));
        carUrl.add(context.getString(R.string.carUrl4));
        carUrl.add(context.getString(R.string.carUrl5));
        carUrl.add(context.getString(R.string.carUrl6));
        carUrl.add(context.getString(R.string.carUrl7));
        carUrl.add(context.getString(R.string.carUrl8));
        carUrl.add(context.getString(R.string.carUrl9));
        carUrl.add(context.getString(R.string.carUrl10));
        carUrl.add(context.getString(R.string.carUrl11));
        carUrl.add(context.getString(R.string.carUrl12));
        carUrl.add(context.getString(R.string.carUrl13));
        carUrl.add(context.getString(R.string.carUrl14));
        carUrl.add(context.getString(R.string.carUrl15));
    }

}
