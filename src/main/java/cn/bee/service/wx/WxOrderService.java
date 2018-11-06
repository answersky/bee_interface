package cn.bee.service.wx;

import cn.bee.model.PlaceOrder;

import java.util.List;
import java.util.Map;

/**
 * created by liufeng
 * 2018/10/25
 */
public interface WxOrderService {
    /**
     * 用户下单
     *
     * @param placeOrders
     */
    Map<String, Object> createOrder(List<PlaceOrder> placeOrders, String username);
}
