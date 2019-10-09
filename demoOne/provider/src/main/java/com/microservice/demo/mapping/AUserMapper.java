package com.microservice.demo.mapping;


import com.demoone.dh.entity.po.AUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AUserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(AUser record);

    int insertSelective(AUser record);

    AUser selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(AUser record);

    int updateByPrimaryKey(AUser record);

   // AUser selectByProterty(@Param("userId") String userId);
}