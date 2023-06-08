package com.example.things.with.pings.lazyandeagerloading.controller;

import com.example.things.with.pings.lazyandeagerloading.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Viraj_107294
 * Viraj.Wickramasinghe@axiatadigitallabs.com
 * 6/4/2023
 */

@RestController
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/get/passport/number/student/{studentId}")
    public String getStudentPassportNumber(@PathVariable Long studentId){
       return studentService.getPassportNumber(studentId);
    }
}
