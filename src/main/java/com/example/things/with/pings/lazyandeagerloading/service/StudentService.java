package com.example.things.with.pings.lazyandeagerloading.service;

import com.example.things.with.pings.lazyandeagerloading.entity.Passport;
import com.example.things.with.pings.lazyandeagerloading.entity.Student;
import com.example.things.with.pings.lazyandeagerloading.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Viraj_107294
 * Viraj.Wickramasinghe@axiatadigitallabs.com
 * 6/4/2023
 */

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public String getPassportNumber(Long studentId){
        String passportNumber = null;
        Optional<Student> student = studentRepository.findById(studentId);
        if (student.isPresent()){
            Passport passport = student.get().getPassport();
            passportNumber = passport.getNumber();
        }
        return passportNumber;
    }
}

