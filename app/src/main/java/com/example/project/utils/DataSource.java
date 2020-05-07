package com.example.project.utils;

import com.example.project.R;
import com.example.project.models.Movie;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public static List<Movie> getPopularMovies(){
        List<Movie> lstMovies = new ArrayList<>();
        lstMovies.add(new Movie("Ant-Man", R.drawable.antman, R.drawable.antman_cover));
        lstMovies.add(new Movie("Black Panther", R.drawable.black, R.drawable.black_cover));
        lstMovies.add(new Movie("Black Widow", R.drawable.blackwidow,R.drawable.blackwidow_cover));
        lstMovies.add(new Movie("Black Widow", R.drawable.blackwidow));
        lstMovies.add(new Movie("Black Widow", R.drawable.blackwidow));
        lstMovies.add(new Movie("Black Widow", R.drawable.blackwidow));
        return lstMovies;
    }

    public static List<Movie> getWeekMovies(){
        List<Movie> lstMovies = new ArrayList<>();
        lstMovies.add(new Movie("Avengers", R.drawable.avengers,R.drawable.avengers_cover));
        lstMovies.add(new Movie("Spiderman: Far From Home", R.drawable.spiderman,R.drawable.spiderman_cover));
        lstMovies.add(new Movie("Thor: Ragnarok", R.drawable.thor,R.drawable.thor_cover));
        lstMovies.add(new Movie("Spiderman: Far From Home", R.drawable.spiderman,R.drawable.spiderman_cover));

        return lstMovies;
    }

}
