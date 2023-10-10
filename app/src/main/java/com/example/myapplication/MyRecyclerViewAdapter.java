//Patryk Malinowski
//R00210173
//Garage App Project

package com.example.myapplication;

import android.content.Context;
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

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    private List<String> mData; // car title
    private List<String> mYear; // car year
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;

    // constructor
    public MyRecyclerViewAdapter(Context context, List<String> mData, List<String> mYear) {
        this.mData = mData;
        this.mYear = mYear;
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
        String name = mData.get(position);
        String year = mYear.get(position);
        holder.carTitle.setText(name);
        holder.carYear.setText(year);


        // Use Glide to load images into ImageView
        Glide.with(holder.itemView.getContext())
                .load(R.drawable.default_car_image)
                .fitCenter()
                .apply(new RequestOptions().override(600, 200))
                .into(holder.myImageView);
    }


    public String getItem(int id){
        return mData.get(id);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView carTitle, carYear;
        ImageView myImageView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            carTitle = itemView.findViewById(R.id.carTitle);
            itemView.setOnClickListener(this);
            carYear = itemView.findViewById(R.id.carYear);
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















}
