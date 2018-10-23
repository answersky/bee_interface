package cn.bee.service.log;

import cn.bee.model.ProductOperateLog;

import java.util.Date;
import java.util.List;

/**
 * created by liufeng
 * 2018/10/23
 */
public interface IProductOperateLogService {
    void saveLog(ProductOperateLog productOperateLog);

    List<ProductOperateLog> findOperateLogsByTime(Date sTime, Date eTime);
}
