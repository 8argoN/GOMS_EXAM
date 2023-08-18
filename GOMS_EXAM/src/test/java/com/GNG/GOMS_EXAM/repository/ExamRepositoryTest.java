package com.GNG.GOMS_EXAM.repository;

import com.GNG.GOMS_EXAM.entity.Exam;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ExamRepositoryTest {
    @Autowired
    ExamRepository repo;
    @Test
    public void testAll(){
        List<Exam> examList=repo.findAll();
        for(Exam exam : examList){
            System.out.println(exam.getUser_id());
            System.out.println(exam.getUser_pw());
        }
    }

}