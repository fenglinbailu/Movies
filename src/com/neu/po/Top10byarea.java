package com.neu.po;

public class Top10byarea {
	private String area;

    private String area_ranked_m_id;
    public Top10byarea(String m_id,String recommend_movie_id) {
    	this.area=m_id;
    	this.area_ranked_m_id=recommend_movie_id;
    }
    public String gettype() {
        return area;
    }

    public void settype(String mId) {
        this.area = mId == null ? null : mId.trim();
    }

    public String getRecommendMovieId() {
        return area_ranked_m_id;
    }

    public void setRecommendMovieId(String recommendMovieId) {
        this.area_ranked_m_id = recommendMovieId == null ? null : recommendMovieId.trim();
    }
	
}
