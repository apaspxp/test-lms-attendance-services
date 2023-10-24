package com.example.test.service;

import com.example.test.entity.AttendanceEntity;
import com.example.test.repo.AttendanceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private AttendanceRepo attendanceRepo;

    public List<AttendanceEntity> findAll(){
        return attendanceRepo.findAll();
    }
}
