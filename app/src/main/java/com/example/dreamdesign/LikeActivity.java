package com.example.dreamdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LikeActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView bottom_home, bottom_search , bottom_card, bottom_more;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_like);

        bottom_home = findViewById(R.id.bottom_like);
        bottom_home.setOnClickListener(this);

        bottom_search = findViewById(R.id.bottom_search);
        bottom_search.setOnClickListener(this);

        bottom_card = findViewById(R.id.bottom_card);
        bottom_card.setOnClickListener(this);

        bottom_more = findViewById(R.id.bottom_more);
        bottom_more.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.bottom_home) {
            Intent intent01 = new Intent(LikeActivity.this, MainActivity.class);
            startActivity(intent01);
        }
        if(view.getId() == R.id.bottom_search) {
            Intent intent02 = new Intent(LikeActivity.this, SearchActivity.class);
            startActivity(intent02);
        }
        if(view.getId() == R.id.bottom_card) {
            Intent intent03 = new Intent(LikeActivity.this, CardActivity.class);
            startActivity(intent03);
        }
        if(view.getId() == R.id.bottom_more) {
            Intent intent04 = new Intent(LikeActivity.this, MoreActivity.class);
            startActivity(intent04);
        }
    }
}