package com.GNG.GOMS_EXAM.entity;

//import com.GNG.GOMS_EXAM.dto.admin_infoDTO;
import com.GNG.GOMS_EXAM.dto.admin_infoDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data /*Getter,Setter*/
@Table(name="admin_info")
public class Exam {
    @Id /*PK*/
    private String userid;
    @Column
    private String userpw;

    public static Exam exam(admin_infoDTO dto){
        Exam exam=new Exam();
        exam.setUserid(dto.getUser_id());
        exam.setUserpw(dto.getUser_pw());
        return exam;
    }

}
