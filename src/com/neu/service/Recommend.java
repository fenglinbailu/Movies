package com.neu.service;

import java.io.IOException;
import java.util.List;

import com.neu.po.Movie;

public interface Recommend {
	
	 List<Movie> Recommendbyuser(String uid) throws IOException;

}
