package com.gangquan360.smartadmin.module.sensormodel;

import com.gangquan360.smartadmin.common.anno.OperateLog;
import com.gangquan360.smartadmin.common.domain.PageResultDTO;
import com.gangquan360.smartadmin.common.domain.ResponseDTO;
import com.gangquan360.smartadmin.constant.SwaggerTagConst;
import com.gangquan360.smartadmin.module.login.domain.RequestTokenBO;
import com.gangquan360.smartadmin.module.sensormodel.domain.dto.SensorModelAddDTO;
import com.gangquan360.smartadmin.module.sensormodel.domain.dto.SensorModelEditDTO;
import com.gangquan360.smartadmin.module.sensormodel.domain.dto.SensorModelQueryDTO;
import com.gangquan360.smartadmin.module.sensormodel.domain.dto.SensorModelResultVO;
import com.gangquan360.smartadmin.util.SmartRequestTokenUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * comment: 机器人传感器模型路由
 *
 * @author: ytuan996
 * @Date : 2020/4/8 23:57
 */
@RestController
@Api(tags = {SwaggerTagConst.Admin.MANAGER_SENSOR_MODEL})
@OperateLog
public class SensorModelController {

    @Autowired
    private SensorModelService sensorModelService;

    // 新增
    @ApiOperation(value = "机器人传感器模型新增")
    @PostMapping("/sensor_model/add")
    public ResponseDTO<String> addSensorModel(@Valid @RequestBody SensorModelAddDTO sensorModelAddDTO) {
        RequestTokenBO requestToken = SmartRequestTokenUtil.getRequestUser();
        return sensorModelService.addSensorModel(sensorModelAddDTO, requestToken);
    }

    // 更新
    @ApiOperation(value = "机器人传感器模型修改")
    @PutMapping("/sensor_model/update")
    public ResponseDTO<String> updateSensorModel(@Valid @RequestBody SensorModelEditDTO editDTO) {
        RequestTokenBO requestToken = SmartRequestTokenUtil.getRequestUser();
        return sensorModelService.updateSensorModel(editDTO, requestToken);
    }

    // 删除
    @ApiOperation(value = "机器人传感器模型删除")
    @DeleteMapping("/sensor_model/delete/{sensorId}")
    public ResponseDTO<Boolean> deleteSensorModel(@PathVariable("sensorId") Long sensorId) {
        return sensorModelService.deleteSensorModel(sensorId);
    }

    // 分页查询
    @ApiOperation(value = "分页查询所有传感器模型", notes = "分页查询所有传感器模型")
    @GetMapping("/sensor_model/getListPage")
    public ResponseDTO<PageResultDTO<SensorModelResultVO>> getSensorModelPage(@RequestBody @Valid SensorModelQueryDTO queryDTO) {
        return sensorModelService.querySensorModelByPage(queryDTO);
    }


    // 根据机器人ID分页查询

}
