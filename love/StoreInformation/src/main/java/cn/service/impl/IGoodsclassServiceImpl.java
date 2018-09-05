package cn.service.impl;

import cn.dao.IGoodsclassDao;
import cn.pojo.Goodsclass;
import cn.service.IGoodsclassService;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("iiii")
public class IGoodsclassServiceImpl implements IGoodsclassService {
    @Resource(name = "IGoodsclassDao")
    private IGoodsclassDao igs;

    public IGoodsclassDao getIgs() {
        return igs;
    }

    public void setIgs(IGoodsclassDao igs) {
        this.igs = igs;
    }

    public String getgs() {
        List<Goodsclass> getgs = igs.getgs();
        String s = JSON.toJSONString(getgs);
        System.out.println(s);
        return s;
    }
}