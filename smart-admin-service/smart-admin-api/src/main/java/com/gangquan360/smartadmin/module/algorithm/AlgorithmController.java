package com.gangquan360.smartadmin.module.algorithm;

import com.gangquan360.smartadmin.common.anno.OperateLog;
import com.gangquan360.smartadmin.common.domain.ResponseDTO;
import com.gangquan360.smartadmin.constant.SwaggerTagConst;
import com.gangquan360.smartadmin.module.algorithm.domain.dto.AlgorithmAddDTO;
import com.gangquan360.smartadmin.module.login.domain.RequestTokenBO;
import com.gangquan360.smartadmin.util.SmartRequestTokenUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * comment:
 *
 * @author: ytuan996
 * @Date : 2020/4/12 23:02
 */
@RestController
@OperateLog
@Api(SwaggerTagConst.Admin.MANAGER_ALGORITHM)
public class AlgorithmController {

    @Autowired
    private AlgorithmService algorithmService;

    @ApiOperation(value = "添加算法")
    @PostMapping("/algorithm/add")
    public ResponseDTO addAlgorithm(AlgorithmAddDTO addDTO) {
        RequestTokenBO token = SmartRequestTokenUtil.getRequestUser();
        return algorithmService.addAlgorithm(addDTO, token);
    }

}
