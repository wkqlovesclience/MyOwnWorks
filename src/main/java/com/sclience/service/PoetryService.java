package com.sclience.service;

import com.sclience.entity.Poetry;

import java.util.List;

/**
 * Created by 王克强 on 2018/9/25.
 */
public interface PoetryService {
    public List<Poetry> findById(int id);
    public List<Poetry> findByPoetId(int PoetId);
    public List<Poetry> finaAllPoetry();
    public List<Poetry> findPoetryInPages(Integer pageNumber,Integer pageSize);

}
