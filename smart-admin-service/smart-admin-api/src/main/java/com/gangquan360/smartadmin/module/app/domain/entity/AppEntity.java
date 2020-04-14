package com.gangquan360.smartadmin.module.app.domain.entity;

import com.gangquan360.smartadmin.common.domain.BaseEntity;

/**
 * comment:
 *
 * @author: ytuan996
 * @Date : 2020/4/12 23:06
 */
public class AppEntity extends BaseEntity {

    /**
     * 应用名称
     */
    private String appName;

    /**
     * 应用描述
     */
    private String appDesc;

    /**
     * 应用组合方式(0并行，1串行)
     */
    private String appMethod;

    /**
     * 应用状态(是否通过审核)
     */
    private String appStatus;

}
