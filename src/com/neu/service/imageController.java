package com.neu.service;

import com.neu.po.MultipartFile;

public interface imageController {
	/*(1) ��������getFile
	url��/getFile
	���������path:String
	���ؽ����byte[]
	��������ȡָ��·����ͼƬ
	*/
	byte[] getFile(String path);
	/*
	 (2) ��������singleFileUpload
	url��/uploadImg
	���������userId:int��img:MultipartFile
	���ؽ����String
	����������ָ���û���ͷ��
	 */
	String singleFileUpload(int userId,MultipartFile img );
}
