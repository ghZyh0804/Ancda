package com.ancda.parents.model;

import java.util.List;

/**
 * 作者：DELL-002 on 2018/5/7 13:53
 */
public class DynamicFramentModel {


    /**
     * audittype : 3
     * avatarurl : http://7xjmzj.com1.z0.glb.clouddn.com/08e6bea8e90ba87af3c9554d94db6579/20150602/1433214860867/50a93161d98c35dd2d7e2e7c9adfb702.jpg
     * commentcount : 0
     * comments : [{"actionid":"468","content":"≦⊕\u2030ⅥⅩ@↕↨","createdate":"2015-06-27 18:23:46","enabled":"1","id":"376","name":"小语爸爸","parentcommentid":"0","parentcommentname":"","userid":"82","username":"小语爸爸","usertype":"10"}]
     * createdate : 2015-06-27 17:49:13
     * gifs : [{"actionid":"488","bigimageurl":"http://7xjmzj.com1.z0.glb.clouddn.com/08e6bea8e90ba87af3c9554d94db6579/20150604/1433413402849/microMsg.1428328179944.jpg","createdate":"2015-07-31 18:21:04","id":"527","imageurl":"http://7xjmzj.com1.z0.glb.clouddn.com/08e6bea8e90ba87af3c9554d94db6579/20150604/1433413402849/microMsg.1428328179944.jpg?imageView2/1/h/200/w/200","tag":"1"}]
     * id : 468
     * images : [{"actionid":"468","bigimageurl":"http://7xjmzj.com1.z0.glb.clouddn.com/1389c7ec8195819fed1e816e1311fcfc/1435398543180","createdate":"2015-06-27 17:49:14","id":"478","imageurl":"http://7xjmzj.com1.z0.glb.clouddn.com/1389c7ec8195819fed1e816e1311fcfc/1435398543180?imageView2/1/h/200/w/200","tag":"0"}]
     * likecount : 1
     * likes : [{"createdate":"2015-06-27 18:09:20","name":"小语爸爸","userid":"82","usertype":"10"}]
     * publishername : 小语爸爸
     * publishname : 小语爸爸
     * publishroleid : 10
     * publishteacherid : 82
     * roleid : 3
     * schoolid : 7
     * shareurl : http://192.168.2.26:80/openaction/showaction?actionid=10481
     * textcontent : 是否关闭不电饭锅好机会东方红急急急
     * unread : 0
     * unreadids : 492
     * unreadnum : 1
     * videos : [{"actionid":"488","createdate":"2015-07-31 18:21:04","id":"2","thumburl":"http://7xjmzj.com1.z0.glb.clouddn.com/333","videourl":"http://7xjmzj.com1.z0.glb.clouddn.com/555"}]
     */

    private String audittype;
    private String avatarurl;
    private String commentcount;
    private String createdate;
    private String id;
    private String likecount;
    private String publishername;
    private String publishname;
    private String publishroleid;
    private String publishteacherid;
    private String roleid;
    private String schoolid;
    private String shareurl;
    private String textcontent;
    private String unread;
    private String unreadids;
    private int unreadnum;
    private List<CommentsBean> comments;
    private List<GifsBean> gifs;
    private List<ImagesBean> images;
    private List<LikesBean> likes;
    private List<VideosBean> videos;

    public String getAudittype() {
        return audittype;
    }

    public void setAudittype(String audittype) {
        this.audittype = audittype;
    }

    public String getAvatarurl() {
        return avatarurl;
    }

    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl;
    }

    public String getCommentcount() {
        return commentcount;
    }

    public void setCommentcount(String commentcount) {
        this.commentcount = commentcount;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLikecount() {
        return likecount;
    }

    public void setLikecount(String likecount) {
        this.likecount = likecount;
    }

    public String getPublishername() {
        return publishername;
    }

    public void setPublishername(String publishername) {
        this.publishername = publishername;
    }

    public String getPublishname() {
        return publishname;
    }

    public void setPublishname(String publishname) {
        this.publishname = publishname;
    }

    public String getPublishroleid() {
        return publishroleid;
    }

    public void setPublishroleid(String publishroleid) {
        this.publishroleid = publishroleid;
    }

    public String getPublishteacherid() {
        return publishteacherid;
    }

    public void setPublishteacherid(String publishteacherid) {
        this.publishteacherid = publishteacherid;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(String schoolid) {
        this.schoolid = schoolid;
    }

    public String getShareurl() {
        return shareurl;
    }

    public void setShareurl(String shareurl) {
        this.shareurl = shareurl;
    }

    public String getTextcontent() {
        return textcontent;
    }

    public void setTextcontent(String textcontent) {
        this.textcontent = textcontent;
    }

    public String getUnread() {
        return unread;
    }

    public void setUnread(String unread) {
        this.unread = unread;
    }

    public String getUnreadids() {
        return unreadids;
    }

    public void setUnreadids(String unreadids) {
        this.unreadids = unreadids;
    }

    public int getUnreadnum() {
        return unreadnum;
    }

    public void setUnreadnum(int unreadnum) {
        this.unreadnum = unreadnum;
    }

    public List<CommentsBean> getComments() {
        return comments;
    }

    public void setComments(List<CommentsBean> comments) {
        this.comments = comments;
    }

    public List<GifsBean> getGifs() {
        return gifs;
    }

    public void setGifs(List<GifsBean> gifs) {
        this.gifs = gifs;
    }

    public List<ImagesBean> getImages() {
        return images;
    }

    public void setImages(List<ImagesBean> images) {
        this.images = images;
    }

    public List<LikesBean> getLikes() {
        return likes;
    }

    public void setLikes(List<LikesBean> likes) {
        this.likes = likes;
    }

    public List<VideosBean> getVideos() {
        return videos;
    }

    public void setVideos(List<VideosBean> videos) {
        this.videos = videos;
    }

    public static class CommentsBean {
        /**
         * actionid : 468
         * content : ≦⊕‰ⅥⅩ@↕↨
         * createdate : 2015-06-27 18:23:46
         * enabled : 1
         * id : 376
         * name : 小语爸爸
         * parentcommentid : 0
         * parentcommentname :
         * userid : 82
         * username : 小语爸爸
         * usertype : 10
         */

        private String actionid;
        private String content;
        private String createdate;
        private String enabled;
        private String id;
        private String name;
        private String parentcommentid;
        private String parentcommentname;
        private String userid;
        private String username;
        private String usertype;

        public String getActionid() {
            return actionid;
        }

        public void setActionid(String actionid) {
            this.actionid = actionid;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreatedate() {
            return createdate;
        }

        public void setCreatedate(String createdate) {
            this.createdate = createdate;
        }

        public String getEnabled() {
            return enabled;
        }

        public void setEnabled(String enabled) {
            this.enabled = enabled;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getParentcommentid() {
            return parentcommentid;
        }

        public void setParentcommentid(String parentcommentid) {
            this.parentcommentid = parentcommentid;
        }

        public String getParentcommentname() {
            return parentcommentname;
        }

        public void setParentcommentname(String parentcommentname) {
            this.parentcommentname = parentcommentname;
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

        public String getUsertype() {
            return usertype;
        }

        public void setUsertype(String usertype) {
            this.usertype = usertype;
        }

        @Override
        public String toString() {
            return "CommentsBean{" +
                    "actionid='" + actionid + '\'' +
                    ", content='" + content + '\'' +
                    ", createdate='" + createdate + '\'' +
                    ", enabled='" + enabled + '\'' +
                    ", id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", parentcommentid='" + parentcommentid + '\'' +
                    ", parentcommentname='" + parentcommentname + '\'' +
                    ", userid='" + userid + '\'' +
                    ", username='" + username + '\'' +
                    ", usertype='" + usertype + '\'' +
                    '}';
        }
    }

    public static class GifsBean {
        /**
         * actionid : 488
         * bigimageurl : http://7xjmzj.com1.z0.glb.clouddn.com/08e6bea8e90ba87af3c9554d94db6579/20150604/1433413402849/microMsg.1428328179944.jpg
         * createdate : 2015-07-31 18:21:04
         * id : 527
         * imageurl : http://7xjmzj.com1.z0.glb.clouddn.com/08e6bea8e90ba87af3c9554d94db6579/20150604/1433413402849/microMsg.1428328179944.jpg?imageView2/1/h/200/w/200
         * tag : 1
         */

        private String actionid;
        private String bigimageurl;
        private String createdate;
        private String id;
        private String imageurl;
        private String tag;

        public String getActionid() {
            return actionid;
        }

        public void setActionid(String actionid) {
            this.actionid = actionid;
        }

        public String getBigimageurl() {
            return bigimageurl;
        }

        public void setBigimageurl(String bigimageurl) {
            this.bigimageurl = bigimageurl;
        }

        public String getCreatedate() {
            return createdate;
        }

        public void setCreatedate(String createdate) {
            this.createdate = createdate;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getImageurl() {
            return imageurl;
        }

        public void setImageurl(String imageurl) {
            this.imageurl = imageurl;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        @Override
        public String toString() {
            return "GifsBean{" +
                    "actionid='" + actionid + '\'' +
                    ", bigimageurl='" + bigimageurl + '\'' +
                    ", createdate='" + createdate + '\'' +
                    ", id='" + id + '\'' +
                    ", imageurl='" + imageurl + '\'' +
                    ", tag='" + tag + '\'' +
                    '}';
        }
    }

    public static class ImagesBean {
        /**
         * actionid : 468
         * bigimageurl : http://7xjmzj.com1.z0.glb.clouddn.com/1389c7ec8195819fed1e816e1311fcfc/1435398543180
         * createdate : 2015-06-27 17:49:14
         * id : 478
         * imageurl : http://7xjmzj.com1.z0.glb.clouddn.com/1389c7ec8195819fed1e816e1311fcfc/1435398543180?imageView2/1/h/200/w/200
         * tag : 0
         */

        private String actionid;
        private String bigimageurl;
        private String createdate;
        private String id;
        private String imageurl;
        private String tag;

        public String getActionid() {
            return actionid;
        }

        public void setActionid(String actionid) {
            this.actionid = actionid;
        }

        public String getBigimageurl() {
            return bigimageurl;
        }

        public void setBigimageurl(String bigimageurl) {
            this.bigimageurl = bigimageurl;
        }

        public String getCreatedate() {
            return createdate;
        }

        public void setCreatedate(String createdate) {
            this.createdate = createdate;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getImageurl() {
            return imageurl;
        }

        public void setImageurl(String imageurl) {
            this.imageurl = imageurl;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        @Override
        public String toString() {
            return "ImagesBean{" +
                    "actionid='" + actionid + '\'' +
                    ", bigimageurl='" + bigimageurl + '\'' +
                    ", createdate='" + createdate + '\'' +
                    ", id='" + id + '\'' +
                    ", imageurl='" + imageurl + '\'' +
                    ", tag='" + tag + '\'' +
                    '}';
        }
    }

    public static class LikesBean {
        /**
         * createdate : 2015-06-27 18:09:20
         * name : 小语爸爸
         * userid : 82
         * usertype : 10
         */

        private String createdate;
        private String name;
        private String userid;
        private String usertype;

        public String getCreatedate() {
            return createdate;
        }

        public void setCreatedate(String createdate) {
            this.createdate = createdate;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public String getUsertype() {
            return usertype;
        }

        public void setUsertype(String usertype) {
            this.usertype = usertype;
        }

        @Override
        public String toString() {
            return "LikesBean{" +
                    "createdate='" + createdate + '\'' +
                    ", name='" + name + '\'' +
                    ", userid='" + userid + '\'' +
                    ", usertype='" + usertype + '\'' +
                    '}';
        }
    }

    public static class VideosBean {
        /**
         * actionid : 488
         * createdate : 2015-07-31 18:21:04
         * id : 2
         * thumburl : http://7xjmzj.com1.z0.glb.clouddn.com/333
         * videourl : http://7xjmzj.com1.z0.glb.clouddn.com/555
         */

        private String actionid;
        private String createdate;
        private String id;
        private String thumburl;
        private String videourl;

        public String getActionid() {
            return actionid;
        }

        public void setActionid(String actionid) {
            this.actionid = actionid;
        }

        public String getCreatedate() {
            return createdate;
        }

        public void setCreatedate(String createdate) {
            this.createdate = createdate;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getThumburl() {
            return thumburl;
        }

        public void setThumburl(String thumburl) {
            this.thumburl = thumburl;
        }

        public String getVideourl() {
            return videourl;
        }

        public void setVideourl(String videourl) {
            this.videourl = videourl;
        }

        @Override
        public String toString() {
            return "VideosBean{" +
                    "actionid='" + actionid + '\'' +
                    ", createdate='" + createdate + '\'' +
                    ", id='" + id + '\'' +
                    ", thumburl='" + thumburl + '\'' +
                    ", videourl='" + videourl + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "DynamicFramentModel{" +
                "audittype='" + audittype + '\'' +
                ", avatarurl='" + avatarurl + '\'' +
                ", commentcount='" + commentcount + '\'' +
                ", createdate='" + createdate + '\'' +
                ", id='" + id + '\'' +
                ", likecount='" + likecount + '\'' +
                ", publishername='" + publishername + '\'' +
                ", publishname='" + publishname + '\'' +
                ", publishroleid='" + publishroleid + '\'' +
                ", publishteacherid='" + publishteacherid + '\'' +
                ", roleid='" + roleid + '\'' +
                ", schoolid='" + schoolid + '\'' +
                ", shareurl='" + shareurl + '\'' +
                ", textcontent='" + textcontent + '\'' +
                ", unread='" + unread + '\'' +
                ", unreadids='" + unreadids + '\'' +
                ", unreadnum=" + unreadnum +
                ", comments=" + comments +
                ", gifs=" + gifs +
                ", images=" + images +
                ", likes=" + likes +
                ", videos=" + videos +
                '}';
    }
}
