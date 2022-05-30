package com.example.dreamdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MoreActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView bottom_home, bottom_search , bottom_card, bottom_like;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        bottom_home = findViewById(R.id.bottom_like);
        bottom_home.setOnClickListener(this);

        bottom_search = findViewById(R.id.bottom_search);
        bottom_search.setOnClickListener(this);

        bottom_card = findViewById(R.id.bottom_card);
        bottom_card.setOnClickListener(this);

        bottom_like = findViewById(R.id.bottom_more);
        bottom_like.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.bottom_home) {
            Intent intent01 = new Intent(MoreActivity.this, MainActivity.class);
            startActivity(intent01);
        }
        if(view.getId() == R.id.bottom_search) {
            Intent intent02 = new Intent(MoreActivity.this, SearchActivity.class);
            startActivity(intent02);
        }
        if(view.getId() == R.id.bottom_card) {
            Intent intent03 = new Intent(MoreActivity.this, CardActivity.class);
            startActivity(intent03);
        }
        if(view.getId() == R.id.bottom_like) {
            Intent intent04 = new Intent(MoreActivity.this, LikeActivity.class);
            startActivity(intent04);
        }
    }
}