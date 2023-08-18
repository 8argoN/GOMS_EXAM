package com.GNG.GOMS_EXAM.controller;

import com.GNG.GOMS_EXAM.entity.Exam;
import com.GNG.GOMS_EXAM.repository.ExamRepository;
import com.GNG.GOMS_EXAM.service.ExamService;
import jakarta.persistence.Entity;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExamController {
    //    @Autowired
//    private ExamService examService;
//    @Autowired
//    ExamRepository examRepository;
//    Exam exam;
    @GetMapping("/GOMS_EXAM/login")
    public String loginForm() {

        return "login";
    }

    @GetMapping("/GOMS_EXAM/admin")
    public String adminForm() {
        return "admin";
    }



}
