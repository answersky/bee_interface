package cn.bee.service.wx;

import cn.bee.model.Product;

import java.util.List;

/**
 * created by liufeng
 * 2018/10/25
 */
public interface WxProductService {
    /**
     * 商品列表(带分页)
     *
     * @return
     */
    List<Product> productList(String type, int pageSize, int pageNo);
}
