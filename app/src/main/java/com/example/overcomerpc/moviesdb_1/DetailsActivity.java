package com.example.overcomerpc.moviesdb_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView tv_movie_title, tv_release_date, tv_overview, tv_average_vote;
    private ImageView iv_movie_poster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // The views
        tv_movie_title = (TextView) findViewById(R.id.title_content);
        tv_release_date = (TextView) findViewById(R.id.release_date_content);
        tv_average_vote = (TextView) findViewById(R.id.vote_average_content);
        tv_overview = (TextView) findViewById(R.id.overview_content);
        iv_movie_poster = (ImageView) findViewById(R.id.image_posterpath);


        // Receive data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Overview = intent.getExtras().getString("Overview");
        String VoteAverage = intent.getExtras().getString("Average Vote");
        String ReleaseDate = intent.getExtras().getString("Date Released");
        int PosterPath = intent.getExtras().getInt("Poster Path");

        // Setting the values
        tv_movie_title.setText(Title);
        tv_overview.setText(Overview);
        tv_average_vote.setText(VoteAverage);
        tv_release_date.setText(ReleaseDate);
        iv_movie_poster.setImageResource(PosterPath);
    }
}
