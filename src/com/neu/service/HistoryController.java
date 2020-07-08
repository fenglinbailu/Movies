package com.neu.service;


import java.util.List;
import java.util.Map;

import com.neu.po.Movie;
import com.neu.po.SearchHistory;

public interface HistoryController {
	SearchHistory getHistoryByBidAndDate(String movieId,String date);
	Map getHistoryByDate(String date);
	Map getTopHistoryByDate(String date);
	Map getHistoryByMovieId(String movieId);
	List<Movie> getTopSearch();
}
