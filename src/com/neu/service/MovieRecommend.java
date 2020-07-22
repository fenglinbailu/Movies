package com.neu.service;

import java.io.IOException;
import java.util.List;

import com.neu.po.Movie;

public interface MovieRecommend {

	List<Movie> Recommendbymovie(String mid) throws IOException;

}
