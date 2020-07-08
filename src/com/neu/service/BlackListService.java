package com.neu.service;

import java.util.List;

import com.neu.po.BlackList;
import com.neu.po.Movie;

public interface BlackListService {
//	(1) ��������addBlackList
//	���������userId:int��movieId:String
//	���ؽ����Boolean
//	���������blacklist�¼�¼
	Boolean addBlackList(int userId ,String movieId);
//	(2) ��������deleteBlackList
//	���������userId:int��movieId:String
//	���ؽ����Boolean
//	������ɾ��ָ��blacklist��¼
	Boolean deleteBlackList(int userId ,String movieId);
//	(3) ��������getAllBlackListByUid
//	���������userId:int
//	���ؽ����List<BlackList>
//	���������ָ��uid�����к�����
	List<BlackList> getAllBlackListByUid(int userId);
//	(4) ��������changeToMovie
//	���������List<BlackList>
//	���ؽ����List<Movie>
//	���������غ�����ָ���ĵ�Ӱ
	List<Movie> changeToMovie(List<BlackList> BlackList);

}
