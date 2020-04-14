package com.gangquan360.smartadmin.module.robotmodelsensor;

import com.gangquan360.smartadmin.common.domain.ResponseDTO;
import com.gangquan360.smartadmin.module.robotmodelsensor.domain.dto.RobotModelSensorAddDTO;
import org.springframework.stereotype.Service;

/**
 * comment:
 *
 * @author: ytuan996
 * @Date : 2020/4/12 12:47
 */
@Service
public class RobotModelSensorService {

    private RobotModelSensorDao robotModelSensorDao;

    public ResponseDTO addBatchRobotModelSensor(RobotModelSensorAddDTO addDTO) {
        robotModelSensorDao.insertBatchRobotModelSensor(addDTO);
        return ResponseDTO.succ();
    }

    public ResponseDTO removeRobotModelSensor(Long id) {
        robotModelSensorDao.deleteByModelId(id);
        return ResponseDTO.succ();
    }
}
