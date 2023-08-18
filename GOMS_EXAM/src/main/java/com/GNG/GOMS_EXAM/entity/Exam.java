package com.GNG.GOMS_EXAM.entity;

//import com.GNG.GOMS_EXAM.dto.admin_infoDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data /*Getter,Setter*/
@Table(name="admin_info")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Exam {
    @Id
    private String user_id;
    private String user_pw;

}
