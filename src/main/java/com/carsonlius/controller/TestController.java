package com.carsonlius.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @version V1.0
 * @author: carsonlius
 * @date: 2023/11/20 16:38
 * @company
 * @description
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public Object test(){
        Map<String, String> response = new HashMap<String, String>();
        response.put("code", "0");
        response.put("message", "请求成功");
        return response;
    }

    @GetMapping("/test2")
    public Object test2(){
        Map<String, Object> response = new HashMap<>();
        response.put("code", "0");
        response.put("message", "恭喜你成功使用jenkins部署项目");
        response.put("data", new ArrayList<String>());
        return response;
    }

}
