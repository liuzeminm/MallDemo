package cn.service.impl;

import cn.dao.INotenoteDao;
import cn.service.Colldelservice;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("cds")
public class Colldelserviceimpl implements Colldelservice {

    @Resource(name = "INotenoteDao")
    private INotenoteDao ind;
    public INotenoteDao getInd() {
        return ind;
    }

    public void setInd(INotenoteDao ind) {
        this.ind = ind;
    }
    @Override
    public String updatadel(int id) {
        String del = "";
        int updatedel = 0;
        if (id == 0 ){
            del = "对不起不能删除";
        }else{
            updatedel = ind.updatedel(id);
            System.out.println(updatedel);
            if (updatedel < 0 ){
                del = "此项已被删除";
            }else{
                del = "删除成功";
            }
        }
        return JSON.toJSONString(del);
    }
}
