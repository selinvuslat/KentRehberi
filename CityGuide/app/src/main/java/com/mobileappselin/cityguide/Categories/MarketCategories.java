package com.mobileappselin.cityguide.Categories;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.mobileappselin.cityguide.R;

public class MarketCategories extends AppCompatActivity {

    ImageView backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market_categories);

        backbtn = findViewById(R.id.back_pressed);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MarketCategories.super.onBackPressed();
            }
        });
    }
}