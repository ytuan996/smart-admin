package com.gangquan360.smartadmin.module.robot.domain.entity;

import com.gangquan360.smartadmin.common.domain.BaseEntity;
import lombok.Data;

/**
 * comment:
 *
 * @author: ytuan996
 * @Date : 2020/4/12 20:46
 */
@Data
public class RobotEntity extends BaseEntity {
    private String indentifie;

    private Long modelId;

    private Long isOnline;

    private Long isDisable;

    private Long createUser;
}
