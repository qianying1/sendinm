package com.gzsendi.qhb.mapper;

import com.gzsendi.qhb.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userMapper")
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAllUser();
}