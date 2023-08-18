package com.GNG.GOMS_EXAM.repository;

import com.GNG.GOMS_EXAM.entity.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Repository
public interface ExamRepository extends JpaRepository<Exam,Long> {
    @Query(value = "select * from admin_info", nativeQuery = true)
    public List<Exam> readUser();

}
