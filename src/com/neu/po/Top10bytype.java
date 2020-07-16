package com.neu.po;

public class Top10bytype {
	private String type;

    private String ranked_m_id;
    public Top10bytype(String m_id,String recommend_movie_id) {
    	this.type=m_id;
    	this.ranked_m_id=recommend_movie_id;
    }
    public String gettype() {
        return type;
    }

    public void settype(String mId) {
        this.type = mId == null ? null : mId.trim();
    }

    public String getRecommendMovieId() {
        return ranked_m_id;
    }

    public void setRecommendMovieId(String recommendMovieId) {
        this.ranked_m_id = recommendMovieId == null ? null : recommendMovieId.trim();
    }
}
