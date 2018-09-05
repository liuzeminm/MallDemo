package cn.util;

import cn.pojo.Commodity;

import java.util.ArrayList;
import java.util.List;

public class Page {
    private Integer index=1; // 当前页码
    private Integer pageSize = 15; // 每页显示的条目数
    private Integer totalCount; // 总记录数
    private Integer totalPageCount; //总页数
    private List<Commodity> deptlist = new ArrayList<Commodity>();//集合

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {

        if(index<=1){
            index=1;
        }else if(index>getTotalPageCount()){
            index=totalPageCount;
        }
        this.index = index;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPageCount() {
        totalPageCount = totalCount % pageSize == 0
                ? totalCount / pageSize : totalCount / pageSize + 1;
        return  totalPageCount;
    }

    public List<Commodity> getDeptlist() {
        return deptlist;
    }

    public void setDeptlist(List<Commodity> deptlist) {
        this.deptlist = deptlist;
    }
}


