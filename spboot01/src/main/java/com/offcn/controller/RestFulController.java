package com.offcn.controller;

import com.offcn.pojo.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/restUser")
public class RestFulController {

    private List<User> list = new ArrayList<>();

    // post    新增
    @PostMapping("/")
    @ApiOperation(value="新增用户", notes="这是一个非常厉害的新增用户的操作")
    @ApiImplicitParam(name = "user", value = "使用json格式传递用户的信息", required = true)
    public List<User> add(@RequestBody User user) {
        list.add(user);
        return list;
    }

    // get    查询
    @GetMapping("/")
    public List<User> get() {
        return list;
    }

    // get    查询
    @GetMapping("/{id}/{age}")
    public User getAll(@PathVariable("id") Integer id, @PathVariable("age") Integer age) {
        System.out.println("接收到的年龄是：" + age);
        for (User user : list) {
            if(user.getId().intValue() == id.intValue()) {
                return user;
            }
        }
        return null;
    }


    // put   修改
    @PutMapping("/")
    public List<User> update(@RequestBody User user) {
        for (User u : list) {
            if(u.getId().intValue() == user.getId().intValue()) {
                u.setUserName(user.getUserName());
                u.setAge(user.getAge());
                u.setGender(user.getGender());
            }

        }
        return list;
    }

    // delete   删除
    @DeleteMapping("/{id}")
    public List<User> delete(@PathVariable("id") Integer id) {
        for (User user : list) {
            if(user.getId().intValue() == id.intValue()) {
                list.remove(user);
            }
        }

        return list;
    }

}
