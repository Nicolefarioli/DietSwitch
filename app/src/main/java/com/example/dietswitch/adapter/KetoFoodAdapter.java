package com.example.dietswitch.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dietswitch.R;
import com.example.dietswitch.model.KetoFood;
import com.example.dietswitch.model.PopularFood;

import java.util.List;

public class KetoFoodAdapter extends RecyclerView.Adapter <KetoFoodAdapter.KetoFoodViewHolder> {

    Context context;
    List<KetoFood> ketoFoodList;

    public KetoFoodAdapter(Context context, List<KetoFood> ketoFoodList) {
        this.context = context;
        this.ketoFoodList = ketoFoodList;
    }

    @NonNull
    @Override
    public KetoFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.keto_food_row_item,parent,false);
        return new KetoFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(KetoFoodViewHolder holder, int position) {
        holder.foodImage.setImageResource(ketoFoodList.get(position).getImageUrl());
        holder.name.setText(ketoFoodList.get(position).getName());
        holder.Kcal.setText(ketoFoodList.get(position).getKcal());
        holder.rating.setText(ketoFoodList.get(position).getRating());
    }

    @Override
    public int getItemCount() {
        return ketoFoodList.size();
    }


    public static final class KetoFoodViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView Kcal,name,rating;

        public KetoFoodViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.food_image);
            Kcal = itemView.findViewById(R.id.Kcal);
            name = itemView.findViewById(R.id.food_name);
            rating = itemView.findViewById(R.id.rating);
        }
    }

}
