package com.gangquan360.smartadmin.module.department.domain.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.gangquan360.smartadmin.common.domain.BaseEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * 公司实体类
 * t_department 数据表
 *
 * @author listen
 * @date 2017/12/19 10:45
 */
@Data
@TableName(value = "t_department")
public class DepartmentEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -6787726615141147044L;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 部门简称
     */
    private String shortName;


    /**
     * 负责人ID
     */
    private Long managerId;

    /**
     * 部门父级id
     */
    private Long parentId;

    /**
     * 排序
     */
    private Long sort;

    // TODO  新增字段

    /**
     * 公司类型
     */
    private String type;

    /**
     * 公司地址
     */
    private String addr;
    /**
     * 公司简介
     */
    private String desc;
    /**
     * 信用代码
     */
    private String code;

    /**
     * 负责人电话
     */
    private String phone;

    /**
     * 负责人邮箱
     */
    private String mail;

}
