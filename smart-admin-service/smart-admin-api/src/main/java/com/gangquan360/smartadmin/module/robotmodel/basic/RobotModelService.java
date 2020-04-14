package com.gangquan360.smartadmin.module.robotmodel.basic;

import com.baomidou.mybatisplus.plugins.Page;
import com.gangquan360.smartadmin.common.domain.PageResultDTO;
import com.gangquan360.smartadmin.common.domain.ResponseDTO;
import com.gangquan360.smartadmin.module.login.domain.RequestTokenBO;
import com.gangquan360.smartadmin.module.robotmodel.basic.domain.dto.RobotModelAddDTO;
import com.gangquan360.smartadmin.module.robotmodel.basic.domain.dto.RobotModelQueryDTO;
import com.gangquan360.smartadmin.module.robotmodel.basic.domain.dto.RobotModelVO;
import com.gangquan360.smartadmin.module.robotmodel.basic.domain.entity.RobotModelEntity;
import com.gangquan360.smartadmin.module.robotmodelsensor.RobotModelSensorService;
import com.gangquan360.smartadmin.module.robotmodelsensor.domain.dto.RobotModelSensorAddDTO;
import com.gangquan360.smartadmin.util.SmartBeanUtil;
import com.gangquan360.smartadmin.util.SmartPaginationUtil;
import org.apache.commons.collections.CollectionUtils;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * comment:
 *
 * @author: ytuan996
 * @Date : 2020/4/12 12:06
 */
@Service
public class RobotModelService {

    @Autowired
    private RobotModelDao robotModelDao;

    @Autowired
    private RobotModelSensorService robotModelSensorService;

    /**
     * @param addDTO
     * @param token
     * @return
     */
    public ResponseDTO addRobotModel(RobotModelAddDTO addDTO, RequestTokenBO token) {
        // 添加机器人模型
        RobotModelEntity entity = SmartBeanUtil.copy(addDTO, RobotModelEntity.class);
        entity.setCreateUser(token.getRequestUserId());
        robotModelDao.insert(entity);

        // 添加机器人模型—传感器模型的关系
        RobotModelSensorAddDTO robotModelSensorAddDTO = new RobotModelSensorAddDTO(addDTO.getSensorList(), entity.getId());
        robotModelSensorService.addBatchRobotModelSensor(robotModelSensorAddDTO);
        return ResponseDTO.succ();
    }

    /**
     * @param editDTO
     * @param token
     * @return
     */
    public ResponseDTO editRobotModel(RobotModelAddDTO editDTO, RequestTokenBO token) {
        // 更新机器人模型
        RobotModelEntity entity = SmartBeanUtil.copy(editDTO, RobotModelEntity.class);
        robotModelDao.updateById(entity);

        // 机器人模型和传感器的关系
        if (CollectionUtils.isNotEmpty(editDTO.getSensorList())) {
            robotModelSensorService.removeRobotModelSensor(entity.getId());
            RobotModelSensorAddDTO robotModelSensorAddDTO = new RobotModelSensorAddDTO(editDTO.getSensorList(), entity.getId());
            robotModelSensorService.addBatchRobotModelSensor(robotModelSensorAddDTO);
        }
        return ResponseDTO.succ();
    }

    /**
     * @param robotModelId
     * @return
     */
    public ResponseDTO deleteRobotModel(Long robotModelId) {
        RobotModelEntity entity = robotModelDao.selectById(robotModelId);
        robotModelDao.deleteById(robotModelId);
        robotModelSensorService.removeRobotModelSensor(entity.getId());
        return ResponseDTO.succ();
    }

    public ResponseDTO<PageResultDTO<RobotModelVO>> selectRobotModelList(RobotModelQueryDTO queryDTO) {
        Page pageParam = SmartPaginationUtil.convert2PageQueryInfo(queryDTO);
        List<RobotModelAddDTO> robotModelAddDTOList = robotModelDao.selectRobotModelList(pageParam,queryDTO);
        return null;
    }
}
