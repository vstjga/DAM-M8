package com.proyectodam.peliculasdam2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.proyectodam.peliculasdam2.json.Result;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import com.proyectodam.peliculasdam2.json.*;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    public static String OBJETO_PELICULA = "OBJETO_PELICULA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Bundle b = getIntent().getExtras();
        Result result = b.getParcelable(MainActivityFragment.OBJETO_PELICULA);

     TextView titulo       = (TextView) findViewById(R.id.tituloPeli);
     TextView fechaEstrena = (TextView) findViewById(R.id.fechaEstrena);
     TextView popularidad = (TextView) findViewById(R.id.popularidad);
     TextView resumen = (TextView) findViewById(R.id.resumenPeli);
     ImageView ivPosterImage = (ImageView) findViewById(R.id.poster);

      fechaEstrena.setText(result.getrelease_date());
    popularidad.setText(result.getPopularity() + "%");
      titulo.setText(result.getTitle());
          resumen.setText(result.getOverview());

        String poster = result.getposter_path();
        //      String url_img = "http://image.tmdb.org/t/p/w300/8uO0gUM8aNqYLs1OsTBQiXu0fEv.jpg";
        String url_img = "http://image.tmdb.org/t/p/w600" + poster;
         Picasso.with(this).load(url_img).into(ivPosterImage);


    }



}
