package com.gangquan360.smartadmin.module.robotmodel.basic;

import com.gangquan360.smartadmin.common.anno.OperateLog;
import com.gangquan360.smartadmin.common.domain.PageResultDTO;
import com.gangquan360.smartadmin.common.domain.ResponseDTO;
import com.gangquan360.smartadmin.constant.SwaggerTagConst;
import com.gangquan360.smartadmin.module.login.domain.RequestTokenBO;
import com.gangquan360.smartadmin.module.robotmodel.basic.domain.dto.RobotModelAddDTO;
import com.gangquan360.smartadmin.module.robotmodel.basic.domain.dto.RobotModelQueryDTO;
import com.gangquan360.smartadmin.module.robotmodel.basic.domain.dto.RobotModelVO;
import com.gangquan360.smartadmin.util.SmartRequestTokenUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * comment:
 *
 * @author: ytuan996
 * @Date : 2020/4/12 12:06
 */
@Api(tags = {SwaggerTagConst.Admin.MANAGER_ROBOT_MODEL})
@RestController
@OperateLog
public class RobotModelController {

    @Autowired
    private RobotModelService robotModelService;

    @PostMapping("")
    @ApiOperation(value = "添加机器人模型")
    public ResponseDTO addRobotModel(@Valid @RequestBody RobotModelAddDTO addDTO) {
        RequestTokenBO requestToken = SmartRequestTokenUtil.getRequestUser();
        return robotModelService.addRobotModel(addDTO, requestToken);
    }

    /**
     * @param editDTO
     * @return
     */
    @PutMapping("")
    @ApiOperation(value = "更新机器人模型")
    public ResponseDTO editRobotModel(@Valid @RequestBody RobotModelAddDTO editDTO) {
        RequestTokenBO requestToken = SmartRequestTokenUtil.getRequestUser();
        return robotModelService.editRobotModel(editDTO, requestToken);
    }

    /**
     * @param robotModelId
     * @return
     */
    @DeleteMapping("")
    @ApiOperation(value = "删除机器人模型")
    public ResponseDTO deleteRobotModel(Long robotModelId) {
        return robotModelService.deleteRobotModel(robotModelId);
    }

/*    *//**
     * @param queryDTO
     * @return
     *//*
    @GetMapping
    @ApiOperation(value = "分页查询所有的机器人模型")
    public ResponseDTO<PageResultDTO<RobotModelVO>> pageQuery(@RequestBody RobotModelQueryDTO queryDTO) {
        return robotModelService.selectRobotModelList(queryDTO);
    }*/

}
