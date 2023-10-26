//Patryk Malinowski
//R00210173
//Garage App Project

package com.example.myapplication;

import java.util.ArrayList;

public class TitleCharLimit {
    public static void limitTitleLength(ArrayList<String> titles) {
        // limit the length of each listing title to 25 characters
        for (int i = 0; i < titles.size(); i++) {
            String originalTitle = titles.get(i);

            // limit the listing title to 25 characters
            String limitedTitle;
            if (originalTitle.length() > 25) {
                // if the original title is longer than 25 characters, truncate it to 25 characters and add an ellipsis (...)
                limitedTitle = originalTitle.substring(0, 25) + "...";
            } else {
                limitedTitle = originalTitle;
            }

            titles.set(i, limitedTitle);
        }
    }
}
