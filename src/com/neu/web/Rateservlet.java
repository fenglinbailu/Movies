package com.neu.web;

import java.io.IOException;


import com.neu.po.Rating;

import com.neu.service.Ratingservice;

import com.neu.util.Ratingimpl;

public class Rateservlet {
	public Rating getRate(String uid,String mid ) throws IOException{
		Ratingservice rat = new Ratingimpl();
		Rating reco =rat.select(uid, mid);

		return reco;
		
	}
	public int insertRate(String uid,String mid,String rate) throws IOException{
		Ratingservice rat = new Ratingimpl();
		int irate = Integer.parseInt(rate); 
		int reco =rat.update(uid, mid, irate);

		return reco;
		
	}

}
