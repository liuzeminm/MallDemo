package cn.service;

import cn.pojo.Goodsdetails;

import java.util.List;

public interface GetAllGooddetailsService {
    List<Goodsdetails> getAllGooddetails(String name);
}
