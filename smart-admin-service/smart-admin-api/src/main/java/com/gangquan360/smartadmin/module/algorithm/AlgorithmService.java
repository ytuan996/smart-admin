package com.gangquan360.smartadmin.module.algorithm;

import com.gangquan360.smartadmin.common.domain.ResponseDTO;
import com.gangquan360.smartadmin.module.algorithm.domain.dto.AlgorithmAddDTO;
import com.gangquan360.smartadmin.module.algorithm.domain.entity.AlgorithmEntity;
import com.gangquan360.smartadmin.module.login.domain.RequestTokenBO;
import com.gangquan360.smartadmin.util.SmartBeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * comment:
 *
 * @author: ytuan996
 * @Date : 2020/4/14 23:23
 */
@Service
public class AlgorithmService {

    @Autowired
    private AlgorithmDao algorithmDao;

    /**
     * 添加算法
     *
     * @param addDTO
     * @param token
     * @return
     */
    public ResponseDTO addAlgorithm(AlgorithmAddDTO addDTO, RequestTokenBO token) {
        AlgorithmEntity entity = SmartBeanUtil.copy(addDTO, AlgorithmEntity.class);
        entity.setCreateUser(token.getRequestUserId());
        algorithmDao.insert(entity);
        return ResponseDTO.succMsg("算法上传成功");
    }
}
