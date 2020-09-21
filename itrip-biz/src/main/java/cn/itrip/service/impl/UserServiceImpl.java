package cn.itrip.service.impl;

import cn.itrip.beans.pojo.User;
import cn.itrip.dao.UserMapper;
import cn.itrip.service.UserService;
import cn.itrip.utils.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public Page<User> getPagedUsers(Integer pageIndex, Integer pageSize, Map<String, Object> params) throws Exception {
        params.put("from",(pageIndex-1)*pageSize);
        params.put("limit",pageSize);

        List<User> users = userMapper.getUserListByMap(params);
        Integer totalCount = userMapper.getUserCountByMap(params);

        Page<User> pagedUsers = new Page<>(pageIndex,pageSize,totalCount,users);

        return pagedUsers;
    }
}
