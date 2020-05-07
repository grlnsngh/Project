package com.example.project.adapters;

import android.widget.ImageView;

import com.example.project.models.Movie;

public interface MovieItemClickListener {
    void onMovieClick(Movie movie, ImageView movieImageView); // we will need the imageview to make the shared animation between the two activity
}
