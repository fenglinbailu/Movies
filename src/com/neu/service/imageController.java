package com.neu.service;

import com.neu.po.MultipartFile;

public interface imageController {
	/*(1) 方法名：getFile
	url：/getFile
	传入参数：path:String
	返回结果：byte[]
	描述：获取指定路径的图片
	*/
	byte[] getFile(String path);
	/*
	 (2) 方法名：singleFileUpload
	url：/uploadImg
	传入参数：userId:int，img:MultipartFile
	返回结果：String
	描述：更新指定用户的头像
	 */
	String singleFileUpload(int userId,MultipartFile img );
}
