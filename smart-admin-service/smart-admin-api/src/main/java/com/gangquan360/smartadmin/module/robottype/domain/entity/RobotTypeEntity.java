package com.gangquan360.smartadmin.module.robottype.domain.entity;

import com.gangquan360.smartadmin.common.domain.BaseEntity;
import lombok.Data;

/**
 * comment:
 *
 * @author: ytuan996
 * @Date : 2020/4/12 23:47
 */
@Data
public class RobotTypeEntity extends BaseEntity {

    /**
     * 类型名称
     */
    private String typeName;

    /**
     * 类型描述
     */
    private String typeDesc;

}
