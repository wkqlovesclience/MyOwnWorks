package com.sclience.controller;

import com.sclience.entity.Poet;
import com.sclience.entity.Poetry;
import com.sclience.service.PoetService;
import com.sclience.service.PoetryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 王克强 on 2018/9/25.
 */
@Controller
@RequestMapping(value = "/poem")
public class PoetryController {
    private Logger logger = LoggerFactory.getLogger(PoetryController.class);
    private final Integer PAGESIZE = 10;
    @Autowired
    private PoetryService poetryService;
    @Autowired
    private PoetService poetService;
    @RequestMapping("/")
    public ModelAndView index(ModelAndView modelAndView,Integer pageNumber){
        Map<String,Object> mapBig = new HashMap<String,Object>();
        List<Poet> poets = poetService.findPoetInPages(pageNumber,PAGESIZE);
        for (Poet poet : poets) {
            Map<String,Object> mapSmall = new HashMap<String,Object>();
            List<Poetry> poetries = poetryService.findById(poet.getId());
            for (Poetry poetry : poetries) {
                mapSmall.put(poetry.getTitle(),poetry.getContent());
            }
            mapBig.put(poet.getName(),mapSmall);
        }

        modelAndView.addObject("poetris",mapBig);
        modelAndView.setViewName("index");
        modelAndView.addObject("previousPage",pageNumber-1);
        modelAndView.addObject("nextPage",pageNumber+1);
        return modelAndView;
    }
}
