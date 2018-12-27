package com.sclience.dao;

import com.sclience.entity.Poetry;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by 王克强 on 2018/9/25.
 */
public interface PoetryDao {
    @Select("select * from poetries where id = #{id}")
    public List<Poetry> finaPoetryById(@Param("id")int id);

    @Select("select * from poetries where poet_id = #{id}")
    public List<Poetry> finaPoetryByPoetId(@Param("PoetId")int poetId);

    @Select("select * from poetries")
    public List<Poetry> finaAllPoetry();

    @Select("select * from poetries limit #{begin},#{pageSize}")
    public List<Poetry> finaPoetryInPages(@Param("begin")Integer begin,@Param("pageSize")Integer pageSize);
}
