package com.demoone.dh.service;
/**
* @class_name: IAUserService
* @package: com.microservice.demo.service
* @describe:
* @date: 2019-10-09
* @time: 13:20
* @author: dh
**/
public interface IAUserService {
    /**
    * @describe: 根据用户id获取用户姓名
    * @date: 2019/10/09  13:20
    * @author: dh
    * @version: 1.0
    **/

    String  getNameById(int id);

}
