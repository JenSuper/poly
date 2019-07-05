package com.jensuper.web.controller;

import com.jensuper.model.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * All rights Reserved, Designed By www.rongdasoft.com
 *
 * @version V1.0
 * @Title: IndexController
 * @Description:
 * @author:jichao
 * @date: 2019/7/5
 * @Copyright: 2019/7/5 www.rongdasoft.com
 * Inc. All rights reserved.
 */
@RestController
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("user")
    public User getUser(){
        User user = new User();
        user.setId(1);
        user.setName("springboot");
        return user;
    }
}
