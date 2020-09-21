package cn.itrip.controller;

import cn.itrip.beans.dto.Dto;
import cn.itrip.beans.pojo.User;
import cn.itrip.service.UserService;
import cn.itrip.utils.DtoUtil;
import cn.itrip.utils.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

//@Controller
@RestController
public class BizController {

    @Resource
    UserService userService;

//    @RequestMapping(value="/display",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
//    @ResponseBody
//    public Dto display(@RequestParam(value="name",required = false) String userName,
//                       @RequestParam(value="page",defaultValue = "1") Integer pageIndex) throws Exception{
//
//        Map<String,Object> params = new HashMap<>();
//
//        params.put("userName",userName);
//
//        int pageSize = 5;
//        Page<User> pagedUsers = userService.getPagedUsers(pageIndex, pageSize , params);
//
//        return DtoUtil.returnDataSuccess(pagedUsers);
//    }

    @RequestMapping(value="/display")
    public Dto display(@RequestParam(value="name",required = false) String userName,
                       @RequestParam(value="page",defaultValue = "1") Integer pageIndex) throws Exception{

        Map<String,Object> params = new HashMap<>();

        params.put("userName",userName);

        int pageSize = 5;
        Page<User> pagedUsers = userService.getPagedUsers(pageIndex, pageSize , params);

        return DtoUtil.returnDataSuccess(pagedUsers);
    }
}
