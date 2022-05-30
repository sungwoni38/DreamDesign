package com.example.dreamdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SearchActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView bottom_home, bottom_like , bottom_card, bottom_more;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        bottom_like = findViewById(R.id.bottom_like);
        bottom_like.setOnClickListener(this);

        bottom_home = findViewById(R.id.bottom_search);
        bottom_home.setOnClickListener(this);

        bottom_card = findViewById(R.id.bottom_card);
        bottom_card.setOnClickListener(this);

        bottom_more = findViewById(R.id.bottom_more);
        bottom_more.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.bottom_like) {
            Intent intent01 = new Intent(SearchActivity.this, LikeActivity.class);
            startActivity(intent01);
        }
        if(view.getId() == R.id.bottom_home) {
            Intent intent02 = new Intent(SearchActivity.this, MainActivity.class);
            startActivity(intent02);
        }
        if(view.getId() == R.id.bottom_card) {
            Intent intent03 = new Intent(SearchActivity.this, CardActivity.class);
            startActivity(intent03);
        }
        if(view.getId() == R.id.bottom_more) {
            Intent intent04 = new Intent(SearchActivity.this, MoreActivity.class);
            startActivity(intent04);
        }
    }
}