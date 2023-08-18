package com.GNG.GOMS_EXAM.dto;
import com.GNG.GOMS_EXAM.entity.Exam;

public class admin_infoDTO {
        private String user_id,user_pw;

        public admin_infoDTO() {}
        public admin_infoDTO(String id, String pw) {
            this.user_id = id;
            this.user_pw = pw;

        }

        public String getUser_id() {
            return user_id;
        }

        public void setUser_id(String id) {
            this.user_id =id;
        }


        public String getUser_pw() {
            return user_pw;
        }

        public void setUser_pw(String pw) {
            this.user_pw=pw;
        }

        public Exam toEntity() {
            return new Exam(user_id,user_pw);
        }

    }

