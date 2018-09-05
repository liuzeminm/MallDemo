package cn.service.impl;

import cn.dao.INotenoteDao;
import cn.pojo.Commodity;
import cn.pojo.Notenote;
import cn.service.Colllookservice;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service("clsi")
public class Colllookserviceimpl implements Colllookservice {
    @Resource(name = "INotenoteDao")
    private INotenoteDao ind;
    public INotenoteDao getInd() {
        return ind;
    }
    public void setInd(INotenoteDao ind) {
        this.ind = ind;
    }

    @Override
    public String Selective(Integer id) {
        List<Object> object = new ArrayList<>();
        Integer ncc = 0;
        String coll = "";
        Commodity cd = null;
        List<Commodity> selectbe = new ArrayList<>();
        Commodity coid = null;
        List<Commodity> coid1 = new ArrayList<>();
        List<Notenote> comid = ind.comid(id);
        if (comid != null){
            for (Notenote nn : comid){
                ncc = nn.getNccollectionid();
                cd = ind.selectbe(ncc,id,ncc);
                selectbe.add(cd);
            }
            object.add(selectbe);
            coll = JSON.toJSONString(object);
        }else{
            coll = JSON.toJSONString("您没有添加心愿单");
        }
        return coll;
    }
}
