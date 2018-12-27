package com.sclience.dao;


import com.sclience.entity.Poet;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by 王克强 on 2018/9/25.
 */
public interface PoetDao {
//    @Select("select * from poets where id = #{id}")
//    public List<Poet> finaPoetryById(@Param("id")int id);
//
//    @Select("select * from poets where poet_id = #{id}")
//    public List<Poet> finaPoetryByPoetId(@Param("PoetId")int poetId);

    @Select("select * from poets")
    public List<Poet> finaAllPoet();

    @Select("select * from poets limit #{begin},#{pageSize}")
    public List<Poet> finaPoetInPages(@Param("begin")Integer begin,@Param("pageSize")Integer pageSize);

}
