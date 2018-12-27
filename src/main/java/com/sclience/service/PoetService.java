package com.sclience.service;

import com.sclience.entity.Poet;
import com.sclience.entity.Poetry;

import java.util.List;

/**
 * Created by 王克强 on 2018/9/25.
 */
public interface PoetService {
    public List<Poet> finaAllPoet();
    public List<Poet> findPoetInPages(Integer pageNumber,Integer pageSize);
}
