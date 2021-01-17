package com.example.wheelpick;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;


public class AnimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime);

        // hide the default actionbar
        getSupportActionBar().hide();

        // Recieve data

        String name  = getIntent().getExtras().getString("anime_name");
        String description = getIntent().getExtras().getString("anime_description");
        String studio = getIntent().getExtras().getString("anime_studio") ;
        String category = getIntent().getExtras().getString("anime_category");
        int nb_episode = getIntent().getExtras().getInt("anime_nb_episode") ;
        String rating = getIntent().getExtras().getString("anime_rating") ;
        String image_url = getIntent().getExtras().getString("anime_img") ;

        // ini views

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsingtoolbar_id);
        collapsingToolbarLayout.setTitleEnabled(true);

}
