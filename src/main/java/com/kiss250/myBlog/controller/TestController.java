package com.kiss250.myBlog.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.kiss250.myBlog.domain.po.UserInfo;


import com.kiss250.myBlog.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("test")
public class TestController extends BaseController {


    @Autowired
    private UserService userService;

    @RequestMapping("/tt")
    public R<List<UserInfo>> tt() {
        return R.ok(userService.list());
    }

    @RequestMapping("/insert")
    public R<Boolean> insertInfo(UserInfo User) {
        UserInfo info = new UserInfo();
        info.setName(User.getName());
        info.setAge(User.getAge());
        info.setSalary(User.getSalary());
        info.setCreateTime(new Date());
        return R.ok(userService.save(info));
    }


}
