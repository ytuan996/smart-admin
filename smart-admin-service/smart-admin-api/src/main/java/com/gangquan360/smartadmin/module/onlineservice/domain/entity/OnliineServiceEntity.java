package com.gangquan360.smartadmin.module.onlineservice.domain.entity;

import com.gangquan360.smartadmin.common.domain.BaseEntity;

/**
 * comment:
 *
 * @author: ytuan996
 * @Date : 2020/4/12 23:40
 */
public class OnliineServiceEntity extends BaseEntity {
    /**
     * 服务名称
     */
    private String serviceName;

    /**
     * 服务端口
     */
    private Long servicePort;

    /**
     * 使用的镜像
     */
    private String imageTag;

    /**
     * 服务描述
     */
    private String serviceDesc;

    /**
     * 算法ID
     */
    private Long algorithmId;

    /**
     * 服务访问方式
     */
    private String serviceUrl;

    /**
     * 服务状态(是否通过审核)
     */
    private String serviceStatus;
}
