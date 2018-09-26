package cn.bee.service;

import cn.bee.model.Product;

import java.util.Map;

/**
 * created by liufeng
 * 2018/9/20
 */
public interface IProductService {
    /**
     * 新增商品
     *
     * @param product
     * @return
     */
    int addProduct(Product product);

    /**
     * 条件查询商品
     *
     * @param param
     * @return
     */
    Map<String, Object> queryAll(Map<String, Object> param);
}
