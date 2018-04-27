package com.ancda.parents.model;

import java.io.Serializable;
import java.util.List;

/**
 * 作者：DELL-002 on 2018/4/26 10:54
 */
public class ParentLoginModel   implements Serializable {

    private String result;
    private List<DataBean> data;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }




    public static class DataBean {
        /**
         * newuserid : 227
         * sessionid : 1mdrucn74r8k1ke0sc4ip32j73
         * signature : 莫名您木楞
         * students : [{"avatarurl":"http://mediatx.ancda.com/35252aa985c7554752c819b3a046a50c/1517379241104","isgraduate":"0","studentid":"745689","studentname":"哈哈123"},{"avatarurl":"","isgraduate":"0","studentid":"746251","studentname":"张1"},{"avatarurl":"","isgraduate":"0","studentid":"746334","studentname":"嘻嘻"},{"avatarurl":"","isgraduate":"0","studentid":"746387","studentname":"测试登陆1"},{"avatarurl":"","isgraduate":"0","studentid":"746390","studentname":"123123123"},{"avatarurl":"http://mediatx.ancda.com/b7d833825cec08c6c5ebca75b80622df/1516959419779","isgraduate":"0","studentid":"746391","studentname":"12123"},{"avatarurl":"http://mediatx.ancda.com/b30c6914c3a4f3551699c9888c1b21c8/1517368401416","isgraduate":"0","studentid":"746396","studentname":"测试分数"}]
         * useraddress :
         * useravatar : http://mediatx.ancda.com/5e41f49e64d5d2d10a4c8bac7982939b/1524047915618
         * userid : 797176
         * username : 了咯特鲁
         * userstate : 0
         */

        private String newuserid;
        private String sessionid;
        private String signature;
        private String useraddress;
        private String useravatar;
        private String userid;
        private String username;
        private String userstate;
        private List<StudentsBean> students;

        @Override
        public String toString() {
            return "DataBean{" +
                    "newuserid='" + newuserid + '\'' +
                    ", sessionid='" + sessionid + '\'' +
                    ", signature='" + signature + '\'' +
                    ", useraddress='" + useraddress + '\'' +
                    ", useravatar='" + useravatar + '\'' +
                    ", userid='" + userid + '\'' +
                    ", username='" + username + '\'' +
                    ", userstate='" + userstate + '\'' +
                    ", students=" + students +
                    '}';
        }

        public String getNewuserid() {
            return newuserid;
        }

        public void setNewuserid(String newuserid) {
            this.newuserid = newuserid;
        }

        public String getSessionid() {
            return sessionid;
        }

        public void setSessionid(String sessionid) {
            this.sessionid = sessionid;
        }

        public String getSignature() {
            return signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }

        public String getUseraddress() {
            return useraddress;
        }

        public void setUseraddress(String useraddress) {
            this.useraddress = useraddress;
        }

        public String getUseravatar() {
            return useravatar;
        }

        public void setUseravatar(String useravatar) {
            this.useravatar = useravatar;
        }

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getUserstate() {
            return userstate;
        }

        public void setUserstate(String userstate) {
            this.userstate = userstate;
        }

        public List<StudentsBean> getStudents() {
            return students;
        }

        public void setStudents(List<StudentsBean> students) {
            this.students = students;
        }

        public static class StudentsBean {
            /**
             * avatarurl : http://mediatx.ancda.com/35252aa985c7554752c819b3a046a50c/1517379241104
             * isgraduate : 0
             * studentid : 745689
             * studentname : 哈哈123
             */

            private String avatarurl;
            private String isgraduate;
            private String studentid;
            private String studentname;

            @Override
            public String toString() {
                return "StudentsBean{" +
                        "avatarurl='" + avatarurl + '\'' +
                        ", isgraduate='" + isgraduate + '\'' +
                        ", studentid='" + studentid + '\'' +
                        ", studentname='" + studentname + '\'' +
                        '}';
            }

            public String getAvatarurl() {
                return avatarurl;
            }

            public void setAvatarurl(String avatarurl) {
                this.avatarurl = avatarurl;
            }

            public String getIsgraduate() {
                return isgraduate;
            }

            public void setIsgraduate(String isgraduate) {
                this.isgraduate = isgraduate;
            }

            public String getStudentid() {
                return studentid;
            }

            public void setStudentid(String studentid) {
                this.studentid = studentid;
            }

            public String getStudentname() {
                return studentname;
            }

            public void setStudentname(String studentname) {
                this.studentname = studentname;
            }
        }
    }

    @Override
    public String toString() {
        return "ParentLoginModel{" +
                "result='" + result + '\'' +
                ", data=" + data +
                '}';
    }
}
