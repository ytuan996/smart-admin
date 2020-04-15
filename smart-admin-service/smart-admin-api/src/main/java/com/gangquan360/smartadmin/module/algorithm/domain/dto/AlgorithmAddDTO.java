package com.gangquan360.smartadmin.module.algorithm.domain.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * comment:
 *
 * @author: ytuan996
 * @Date : 2020/4/14 23:21
 */
@Data
public class AlgorithmAddDTO {


    // 需要用户输入的字段
    /**
     * 算法名称
     */
    private String algorithmName;
    /**
     * 算法描述
     */
    private String algorithmDesc;
    /**
     * 访问入口
     */
    private String algorithmAcpath;

    // 点击上传文件后得到的字段
    /**
     * 文件名称
     */
    private String algorithmFilename;

    /**
     * 算法路径
     */
    private String algorithmFilepath;
}
