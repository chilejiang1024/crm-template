package cn.chile.mapper;

import cn.chile.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by chile on 2016/10/29.
 */

@Repository
public interface UserMapper {

    User selectUserByUsername(@Param("username") String username);

}
