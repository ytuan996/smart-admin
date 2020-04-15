package com.gangquan360.smartadmin.module.sensormodel;

import com.gangquan360.smartadmin.common.domain.ResponseDTO;
import com.gangquan360.smartadmin.module.login.domain.RequestTokenBO;
import com.gangquan360.smartadmin.module.sensormodel.domain.dto.SensorModelAddDTO;
import com.gangquan360.smartadmin.module.sensormodel.domain.dto.SensorModelEditDTO;
import com.gangquan360.smartadmin.module.sensormodel.domain.dto.SensorModelResultVO;
import com.gangquan360.smartadmin.module.sensormodel.domain.entity.SensorModelEntity;
import com.gangquan360.smartadmin.util.SmartBeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * comment:
 *
 * @author: ytuan996
 * @Date : 2020/4/8 23:56
 */
@Service
public class SensorModelService {

    @Autowired
    private SensorModelDao sensorModelDao;

    public ResponseDTO<String> addSensorModel(SensorModelAddDTO sensorModelAddDTO, RequestTokenBO requestToken) {
        SensorModelEntity entity = SmartBeanUtil.copy(sensorModelAddDTO, SensorModelEntity.class);
        entity.setCreateUser(requestToken.getEmployeeBO().getId());
        sensorModelDao.insert(entity);
        return ResponseDTO.succ();
    }

    public ResponseDTO<String> updateSensorModel(SensorModelEditDTO editDTO, RequestTokenBO requestToken) {
        SensorModelEntity entity = SmartBeanUtil.copy(editDTO, SensorModelEntity.class);
        sensorModelDao.updateById(entity);
        return ResponseDTO.succ();
    }

    public ResponseDTO<Boolean> deleteSensorModel(Long sensorId) {
        sensorModelDao.deleteById(sensorId);
        return ResponseDTO.succ();
    }

    public ResponseDTO<List<SensorModelResultVO>> getAllSensorModel() {
        List<SensorModelEntity> sensorModelEntities = sensorModelDao.selectList(null);

        List<SensorModelResultVO> result = sensorModelEntities.stream().map(r -> {
            return SmartBeanUtil.copy(r, SensorModelResultVO.class);
        }).collect(Collectors.toList());
        return ResponseDTO.succData(result);

    }
}
