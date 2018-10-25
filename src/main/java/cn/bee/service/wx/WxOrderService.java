package cn.bee.service.wx;

import java.util.List;

/**
 * created by liufeng
 * 2018/10/25
 */
public interface WxOrderService {
    /**
     * 用户下单
     *
     * @param productCodes
     */
    void createOrder(List<String> productCodes, String username);
}
