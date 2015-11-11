package com.proyectodam.peliculasdam2;

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

/**
 * Created by usuario1 on 8/11/15.
 */
public class ResultAdapter extends ArrayAdapter<Result> {

    public ResultAdapter(Context context, int resource, List<Result> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

       Result result = getItem(position);

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.lvpelis_row, parent, false);
        }

              TextView tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
        TextView tvCriticsScore = (TextView) convertView.findViewById(R.id.tvCriticsScore);
        TextView tvDate = (TextView) convertView.findViewById(R.id.tvDate);
        ImageView ivPosterImage = (ImageView) convertView.findViewById(R.id.ivPosterImage);

        tvTitle.setText(result.getTitle());
        tvCriticsScore.setText(result.getPopularity() + "%");

//        tvDate.setText(result.getOverview());
        tvDate.setText(result.getrelease_date());


        String poster = result.getposter_path();
 //      String url_img = "http://image.tmdb.org/t/p/w300/8uO0gUM8aNqYLs1OsTBQiXu0fEv.jpg";
        String url_img = "http://image.tmdb.org/t/p/w75" + poster;
        Picasso.with(getContext()).load(url_img).into(ivPosterImage);

        return convertView;
    }

}
