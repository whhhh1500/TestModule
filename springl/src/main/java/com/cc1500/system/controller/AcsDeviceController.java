package com.cc1500.system.controller;

import com.cc1500.common.Result.ResultVo;
import com.cc1500.framework.aspectj.lang.annotation.OperationLogDetail;
import com.cc1500.framework.aspectj.lang.enums.OperationType;
import com.cc1500.framework.aspectj.lang.enums.OperationUnit;
import com.cc1500.system.entity.AcsDevice;
import com.cc1500.system.service.AcsDeviceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
/**
 * @Description (AcsDevice)表控制层
 * @author makejava
 * @since 2020-05-10 21:36:55
 */
@RestController
@RequestMapping("/springl/AcsDevice")
public class AcsDeviceController {
    /** * 服务对象  */
    @Resource
    private AcsDeviceService acsDeviceService;
    /**
     * @Description 通过主键查询单条数据
     * @param id 主键
     * @return 单条数据
     */
    @OperationLogDetail(detail = "selectOne",level = 3,operationUnit = OperationUnit.USER,operationType = OperationType.SELECT)

    @GetMapping("/selectOne")
    public String selectOne(Integer id) {
        AcsDevice obj= this.acsDeviceService.queryById(id);
        if(obj!=null){
            return ResultVo.success("查询成功", 0,  obj);
        }
        return ResultVo.error("查询失败", 500, null);
    }
    
    /**
     * @Description 通过实体作为筛选条件查询
     * @param acsDevice 实例对象
     * @return 对象列表
     */
    @GetMapping("/queryAll")
    public String queryAll(AcsDevice acsDevice) {
        List<AcsDevice> list=this.acsDeviceService.queryAll(acsDevice);
        if(list!=null){
            return ResultVo.success("查询list成功", 0,  list);
        }
        return ResultVo.error("查询list失败", 500, null);
     }
     /**
     * @Description insert
     * @param acsDevice 
     * @return 单条数据
     */
    @PostMapping("/insert")
    public String insert(AcsDevice acsDevice) {
        AcsDevice obj= this.acsDeviceService.insert(acsDevice);
        if(obj!=null){
            return ResultVo.success("添加成功", 0,  obj);
        }
        return ResultVo.error("添加失败", 500, null);
  }
     /**
     * @Description  update
     * @param acsDevice
     * @return 单条数据
     */
    @PutMapping("/update")
    public String update(AcsDevice acsDevice) {
        AcsDevice obj= this.acsDeviceService.update(acsDevice);
        if(obj!=null){
            return ResultVo.success("更新成功", 0,  obj);
        }
        return ResultVo.error("更新失败", 500, null);
    }
      /**
     * @Description delete
     * @param id
     * @return 单条数据
     */
    @PostMapping("/deleteById")
    public String DeleteMapping(Integer id) {
        boolean obj=this.acsDeviceService.deleteById(id);
        if(obj){
            return ResultVo.success("删除成功", 0,obj);
        }
        return ResultVo.error("删除失败", 500, null);
   }  
}