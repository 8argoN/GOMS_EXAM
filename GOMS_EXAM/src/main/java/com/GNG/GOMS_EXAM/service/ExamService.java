package com.GNG.GOMS_EXAM.service;

import com.GNG.GOMS_EXAM.dto.admin_infoDTO;
import com.GNG.GOMS_EXAM.entity.Exam;
import com.GNG.GOMS_EXAM.repository.ExamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExamService {
    @Autowired
    ExamRepository examRepository;

    public admin_infoDTO login(admin_infoDTO dto) {
        Optional<Exam> byUser_id = examRepository.findByuserid(dto.getUser_id());
        if (byUser_id.isPresent()) {
            Exam exam = byUser_id.get();
            if (exam.getUserpw().equals(dto.getUser_pw())) {
                admin_infoDTO adminDto = admin_infoDTO.toAdmin_dto(exam);
                return adminDto;
            } else {
                return null;
            }
        } else {
            return null;
        }

    }
}


