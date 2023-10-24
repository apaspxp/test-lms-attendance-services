package com.example.test.controller;

import com.example.test.entity.AttendanceEntity;
import com.example.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return "Test Sucsess";
    }

    @RequestMapping(value = "findall", method = RequestMethod.GET)
    public List<AttendanceEntity> findAll() {
        return testService.findAll();
    }
}
