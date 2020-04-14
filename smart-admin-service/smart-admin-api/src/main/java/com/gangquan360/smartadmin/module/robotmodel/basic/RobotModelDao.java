package com.gangquan360.smartadmin.module.robotmodel.basic;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.gangquan360.smartadmin.module.robotmodel.basic.domain.dto.RobotModelAddDTO;
import com.gangquan360.smartadmin.module.robotmodel.basic.domain.dto.RobotModelQueryDTO;
import com.gangquan360.smartadmin.module.robotmodel.basic.domain.entity.RobotModelEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * comment:
 *
 * @author: ytuan996
 * @Date : 2020/4/12 12:06
 */
@Component
public interface RobotModelDao extends BaseMapper<RobotModelEntity> {
    /**
     * 分页查询机器人模型
     *
     * @param page
     * @param queryDTO
     * @return
     */
    List<RobotModelAddDTO> selectRobotModelList(Page page,@Param("queryDTO") RobotModelQueryDTO queryDTO);

}
