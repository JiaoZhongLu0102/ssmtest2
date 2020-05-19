package com.mhys.service;

import com.mhys.mapper.GoodsMapper;
import com.mhys.model.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {
    @Autowired
     GoodsMapper goodsMapper;

    public List<Goods> selectAll(){
        return  goodsMapper.selectAll();
    }

    public  int del(Goods goods){
        return  goodsMapper.del(goods);
    }


}
