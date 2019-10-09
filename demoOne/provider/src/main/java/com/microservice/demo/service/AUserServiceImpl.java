package com.microservice.demo.service;

import com.demoone.dh.service.IAUserService;
import com.microservice.demo.mapping.AUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @class_name: AUSerServiceImpl
 * @package: com.microservice.demo.service.impl
 * @describe:
 * @date: 2019-10-09
 * @time: 13:29
 * @author: dh
 **/
@Service("IAUserService")
public class AUserServiceImpl implements IAUserService {



    @Autowired
    AUserMapper aUserMapper;

    /**
     * @describe: 根据用户姓名获取用户id
     * @date: 2019/10/09  13:29
     * @author: dh
     * @version: 1.0
     **/

    @Override
    public String getNameById(int id) {
        return  aUserMapper.selectByPrimaryKey(id).getUsername();
    }
}
