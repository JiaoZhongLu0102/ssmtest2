package com.mhys.controller;

import com.mhys.model.Goods;
import com.mhys.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class GoodController {
 @Autowired
  GoodsService goodsService;
 @RequestMapping("/selectAll")
 public ModelAndView selectAll(){
     System.out.println("hihi");
     List<Goods> goodsList = goodsService.selectAll();
     ModelAndView mv = new ModelAndView("goods.jsp");
     System.out.println(goodsList.get(0)+"........");
     mv.addObject("list",goodsList);
     return  mv;
 }
 @RequestMapping("/del")
 public String del(Goods goods){
     int count = goodsService.del(goods);
     return "/selectAll";
 }

}
