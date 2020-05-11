package com.cc1500.system.service;

import com.cc1500.system.entity.AcsDevice;
import java.util.List;

/**
 * (AcsDevice)表服务接口
 *
 * @author makejava
 * @since 2020-05-10 21:36:55
 */
public interface AcsDeviceService {
    /**
     * 通过ID查询单条数据
     *
     * @param devId 主键
     * @return 实例对象
     */
    AcsDevice queryById(Integer devId);
   /**
     * 通过实体作为筛选条件查询
     *
     * @param acsDevice 实例对象
     * @return 对象列表
     */
      List<AcsDevice> queryAll(AcsDevice acsDevice);
    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AcsDevice> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param acsDevice 实例对象
     * @return 实例对象
     */
    AcsDevice insert(AcsDevice acsDevice);

    /**
     * 修改数据
     *
     * @param acsDevice 实例对象
     * @return 实例对象
     */
    AcsDevice update(AcsDevice acsDevice);

    /**
     * 通过主键删除数据
     *
     * @param devId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer devId);

}