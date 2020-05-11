package com.cc1500.system.mapper;

import com.cc1500.system.entity.AcsDevice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (AcsDevice)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-10 21:36:55
 */
@Mapper
public interface AcsDeviceMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param devId 主键
     * @return 实例对象
     */
    AcsDevice queryById(Integer devId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<AcsDevice> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param acsDevice 实例对象
     * @return 对象列表
     */
    List<AcsDevice> queryAll(AcsDevice acsDevice);

    /**
     * 新增数据
     *
     * @param acsDevice 实例对象
     * @return 影响行数
     */
    int insert(AcsDevice acsDevice);

    /**
     * 修改数据
     *
     * @param acsDevice 实例对象
     * @return 影响行数
     */
    int update(AcsDevice acsDevice);

    /**
     * 通过主键删除数据
     *
     * @param devId 主键
     * @return 影响行数
     */
    int deleteById(Integer devId);

}