package top.axbt.to.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.axbt.to.domain.Test;

@RestController
public class TestController {

    @RequestMapping(value = "/test")
    public Test test(){
        Test test = new Test("中","流");
        return test;
    }

}
