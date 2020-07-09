package com.neuedu.dao;

import java.util.List;
import java.io.IOException;
import com.neu.po.User;
import org.apache.ibatis.annotations.Select;
public interface UserMapper {
  //  int insert(User record);

  //  int insertSelective(User record);
    
    @Select("select * from user") 
	List<User> findAll() throws IOException;
}
//
//
//import java.io.IOException;
//import java.util.List;
//
//import org.apache.ibatis.annotations.Select;
//
//import com.neuedu.po.IdCardPo;
//
//public interface IdCardDAO {
//	@Select("select *from idcard") 
//	List<IdCardPo> findAll() throws IOException;
//
//}
