package com.example.dreamdesign;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView bottom_like, bottom_search , bottom_card, bottom_more;
    ImageView img_notification;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        bottom_like = findViewById(R.id.bottom_like);
        bottom_like.setOnClickListener(this);

        bottom_search = findViewById(R.id.bottom_search);
        bottom_search.setOnClickListener(this);

        bottom_card = findViewById(R.id.bottom_card);
        bottom_card.setOnClickListener(this);

        bottom_more = findViewById(R.id.bottom_more);
        bottom_more.setOnClickListener(this);

        img_notification = findViewById(R.id.img_notification);
        img_notification.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.bottom_like) {
            Intent intent01 = new Intent(MainActivity.this, LikeActivity.class);
            startActivity(intent01);
        }
        if(view.getId() == R.id.bottom_search) {
            Intent intent02 = new Intent(MainActivity.this, SearchActivity.class);
            startActivity(intent02);
        }
        if(view.getId() == R.id.bottom_card) {
            Intent intent03 = new Intent(MainActivity.this, CardActivity.class);
            startActivity(intent03);
        }
        if(view.getId() == R.id.bottom_more) {
            Intent intent04 = new Intent(MainActivity.this, MoreActivity.class);
            startActivity(intent04);
        }
        if(view.getId() == R.id.img_notification) {
            Intent intent05 = new Intent(MainActivity.this, NotiActivity.class);
            startActivity(intent05);
        }
    }
}