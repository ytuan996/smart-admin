package com.gangquan360.smartadmin.module.robotmodelsensor;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.gangquan360.smartadmin.module.robotmodelsensor.domain.dto.RobotModelSensorAddDTO;
import com.gangquan360.smartadmin.module.robotmodelsensor.domain.entity.RobotModelSensorEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * comment:
 *
 * @author: ytuan996
 * @Date : 2020/4/12 12:48
 */
@Component
public interface RobotModelSensorDao extends BaseMapper<RobotModelSensorEntity> {

    /**
     * 批量插入机器人模型和传感器模型的关系
     *
     * @param addDTO
     * @return
     */
    Integer insertBatchRobotModelSensor(@Param("batchDTO") RobotModelSensorAddDTO addDTO);

    Integer deleteByModelId(@Param("modelId") Long modelId);
}
