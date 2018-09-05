package cn.service.impl;
import cn.dao.ICommodityDao;
import cn.service.SelPageBranchService;
import cn.util.Page;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.logging.Logger;

@Service("sbs")
public class SelPageBranchServiceImpl implements SelPageBranchService {
    //    log4j
    private static Logger logger = Logger.getLogger(String.valueOf(SelPageServiceImpl.class));
    @Resource(name = "ICommodityDao")
    private ICommodityDao ispd;

    public ICommodityDao getIspd() {
        return ispd;
    }

    public void setIspd(ICommodityDao ispd) {
        this.ispd = ispd;
    }

    int i = 0;

    public int selBranchCount(int bstate) {
        i = ispd.selBranchCount(bstate);
        System.out.println(i);
        return i;
    }


    public Page selBranchClassAndDetails(int bstate,int bindex) {
        Page a = new Page();
        a.setTotalCount(i);
        System.out.println(i);
        a.setPageSize(15);
        a.setIndex(bindex);
        a.setDeptlist(ispd.selBranchDetails(bstate,(a.getIndex()-1)*a.getPageSize(),a.getPageSize()));
        return a;
    }



}
