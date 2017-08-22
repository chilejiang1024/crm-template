package cn.chile.mapper;

import cn.chile.bean.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by chile on 2016/10/29.
 */

@Repository
public interface UserMapper {

    User selectUserByUsername(@Param("username") String username);

}
