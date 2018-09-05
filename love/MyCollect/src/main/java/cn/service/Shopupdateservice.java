package cn.service;

import cn.pojo.Shoppingtrolley;
import org.apache.ibatis.annotations.Param;

public interface Shopupdateservice {
    String inserttrolley(Shoppingtrolley sr);
    String quantity(Integer id);
    int equality(Integer id);
    int count(Integer id);

}
