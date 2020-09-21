package cn.itrip.service;

import cn.itrip.beans.pojo.User;
import cn.itrip.utils.Page;

import java.util.Map;

public interface UserService {

    Page<User> getPagedUsers(Integer pageIndex,Integer pageSize, Map<String,Object> params) throws Exception;

}
