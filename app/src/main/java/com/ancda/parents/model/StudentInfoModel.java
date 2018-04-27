package com.ancda.parents.model;

import java.util.List;

/**
 * 作者：DELL-002 on 2018/4/27 14:40
 */
public class StudentInfoModel {


    /**
     * data : [{"Baby":{"avatarurl":"http://7xjmzj.com1.z0.glb.clouddn.com/b7d833825cec08c6c5ebca75b80622df/1516959419779","birth":"2017-11-29","cardnum":"","classid":"31771","classname":"但是","eleccardnum":"","enddate":"2017-11-29","gradename":"大班","id":"746391","intoschooldate":"","name":"12123","nickname":"","sex":"1","startdate":"2017-11-29"},"SchoolId":"11444","babyonlinestate":0,"cameraexpireday":"-149","camerainfo":{"password":"11444","username":"10000415746391_13049819524"},"cameratime":{"endtime":0,"starttime":0},"childrelation":"爸爸","commentClose":"0","expiredays":"-149","footernav":[{"index":"0","isshow":"1","name":"幼儿园"},{"index":"1","isshow":"1","name":"动态"}],"footernavcurrent":"0","invitationnum":"3","isprotected":"0","isvip":"0","newtime":{"newtime_babyinfo":"1524810897","newtime_schoolconfig":"1524717081","newtime_schoolinfo":"1524717081"},"newuserid":"227","parentid":"797353","parentname":"了咯特鲁","pavatarurl":"http://mediatx.ancda.com/5e41f49e64d5d2d10a4c8bac7982939b/1524047915618","relationship":"1","service":{"chargeswitch":"00000000000000000000000000000000","infoexpirydays":"-149","items":"6","serviceswitch":"11"},"showwebsite":"1","signature":"莫名您木楞","unreadlist":{"action":"5","activity":13,"community":"1","falimy":"0","homework":"5","message":"0","news":42,"notify":28,"plan":"0","relevant":"0","review":"0","secretary":"115"},"useraddress":""}]
     * result : 0
     */

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
         * Baby : {"avatarurl":"http://7xjmzj.com1.z0.glb.clouddn.com/b7d833825cec08c6c5ebca75b80622df/1516959419779","birth":"2017-11-29","cardnum":"","classid":"31771","classname":"但是","eleccardnum":"","enddate":"2017-11-29","gradename":"大班","id":"746391","intoschooldate":"","name":"12123","nickname":"","sex":"1","startdate":"2017-11-29"}
         * SchoolId : 11444
         * babyonlinestate : 0
         * cameraexpireday : -149
         * camerainfo : {"password":"11444","username":"10000415746391_13049819524"}
         * cameratime : {"endtime":0,"starttime":0}
         * childrelation : 爸爸
         * commentClose : 0
         * expiredays : -149
         * footernav : [{"index":"0","isshow":"1","name":"幼儿园"},{"index":"1","isshow":"1","name":"动态"}]
         * footernavcurrent : 0
         * invitationnum : 3
         * isprotected : 0
         * isvip : 0
         * newtime : {"newtime_babyinfo":"1524810897","newtime_schoolconfig":"1524717081","newtime_schoolinfo":"1524717081"}
         * newuserid : 227
         * parentid : 797353
         * parentname : 了咯特鲁
         * pavatarurl : http://mediatx.ancda.com/5e41f49e64d5d2d10a4c8bac7982939b/1524047915618
         * relationship : 1
         * service : {"chargeswitch":"00000000000000000000000000000000","infoexpirydays":"-149","items":"6","serviceswitch":"11"}
         * showwebsite : 1
         * signature : 莫名您木楞
         * unreadlist : {"action":"5","activity":13,"community":"1","falimy":"0","homework":"5","message":"0","news":42,"notify":28,"plan":"0","relevant":"0","review":"0","secretary":"115"}
         * useraddress :
         */

        private BabyBean Baby;
        private String SchoolId;
        private int babyonlinestate;
        private String cameraexpireday;
        private CamerainfoBean camerainfo;
        private CameratimeBean cameratime;
        private String childrelation;
        private String commentClose;
        private String expiredays;
        private String footernavcurrent;
        private String invitationnum;
        private String isprotected;
        private String isvip;
        private NewtimeBean newtime;
        private String newuserid;
        private String parentid;
        private String parentname;
        private String pavatarurl;
        private String relationship;
        private ServiceBean service;
        private String showwebsite;
        private String signature;
        private UnreadlistBean unreadlist;
        private String useraddress;
        private List<FooternavBean> footernav;

        @Override
        public String toString() {
            return "DataBean{" +
                    "Baby=" + Baby +
                    ", SchoolId='" + SchoolId + '\'' +
                    ", babyonlinestate=" + babyonlinestate +
                    ", cameraexpireday='" + cameraexpireday + '\'' +
                    ", camerainfo=" + camerainfo +
                    ", cameratime=" + cameratime +
                    ", childrelation='" + childrelation + '\'' +
                    ", commentClose='" + commentClose + '\'' +
                    ", expiredays='" + expiredays + '\'' +
                    ", footernavcurrent='" + footernavcurrent + '\'' +
                    ", invitationnum='" + invitationnum + '\'' +
                    ", isprotected='" + isprotected + '\'' +
                    ", isvip='" + isvip + '\'' +
                    ", newtime=" + newtime +
                    ", newuserid='" + newuserid + '\'' +
                    ", parentid='" + parentid + '\'' +
                    ", parentname='" + parentname + '\'' +
                    ", pavatarurl='" + pavatarurl + '\'' +
                    ", relationship='" + relationship + '\'' +
                    ", service=" + service +
                    ", showwebsite='" + showwebsite + '\'' +
                    ", signature='" + signature + '\'' +
                    ", unreadlist=" + unreadlist +
                    ", useraddress='" + useraddress + '\'' +
                    ", footernav=" + footernav +
                    '}';
        }

        public BabyBean getBaby() {
            return Baby;
        }

        public void setBaby(BabyBean Baby) {
            this.Baby = Baby;
        }

        public String getSchoolId() {
            return SchoolId;
        }

        public void setSchoolId(String SchoolId) {
            this.SchoolId = SchoolId;
        }

        public int getBabyonlinestate() {
            return babyonlinestate;
        }

        public void setBabyonlinestate(int babyonlinestate) {
            this.babyonlinestate = babyonlinestate;
        }

        public String getCameraexpireday() {
            return cameraexpireday;
        }

        public void setCameraexpireday(String cameraexpireday) {
            this.cameraexpireday = cameraexpireday;
        }

        public CamerainfoBean getCamerainfo() {
            return camerainfo;
        }

        public void setCamerainfo(CamerainfoBean camerainfo) {
            this.camerainfo = camerainfo;
        }

        public CameratimeBean getCameratime() {
            return cameratime;
        }

        public void setCameratime(CameratimeBean cameratime) {
            this.cameratime = cameratime;
        }

        public String getChildrelation() {
            return childrelation;
        }

        public void setChildrelation(String childrelation) {
            this.childrelation = childrelation;
        }

        public String getCommentClose() {
            return commentClose;
        }

        public void setCommentClose(String commentClose) {
            this.commentClose = commentClose;
        }

        public String getExpiredays() {
            return expiredays;
        }

        public void setExpiredays(String expiredays) {
            this.expiredays = expiredays;
        }

        public String getFooternavcurrent() {
            return footernavcurrent;
        }

        public void setFooternavcurrent(String footernavcurrent) {
            this.footernavcurrent = footernavcurrent;
        }

        public String getInvitationnum() {
            return invitationnum;
        }

        public void setInvitationnum(String invitationnum) {
            this.invitationnum = invitationnum;
        }

        public String getIsprotected() {
            return isprotected;
        }

        public void setIsprotected(String isprotected) {
            this.isprotected = isprotected;
        }

        public String getIsvip() {
            return isvip;
        }

        public void setIsvip(String isvip) {
            this.isvip = isvip;
        }

        public NewtimeBean getNewtime() {
            return newtime;
        }

        public void setNewtime(NewtimeBean newtime) {
            this.newtime = newtime;
        }

        public String getNewuserid() {
            return newuserid;
        }

        public void setNewuserid(String newuserid) {
            this.newuserid = newuserid;
        }

        public String getParentid() {
            return parentid;
        }

        public void setParentid(String parentid) {
            this.parentid = parentid;
        }

        public String getParentname() {
            return parentname;
        }

        public void setParentname(String parentname) {
            this.parentname = parentname;
        }

        public String getPavatarurl() {
            return pavatarurl;
        }

        public void setPavatarurl(String pavatarurl) {
            this.pavatarurl = pavatarurl;
        }

        public String getRelationship() {
            return relationship;
        }

        public void setRelationship(String relationship) {
            this.relationship = relationship;
        }

        public ServiceBean getService() {
            return service;
        }

        public void setService(ServiceBean service) {
            this.service = service;
        }

        public String getShowwebsite() {
            return showwebsite;
        }

        public void setShowwebsite(String showwebsite) {
            this.showwebsite = showwebsite;
        }

        public String getSignature() {
            return signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }

        public UnreadlistBean getUnreadlist() {
            return unreadlist;
        }

        public void setUnreadlist(UnreadlistBean unreadlist) {
            this.unreadlist = unreadlist;
        }

        public String getUseraddress() {
            return useraddress;
        }

        public void setUseraddress(String useraddress) {
            this.useraddress = useraddress;
        }

        public List<FooternavBean> getFooternav() {
            return footernav;
        }

        public void setFooternav(List<FooternavBean> footernav) {
            this.footernav = footernav;
        }

        public static class BabyBean {
            /**
             * avatarurl : http://7xjmzj.com1.z0.glb.clouddn.com/b7d833825cec08c6c5ebca75b80622df/1516959419779
             * birth : 2017-11-29
             * cardnum :
             * classid : 31771
             * classname : 但是
             * eleccardnum :
             * enddate : 2017-11-29
             * gradename : 大班
             * id : 746391
             * intoschooldate :
             * name : 12123
             * nickname :
             * sex : 1
             * startdate : 2017-11-29
             */

            private String avatarurl;
            private String birth;
            private String cardnum;
            private String classid;
            private String classname;
            private String eleccardnum;
            private String enddate;
            private String gradename;
            private String id;
            private String intoschooldate;
            private String name;
            private String nickname;
            private String sex;
            private String startdate;

            public String getAvatarurl() {
                return avatarurl;
            }

            public void setAvatarurl(String avatarurl) {
                this.avatarurl = avatarurl;
            }

            public String getBirth() {
                return birth;
            }

            public void setBirth(String birth) {
                this.birth = birth;
            }

            public String getCardnum() {
                return cardnum;
            }

            public void setCardnum(String cardnum) {
                this.cardnum = cardnum;
            }

            public String getClassid() {
                return classid;
            }

            public void setClassid(String classid) {
                this.classid = classid;
            }

            public String getClassname() {
                return classname;
            }

            public void setClassname(String classname) {
                this.classname = classname;
            }

            public String getEleccardnum() {
                return eleccardnum;
            }

            public void setEleccardnum(String eleccardnum) {
                this.eleccardnum = eleccardnum;
            }

            public String getEnddate() {
                return enddate;
            }

            public void setEnddate(String enddate) {
                this.enddate = enddate;
            }

            public String getGradename() {
                return gradename;
            }

            public void setGradename(String gradename) {
                this.gradename = gradename;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getIntoschooldate() {
                return intoschooldate;
            }

            public void setIntoschooldate(String intoschooldate) {
                this.intoschooldate = intoschooldate;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getSex() {
                return sex;
            }

            public void setSex(String sex) {
                this.sex = sex;
            }

            public String getStartdate() {
                return startdate;
            }

            public void setStartdate(String startdate) {
                this.startdate = startdate;
            }
        }

        public static class CamerainfoBean {
            /**
             * password : 11444
             * username : 10000415746391_13049819524
             */

            private String password;
            private String username;

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }
        }

        public static class CameratimeBean {
            /**
             * endtime : 0
             * starttime : 0
             */

            private int endtime;
            private int starttime;

            public int getEndtime() {
                return endtime;
            }

            public void setEndtime(int endtime) {
                this.endtime = endtime;
            }

            public int getStarttime() {
                return starttime;
            }

            public void setStarttime(int starttime) {
                this.starttime = starttime;
            }
        }

        public static class NewtimeBean {
            /**
             * newtime_babyinfo : 1524810897
             * newtime_schoolconfig : 1524717081
             * newtime_schoolinfo : 1524717081
             */

            private String newtime_babyinfo;
            private String newtime_schoolconfig;
            private String newtime_schoolinfo;

            public String getNewtime_babyinfo() {
                return newtime_babyinfo;
            }

            public void setNewtime_babyinfo(String newtime_babyinfo) {
                this.newtime_babyinfo = newtime_babyinfo;
            }

            public String getNewtime_schoolconfig() {
                return newtime_schoolconfig;
            }

            public void setNewtime_schoolconfig(String newtime_schoolconfig) {
                this.newtime_schoolconfig = newtime_schoolconfig;
            }

            public String getNewtime_schoolinfo() {
                return newtime_schoolinfo;
            }

            public void setNewtime_schoolinfo(String newtime_schoolinfo) {
                this.newtime_schoolinfo = newtime_schoolinfo;
            }
        }

        public static class ServiceBean {
            /**
             * chargeswitch : 00000000000000000000000000000000
             * infoexpirydays : -149
             * items : 6
             * serviceswitch : 11
             */

            private String chargeswitch;
            private String infoexpirydays;
            private String items;
            private String serviceswitch;

            public String getChargeswitch() {
                return chargeswitch;
            }

            public void setChargeswitch(String chargeswitch) {
                this.chargeswitch = chargeswitch;
            }

            public String getInfoexpirydays() {
                return infoexpirydays;
            }

            public void setInfoexpirydays(String infoexpirydays) {
                this.infoexpirydays = infoexpirydays;
            }

            public String getItems() {
                return items;
            }

            public void setItems(String items) {
                this.items = items;
            }

            public String getServiceswitch() {
                return serviceswitch;
            }

            public void setServiceswitch(String serviceswitch) {
                this.serviceswitch = serviceswitch;
            }
        }

        public static class UnreadlistBean {
            /**
             * action : 5
             * activity : 13
             * community : 1
             * falimy : 0
             * homework : 5
             * message : 0
             * news : 42
             * notify : 28
             * plan : 0
             * relevant : 0
             * review : 0
             * secretary : 115
             */

            private String action;
            private int activity;
            private String community;
            private String falimy;
            private String homework;
            private String message;
            private int news;
            private int notify;
            private String plan;
            private String relevant;
            private String review;
            private String secretary;

            public String getAction() {
                return action;
            }

            public void setAction(String action) {
                this.action = action;
            }

            public int getActivity() {
                return activity;
            }

            public void setActivity(int activity) {
                this.activity = activity;
            }

            public String getCommunity() {
                return community;
            }

            public void setCommunity(String community) {
                this.community = community;
            }

            public String getFalimy() {
                return falimy;
            }

            public void setFalimy(String falimy) {
                this.falimy = falimy;
            }

            public String getHomework() {
                return homework;
            }

            public void setHomework(String homework) {
                this.homework = homework;
            }

            public String getMessage() {
                return message;
            }

            public void setMessage(String message) {
                this.message = message;
            }

            public int getNews() {
                return news;
            }

            public void setNews(int news) {
                this.news = news;
            }

            public int getNotify() {
                return notify;
            }

            public void setNotify(int notify) {
                this.notify = notify;
            }

            public String getPlan() {
                return plan;
            }

            public void setPlan(String plan) {
                this.plan = plan;
            }

            public String getRelevant() {
                return relevant;
            }

            public void setRelevant(String relevant) {
                this.relevant = relevant;
            }

            public String getReview() {
                return review;
            }

            public void setReview(String review) {
                this.review = review;
            }

            public String getSecretary() {
                return secretary;
            }

            public void setSecretary(String secretary) {
                this.secretary = secretary;
            }
        }

        public static class FooternavBean {
            /**
             * index : 0
             * isshow : 1
             * name : 幼儿园
             */

            private String index;
            private String isshow;
            private String name;

            public String getIndex() {
                return index;
            }

            public void setIndex(String index) {
                this.index = index;
            }

            public String getIsshow() {
                return isshow;
            }

            public void setIsshow(String isshow) {
                this.isshow = isshow;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
