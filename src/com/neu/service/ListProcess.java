package com.neu.service;

import java.util.List;

public interface ListProcess {
	List getSubList(List list,int max);
//  ��������getSubList
//	���������list:List��max:int
//	���ؽ����List
//	��������list������ѡȡ������max�������ĳ�Ա
	List getSubList(List list,int begin,int End);
//	��������getSubList
//	���������list:List��begin:int��End:int
//	���ؽ����List
//	��������list������ѡȡ��begin��ʼ������������end���б��Ա
}
