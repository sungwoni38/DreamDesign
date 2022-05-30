package com.example.dreamdesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CardActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView bottom_home, bottom_search , bottom_like, bottom_more;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        bottom_home = findViewById(R.id.bottom_like);
        bottom_home.setOnClickListener(this);

        bottom_search = findViewById(R.id.bottom_search);
        bottom_search.setOnClickListener(this);

        bottom_like = findViewById(R.id.bottom_card);
        bottom_like.setOnClickListener(this);

        bottom_more = findViewById(R.id.bottom_more);
        bottom_more.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.bottom_home) {
            Intent intent01 = new Intent(CardActivity.this, MainActivity.class);
            startActivity(intent01);
        }
        if(view.getId() == R.id.bottom_search) {
            Intent intent02 = new Intent(CardActivity.this, SearchActivity.class);
            startActivity(intent02);
        }
        if(view.getId() == R.id.bottom_like) {
            Intent intent03 = new Intent(CardActivity.this, LikeActivity.class);
            startActivity(intent03);
        }
        if(view.getId() == R.id.bottom_more) {
            Intent intent04 = new Intent(CardActivity.this, MoreActivity.class);
            startActivity(intent04);
        }
    }
}