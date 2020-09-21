package cn.itrip.dao;

import cn.itrip.beans.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> getUserListByMap(Map<String,Object> params) throws Exception;

    Integer getUserCountByMap(Map<String,Object> params) throws Exception;
}
