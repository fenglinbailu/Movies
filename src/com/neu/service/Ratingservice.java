package com.neu.service;

import java.io.IOException;

import com.neu.po.Rating;

public interface Ratingservice {

	Rating select(String uid, String mid) throws IOException;

	int update(String uid, String mid, Integer rate) throws IOException;

}
