package com.GNG.GOMS_EXAM.dto;
import com.GNG.GOMS_EXAM.entity.Exam;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class admin_infoDTO {
        private String user_id,user_pw;
        public static admin_infoDTO toAdmin_dto(Exam exam) {
            admin_infoDTO dto=new admin_infoDTO();
            dto.setUser_id(exam.getUserid());
            dto.setUser_pw(exam.getUserpw());
            return dto;
        }

    }

