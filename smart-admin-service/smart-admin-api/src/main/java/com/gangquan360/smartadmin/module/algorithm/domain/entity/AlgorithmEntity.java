package com.gangquan360.smartadmin.module.algorithm.domain.entity;

import com.gangquan360.smartadmin.common.domain.BaseEntity;
import lombok.Data;

/**
 * comment:
 *
 * @author: ytuan996
 * @Date : 2020/4/12 23:03
 */
@Data
public class AlgorithmEntity extends BaseEntity {
    /**
     * 算法ID
     */
    private Long algorithmId;

    /**
     * 算法名称
     */
    private String algorithmName;

    /**
     * 算法描述
     */
    private String algorithmDesc;

    /**
     * 算法状态(是否通过审核)
     */
    private String algorithmStatus;

    /**
     * 算法文件名称
     */
    private String algorithmFilename;

    /**
     * 算法入口路径
     */
    private String algorithmAcpath;

    /**
     * 算法上传路径
     */
    private String algorithmFilepath;
}
