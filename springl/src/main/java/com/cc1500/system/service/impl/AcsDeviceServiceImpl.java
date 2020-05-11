package com.cc1500.system.service.impl;

import com.cc1500.system.entity.AcsDevice;
import com.cc1500.system.mapper.AcsDeviceMapper;
import com.cc1500.system.service.AcsDeviceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (AcsDevice)表服务实现类
 *
 * @author makejava
 * @since 2020-05-10 21:36:55
 */
@Service("acsDeviceService")
public class AcsDeviceServiceImpl implements AcsDeviceService {
    @Resource
    private AcsDeviceMapper acsDeviceMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param devId 主键
     * @return 实例对象
     */
    @Override   
    public AcsDevice queryById(Integer devId) {
        return this.acsDeviceMapper.queryById(devId);
    }
    /**
     * 通过实体作为筛选条件查询
     *
     * @param acsDevice 实例对象
     * @return 对象列表
     */
    @Override
    public List<AcsDevice> queryAll(AcsDevice acsDevice) {
        return this.acsDeviceMapper.queryAll(acsDevice);
    }
    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<AcsDevice> queryAllByLimit(int offset, int limit) {
        return this.acsDeviceMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param acsDevice 实例对象
     * @return 实例对象
     */
    @Override
    public AcsDevice insert(AcsDevice acsDevice) {
        this.acsDeviceMapper.insert(acsDevice);
        return acsDevice;
    }

    /**
     * 修改数据
     *
     * @param acsDevice 实例对象
     * @return 实例对象
     */
    @Override
    public AcsDevice update(AcsDevice acsDevice) {
        this.acsDeviceMapper.update(acsDevice);
        return this.queryById(acsDevice.getDevId());
    }

    /**
     * 通过主键删除数据
     *
     * @param devId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer devId) {
        return this.acsDeviceMapper.deleteById(devId) > 0;
    }
}