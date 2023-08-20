package com.GNG.GOMS_EXAM.controller;

import com.GNG.GOMS_EXAM.dto.admin_infoDTO;
import com.GNG.GOMS_EXAM.entity.Exam;
import com.GNG.GOMS_EXAM.repository.ExamRepository;
import com.GNG.GOMS_EXAM.service.ExamService;
import jakarta.persistence.Entity;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class ExamController {
    //    @Autowired
    private final ExamService examService;
    @GetMapping("/GOMS_EXAM/login")
    public String loginForm() {

        return "login";
    }

    @PostMapping("/GOMS_EXAM/login")
    public String loginData(@ModelAttribute admin_infoDTO dto, HttpSession session) {
        admin_infoDTO loginResult = examService.login(dto);
        if (loginResult != null) {
            session.setAttribute("loginEmail", loginResult.getUser_id());
            System.out.println("success");
            return "admin";
        } else {
            System.out.println("fail");
            return "login";
        }

    }

    @GetMapping("/GOMS_EXAM/admin")
    public String adminForm() {
        return "admin";
    }
}
