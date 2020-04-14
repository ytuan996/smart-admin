package com.gangquan360.smartadmin.module.sensormodel;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.gangquan360.smartadmin.module.sensormodel.domain.dto.SensorModelQueryDTO;
import com.gangquan360.smartadmin.module.sensormodel.domain.entity.SensorModelEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * comment:
 *
 * @author: ytuan996
 * @Date : 2020/4/8 23:57
 */
@Mapper
@Component
public interface SensorModelDao extends BaseMapper<SensorModelEntity> {

    /**
     * 分页查询所有的传感器模型
     *
     * @param page
     * @param queryDTO
     * @return
     */
    List<SensorModelEntity> selectByPage(Pagination page, SensorModelQueryDTO queryDTO);
}
