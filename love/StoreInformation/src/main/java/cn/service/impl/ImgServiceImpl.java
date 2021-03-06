package cn.service.impl;
import cn.dao.ICommodityDao;
import cn.pojo.Commodity;
import cn.service.ImgService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.logging.Logger;

@Service("ssss")
public class ImgServiceImpl implements ImgService {
//    log4j
    @Resource(name = "ICommodityDao")
    public ICommodityDao Icd;

    public ICommodityDao getIcd() {
        return Icd;
    }

    public void setIcd(ICommodityDao icd) {
        Icd = icd;
    }

    public String selgds(Commodity gs) {
        String x = "";
        int i = Icd.insertPiceter(gs);
        if (i > 0 ){
            x = "注册成功";
        }else{
            x = "注册失败";
        }
        return x;
    }
}
