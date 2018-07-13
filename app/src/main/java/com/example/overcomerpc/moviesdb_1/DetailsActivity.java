package com.example.overcomerpc.moviesdb_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailsActivity extends AppCompatActivity {

    @BindView(R.id.title_content) TextView tv_movie_title;
    @BindView(R.id.release_date_content) TextView tv_release_date;
    @BindView(R.id.vote_average_content) TextView tv_average_vote;
    @BindView(R.id.overview_content) TextView tv_overview;
    @BindView(R.id.image_posterpath) ImageView iv_movie_poster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);

        setupDetails();
    }

    private void setupDetails(){
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
