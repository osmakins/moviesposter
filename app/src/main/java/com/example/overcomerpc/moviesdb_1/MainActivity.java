package com.example.overcomerpc.moviesdb_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Movies> MovieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MovieList = new ArrayList<>();
        MovieList.add(new Movies("#1", "The Avengers", "2008", "7", "And the battle goes on and on for the avengers", R.drawable.avengers));
        MovieList.add(new Movies("#2", "The Desire", "2008", "7", "To lust, to desire and to covet", R.drawable.covet));
        MovieList.add(new Movies("#3", "DeadPool 2", "2008", "7", "The deadpool movie 2", R.drawable.deadpool));
        MovieList.add(new Movies("#4", "Girl Lost", "2008", "7", "The girls are lost?", R.drawable.girllost));
        MovieList.add(new Movies("#5", "Interstellar", "2008", "7", "The planet and the universe.", R.drawable.interstellar));
        MovieList.add(new Movies("#6", "Jurassic", "2008", "7", "The ancient earth dwellers.", R.drawable.jurassic));
        MovieList.add(new Movies("#7", "Black Panther", "2008", "7", "The story of the wakanda kingdom", R.drawable.panther));
        MovieList.add(new Movies("#8", "Thor Ragnarok", "2008", "7", "And the battle goes on and on for the Ragnarok", R.drawable.thor));
        MovieList.add(new Movies("#9", "Tomb Raiders", "2008", "7", "Who dares raid the tomb? Check it out!", R.drawable.tombraider));
        MovieList.add(new Movies("#10", "Wonder Woman", "2008", "7", "She is just so wonderful. She is wonder woman.", R.drawable.wonderwoman));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.movies_recyclerview);
        MoviesAdapter moviesAdapter = new MoviesAdapter(this, MovieList);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.setAdapter(moviesAdapter);
    }
}
