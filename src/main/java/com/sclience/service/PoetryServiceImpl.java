package com.sclience.service;

import com.sclience.dao.PoetryDao;
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
public class PoetryServiceImpl implements PoetryService {
    @Autowired
    private PoetryDao poetryDao;
    @Override
    public List<Poetry> findById(int id) {
        return poetryDao.finaPoetryById(id);
    }

    @Override
    public List<Poetry> findByPoetId(int poetId) {
        return poetryDao.finaPoetryByPoetId(poetId);
    }

    @Override
    public List<Poetry> finaAllPoetry() {
        return poetryDao.finaAllPoetry();
    }

    @Override
    public List<Poetry> findPoetryInPages(Integer pageNumber, Integer pageSize) {
        Integer begin = (pageNumber-1)*pageNumber;
        return poetryDao.finaPoetryInPages(pageNumber,pageSize);
    }

    public PoetryDao getPoetryDao() {
        return poetryDao;
    }

    public void setPoetryDao(PoetryDao poetryDao) {
        this.poetryDao = poetryDao;
    }
}
