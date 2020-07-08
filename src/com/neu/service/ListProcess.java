package com.neu.service;

import java.util.List;

public interface ListProcess {
	List getSubList(List list,int max);
//  方法名：getSubList
//	传入参数：list:List，max:int
//	返回结果：List
//	描述：从list数组中选取不超过max的数量的成员
	List getSubList(List list,int begin,int End);
//	方法名：getSubList
//	传入参数：list:List，begin:int，End:int
//	返回结果：List
//	描述：从list数组中选取从begin开始，到但不包括end的列表成员
}
