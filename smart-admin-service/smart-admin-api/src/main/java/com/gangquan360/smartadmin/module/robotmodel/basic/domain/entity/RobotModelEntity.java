package com.gangquan360.smartadmin.module.robotmodel.basic.domain.entity;

import com.gangquan360.smartadmin.common.domain.BaseEntity;
import lombok.Data;

/**
 * comment:
 *
 * @author: ytuan996
 * @Date : 2020/4/12 12:09
 */
@Data
public class RobotModelEntity extends BaseEntity {

    private String modelName;

    private String modelDesc;

    private Integer isDisable;

    private String isDelete;

    private Long createUser;
}
