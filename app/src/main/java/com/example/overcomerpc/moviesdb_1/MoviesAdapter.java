package com.example.overcomerpc.moviesdb_1;

import android.content.Context;
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
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.textView_MovieTitle.setText(mMovieLists.get(position).getTitle());
        holder.imageView_MoviePoster.setImageResource(mMovieLists.get(position).getPosterPath());

    }

    @Override
    public int getItemCount() {
        return mMovieLists.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView_MovieTitle;
        ImageView imageView_MoviePoster;

        public MyViewHolder(View itemView) {
            super(itemView);

            textView_MovieTitle = (TextView) itemView.findViewById(R.id.movie_title);
            imageView_MoviePoster = (ImageView) itemView.findViewById(R.id.movie_poster);
        }
    }
}
