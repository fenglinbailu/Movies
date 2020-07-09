package com.neu.po;

public class Recommend_movie {
    private String m_id;

    private String recommend_movie_id;

    public String getmId() {
        return m_id;
    }

    public void setmId(String mId) {
        this.m_id = mId == null ? null : mId.trim();
    }

    public String getRecommendMovieId() {
        return recommend_movie_id;
    }

    public void setRecommendMovieId(String recommendMovieId) {
        this.recommend_movie_id = recommendMovieId == null ? null : recommendMovieId.trim();
    }
}