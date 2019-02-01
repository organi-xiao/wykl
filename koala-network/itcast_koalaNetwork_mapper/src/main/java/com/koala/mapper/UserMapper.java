package com.koala.mapper;
import itcat.koala.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    /**
     * 查询所有用户
     * @return
     * @throws Exception
     */
    @Select("SELECT * FROM koala_user")
   List<User> findAll() throws Exception;
}
