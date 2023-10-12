//Patryk Malinowski
//R00210173
//Garage App Project

package com.example.myapplication;

import android.content.Context;
import android.icu.text.NumberFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;
import java.util.Locale;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    private List<String> titles; // car title
    private List<String> years; // car year
    private List<Integer> prices; // car price
    private List<Integer> images; // car image
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    // constructor
    public MyRecyclerViewAdapter(Context context, List<String> titles, List<String> years, List<Integer> prices, List<Integer> images) {
        this.titles = titles;
        this.years = years;
        this.prices = prices;
        this.images = images;
        this.mInflater = LayoutInflater.from(context);
    }

    // used to display appropriate data depending on what user chooses
    public void updateData(Context context, List<String> titles, List<String> years, List<Integer> prices, List<Integer> images) {
        this.titles = titles;
        this.years = years;
        this.prices = prices;
        this.images = images;
        this.mInflater = LayoutInflater.from(context);
    }



    public interface ItemClickListener{
        void onItemClick(View view, int position);

    }



    void setClickListener(ItemClickListener itemClickListener){
        this.mClickListener = itemClickListener;
    }




    // inflate the rows
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.listing_layout, parent, false);

        return new ViewHolder(view);
    }

    // load or set the data into the views
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String name = titles.get(position);
        String year = years.get(position);
        int price = prices.get(position); // price stored as int in case of calculations such as sort by price etc.

        // format the price with a comma for thousands and Euro symbol at the start of price
        String formattedPrice = formatPrice(price);

        holder.carPrice.setText(formattedPrice);
        holder.carTitle.setText(name);
        holder.carYear.setText(year);



        // get the image resource ID from the ArrayList
        int imageResourceId = images.get(position % images.size());

        // Use Glide to load images into ImageView
        Glide.with(holder.itemView.getContext())
                .load(imageResourceId)
                .fitCenter()
                .apply(new RequestOptions().override(500, 200))
                .into(holder.myImageView);
    }


    public String getItem(int id){
        return titles.get(id);
    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView carTitle, carYear, carPrice;
        ImageView myImageView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            carTitle = itemView.findViewById(R.id.carTitle);
            itemView.setOnClickListener(this);
            carYear = itemView.findViewById(R.id.carYear);
            itemView.setOnClickListener(this);
            carPrice = itemView.findViewById(R.id.carPrice);
            itemView.setOnClickListener(this);
            myImageView = itemView.findViewById(R.id.carImage);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null)
                mClickListener.onItemClick(view, getAdapterPosition());



        }
    }



    // helper method to format the price with a comma for thousands and add Euro symbol at the start of price
    private String formatPrice(int price) {
        // using NumberFormat to format the price with a comma for thousands
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.getDefault());
        // adding the Euro symbol when returning formatted price
        return "€" + numberFormat.format(price);
    }











}
