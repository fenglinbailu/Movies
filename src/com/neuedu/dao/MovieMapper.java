package com.neuedu.dao;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.StatementType;

import com.neu.po.Movie;

public interface MovieMapper {
	@Delete("delete from movie where m_id=#{mId}")
    int deleteByPrimaryKey(String mId);

    @Insert("insert into movie(m_id,m_name,rate,director,screenwriter,actor,type,area,language,length,imgurl,star) values(#{m_id},#{m_name},#{rate},#{director},#{screenwriter},#{actor},#{type},#{area},#{language},#{length},#{imgurl},#{star})")
    int insert(Movie record);

    @Insert("insert into movie(m_id,m_name,rate,director,screenwriter,actor,type,area,language,length,imgurl,star) values(#{m_id},#{m_name},#{rate},#{director},#{screenwriter},#{actor},#{type},#{area},#{language},#{length},#{imgurl},#{star})")
    int insertSelective(Movie record);

    @Select("select *from movie where m_id=#{mid}")
    Movie selectByPrimaryKey(String mId);
    
    @Select("select *from movie where m_name=#{mname}")
    Movie selectByMovieName(String mname);
    
    //@Select("select m_name from movie where type=#{type}")
    //String selectByMovieType(String type);

    @Update("update movie set m_name=#{m_name},rate=#{rate},director=#{director},screenwriter=#{screenwriter},actor=#{actor},type=#{type},area=#{area},language=#{language},length=#{length},imgurl=#{imgurl},star=#{star} where m_id=#{m_id}")
    int updateByPrimaryKeySelective(Movie record);

    @Update("update movie set m_name=#{m_name},rate=#{rate},director=#{director},screenwriter=#{screenwriter},actor=#{actor},type=#{type},area=#{area},language=#{language},length=#{length},imgurl=#{imgurl},star=#{star} where m_id=#{m_id}")
    int updateByPrimaryKey(Movie record);
    
    @Select("select * from movie") 
	List<Movie> findAll() ;
    
    @Select("select * from movie where m_name like CONCAT(CONCAT('%', #{movie}), '%') or actor like CONCAT(CONCAT('%', #{movie}), '%')or director like CONCAT(CONCAT('%', #{movie}), '%')or screenwriter like CONCAT(CONCAT('%', #{movie}), '%')") 
    @Options(statementType = StatementType.CALLABLE)
	List<Movie> search(String movie) ;
    
    
}