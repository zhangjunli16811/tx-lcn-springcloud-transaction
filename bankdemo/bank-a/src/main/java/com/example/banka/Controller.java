package com.example.banka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author zhang
 * @Date 2020/5/13 13:59
 **/
@RestController
public class Controller {

    @Autowired
    Service service;

    @GetMapping("/start")
    public String start(@RequestParam("money") int money){
        return service.start(money);
    }
}
