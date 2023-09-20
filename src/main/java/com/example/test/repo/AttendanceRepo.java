package com.example.test.repo;

import com.example.test.entity.AttendanceEntity;
import com.example.test.entity.AttendanceId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface AttendanceRepo extends JpaRepository<AttendanceEntity, AttendanceId> {

    AttendanceEntity findByEmployeeIdAndDate(String empId, Date date);

}
