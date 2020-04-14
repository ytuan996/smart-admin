package com.gangquan360.smartadmin.module.robotmodel.basic.domain.dto;

import lombok.Data;

import java.util.List;

/**
 * comment:
 *
 * @author: ytuan996
 * @Date : 2020/4/12 12:16
 */
@Data
public class RobotModelAddDTO {

    private String modelName;

    private String modelDesc;

    private List<Long> sensorList;
}
