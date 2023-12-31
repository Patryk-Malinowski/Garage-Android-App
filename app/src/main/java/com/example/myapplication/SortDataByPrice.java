//Patryk Malinowski
//R00210173
//Garage App Project

package com.example.myapplication;

import java.util.ArrayList;

public class SortDataByPrice {
    protected static void sort(ArrayList<String> titles, ArrayList<String> years, ArrayList<Integer> prices, ArrayList<Integer> images, ArrayList<String> url) {
        // Sort the data in parallel arrays based on prices using bubble sort
        int n = prices.size();
        boolean swapped = true;

        while (swapped) { // if no swap has occurred after passing through the arrayList, exit loop
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (prices.get(i - 1) > prices.get(i)) {
                    // Swap titles
                    String tempTitle = titles.get(i - 1);
                    titles.set(i - 1, titles.get(i));
                    titles.set(i, tempTitle);

                    // Swap years
                    String tempYear = years.get(i - 1);
                    years.set(i - 1, years.get(i));
                    years.set(i, tempYear);

                    // Swap prices
                    int tempPrice = prices.get(i - 1);
                    prices.set(i - 1, prices.get(i));
                    prices.set(i, tempPrice);

                    // Swap images
                    int tempImage = images.get(i - 1);
                    images.set(i - 1, images.get(i));
                    images.set(i, tempImage);

                    // Swap urls
                    String tempUrl = url.get(i - 1);
                    url.set(i - 1, url.get(i));
                    url.set(i, tempUrl);

                    swapped = true;
                }
            }
        }
    }
}
