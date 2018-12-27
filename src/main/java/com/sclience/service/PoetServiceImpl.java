package com.sclience.service;

import com.sclience.dao.PoetDao;
import com.sclience.entity.Poet;
import com.sclience.entity.Poetry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 王克强 on 2018/9/25.
 */
@Service
@Transactional
public class PoetServiceImpl implements PoetService {
    @Autowired
    private PoetDao poetDao;
    @Override
    public List<Poet> finaAllPoet() {
        return poetDao.finaAllPoet();
    }

    @Override
    public List<Poet> findPoetInPages(Integer pageNumber, Integer pageSize) {
        Integer begin = (pageNumber-1)*pageSize;
        return poetDao.finaPoetInPages(begin,pageSize);
    }
}
