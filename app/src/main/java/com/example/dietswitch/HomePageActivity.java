package com.example.dietswitch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.dietswitch.adapter.KetoFoodAdapter;
import com.example.dietswitch.adapter.PopularFoodAdapter;
import com.example.dietswitch.model.KetoFood;
import com.example.dietswitch.model.PopularFood;

import java.util.ArrayList;
import java.util.List;

public class HomePageActivity extends AppCompatActivity {

    RecyclerView popularRecycler, ketoRecycler;
    PopularFoodAdapter popularFoodAdapter;
    KetoFoodAdapter ketoFoodAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        List<PopularFood> popularFoodList = new ArrayList<>();

        popularFoodList.add(new PopularFood("Avocado Toast","116",R.drawable.avocado_toast));
        popularFoodList.add(new PopularFood("Granola cups with frozen yogurt","262",R.drawable.granola_cups_with_frozen_yogurt));
        popularFoodList.add(new PopularFood("Breakfast Parfait","292",R.drawable.breakfast_parfiat));
        popularFoodList.add(new PopularFood("Salmon & avocado salad","460",R.drawable.salmon_avocado_salad));

        setPopularRecycler(popularFoodList);

        List<KetoFood> ketoFoodList = new ArrayList<>();
        ketoFoodList.add(new KetoFood("Keto hot chocolate","142",R.drawable.keto_hot_chocolate,"4.5"));
        ketoFoodList.add(new KetoFood("Zoodles with avocado sauce","245",R.drawable.zucchini_noodles_with_avocado_sauce,"3.5"));
        ketoFoodList.add(new KetoFood("Keto yogurt granola with berries","187",R.drawable.keto_breakfast_yogurt__granola___berries,"4.0"));

        setKetoRecycler(ketoFoodList);
    }

    private void setPopularRecycler(List<PopularFood> popularFoodList){

        popularRecycler = findViewById(R.id.popular_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        popularRecycler.setLayoutManager(layoutManager);
        popularFoodAdapter = new PopularFoodAdapter(this, popularFoodList);
        popularRecycler.setAdapter(popularFoodAdapter);
    }

    private void setKetoRecycler(List<KetoFood> ketoFoodList){

        ketoRecycler = findViewById(R.id.keto_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        ketoRecycler.setLayoutManager(layoutManager);
        ketoFoodAdapter = new KetoFoodAdapter(this, ketoFoodList);
        ketoRecycler.setAdapter(ketoFoodAdapter);
    }
}