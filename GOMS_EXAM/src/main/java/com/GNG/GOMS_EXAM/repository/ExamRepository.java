package com.GNG.GOMS_EXAM.repository;

import com.GNG.GOMS_EXAM.entity.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.parser.Entity;
import java.util.List;
import java.util.Optional;

@Repository
public interface ExamRepository extends JpaRepository<Exam,String> {
    //이메일 회원 정보 조회(select * from admin_info where user_id=?
    Optional<Exam> findByuserid(String userid);
}
