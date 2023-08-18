package com.GNG.GOMS_EXAM.service;

import com.GNG.GOMS_EXAM.entity.Exam;
import com.GNG.GOMS_EXAM.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExamService {
    @Autowired
    ExamRepository examRepository;

    public List<Exam> doSelectAll(){
        return examRepository.findAll();
    }



}
