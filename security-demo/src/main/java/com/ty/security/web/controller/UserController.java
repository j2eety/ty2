package com.ty.security.web.controller;

import com.ty.security.dto.User;
import com.ty.security.dto.UserQueryCondition;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈用户控制器〉
 *  RestController:声明这个类用来做restful服务
 *  RequestMapping:定义访问路径
 * @author Administrator
 * @create 2018/12/11
 * @since 1.0.0
 */
@RestController
public class UserController {
    /**
     *
     * 功能描述:
     * 参数注解@RequestParam(required（是否必填） = false,name（别名） = "userName",defaultValue（默认值） = "tome")
     * 参数注解@PageableDefault(page（默认查第几页） = 2,size（每页显示多少条） = 17,sort（默认排序） = "userName")
     * @param condition 请求参数对象
     * @return List<User>
     * @author Administrator
     * @date 2018/12/22 10:53
     */
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public List<User> query(UserQueryCondition condition,@PageableDefault(page = 2,size = 17,sort = "userName") Pageable pageable){
        System.out.println(condition);
        System.out.println(pageable.getPageNumber());
        System.out.println(pageable.getPageSize());
        System.out.println(pageable.getSort());
        List<User> users = new ArrayList<>(16);
        users.add(new User());
        users.add(new User());
        users.add(new User());
        return users;
    }


}
