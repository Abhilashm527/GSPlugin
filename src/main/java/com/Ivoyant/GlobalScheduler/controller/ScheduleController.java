package com.Ivoyant.GlobalScheduler.controller;

import org.Ivoyant.model.Schedule;
import org.Ivoyant.service.ScheduleImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping("gss/api")
public class ScheduleController {
    @Autowired
    private ScheduleImpl scheduleImpl;

    @PostMapping("/createSchedule")
    public ResponseEntity createSchedule(Schedule schedule) throws SQLException {
        Schedule schedule1 = scheduleImpl.create(schedule);
        return ResponseEntity.status(HttpStatusCode.valueOf(201)).body("Schedule has been created");
    }
}