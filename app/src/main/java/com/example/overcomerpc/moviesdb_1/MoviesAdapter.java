package com.example.overcomerpc.moviesdb_1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

    private Context mContext;
    private List<Movies> mMovieLists;

    public MoviesAdapter(Context mContext, List<Movies> mMovieLists) {
        this.mContext = mContext;
        this.mMovieLists = mMovieLists;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_movie_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.textView_MovieTitle.setText(mMovieLists.get(position).getTitle());
        holder.imageView_MoviePoster.setImageResource(mMovieLists.get(position).getPosterPath());
        holder.cardView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, DetailsActivity.class);

                // passing data to fill the details activity
                intent.putExtra("Title", mMovieLists.get(position).getTitle());
                intent.putExtra("Overview", mMovieLists.get(position).getOverview());
                intent.putExtra("Date Released", mMovieLists.get(position).getReleaseDate());
                intent.putExtra("Average Vote", mMovieLists.get(position).getVoteAverage());
                intent.putExtra("Poster Path", mMovieLists.get(position).getPosterPath());

                // Start the activity
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mMovieLists.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView_MovieTitle;
        ImageView imageView_MoviePoster;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);

            textView_MovieTitle = (TextView) itemView.findViewById(R.id.movie_title);
            imageView_MoviePoster = (ImageView) itemView.findViewById(R.id.movie_poster);
            cardView = (CardView) itemView.findViewById(R.id.movie_cardview);
        }
    }
}
