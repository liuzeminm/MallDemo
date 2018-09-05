package cn.sptservice;

public interface ShowOrderStatus {
    String showOne(Integer ofshippinginformation,Integer ofstate);
    String showAll(Integer ofshippinginformation);
    String showDetails(int ofid);
}
