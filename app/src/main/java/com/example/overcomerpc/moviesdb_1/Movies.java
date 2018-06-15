package com.example.overcomerpc.moviesdb_1;

import android.net.Uri;

public class Movies {

    private String mId;
    private String mTitle;
    private String mReleaseDate;
    private String mVoteAverage;
    private String mOverview;
    private int mPosterPath;

    public Movies(String Id, String Title, String ReleaseDate, String VoteAverage, String Overview, int PosterPath) {
        mId = Id;
        mTitle = Title;
        mReleaseDate = ReleaseDate;
        mVoteAverage = VoteAverage;
        mOverview = Overview;
        mPosterPath = PosterPath;
    }

    public String getId() {
        return mId;
    }

    public void setId(String Id) {
        this.mId = Id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String Title) {
        this.mTitle = Title;
    }

    public String getReleaseDate() {
        return mReleaseDate;
    }

    public void setReleaseDate(String ReleaseDate) {
        mReleaseDate = ReleaseDate;
    }

    public String getVoteAverage() {
        return mVoteAverage;
    }

    public void setVoteAverage(String VoteAverage) {
        mVoteAverage = VoteAverage;
    }

    public String getOverview() {
        return mOverview;
    }

    public void setOverview(String Overview) {
        mOverview = Overview;
    }

    public int getPosterPath() {
        return mPosterPath;
    }

    public void setPosterPath(int PosterPath) {
        this.mPosterPath = PosterPath;
    }
}
