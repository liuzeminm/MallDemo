package cn.sptservice;

import cn.pojo.Orderform;
import io.swagger.models.auth.In;

/**
 * 订单
 */
public interface OrderStatusService {
    /**
     * 取消订单
     * @param id 用户id
     * @param serialNumber 订单的编号
     * @param ofstate 订单状态
     * @return 处理结果
     */
    String cancellationOfOrder(Integer id, String serialNumber,String ofstate);

    /**
     *订单处理
     * @return 处理结果
     */
    String dispose(int ofstate,Double orderprice , int userid , String ordernumber);

    /**
     * 添加订单
     * @return 处理结果
     */
    String addOrderForm(int userid,int commodityid,String Ofordernumber);

}
