package com.ancda.parents.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.ancda.parents.utils.DataInitConfig;
import com.ancda.parents.utils.DateUtil;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * 动态信息
 */
public class DynamicTextDataItem implements Parcelable {
    private String id;

    private String schoolid;

    private String audittype;

    private String publishteacherid;

    private String createdate;

    private String textcontent;

    private int likecount;

    private String publishroleid;

    private int commentcount;

    private String avatarurl;

    private String publishname;

    private boolean isLike = false;

    private String likeList;

    private int roleid;

    private String shareurl;

    private int isshield = 0;

    public DynamicTextDataItem() {
    }

    public DynamicTextDataItem(JSONObject jo) throws JSONException {
        if (jo.has("id")) {
            id = jo.getString("id");
        }
        if (jo.has("schoolid")) {
            schoolid = jo.getString("schoolid");
        }
        if (jo.has("audittype")) {
            audittype = jo.getString("audittype");
        }
        if (jo.has("publishteacherid")) {
            publishteacherid = jo.getString("publishteacherid");
        }
        if (jo.has("createdate")) {
            createdate = jo.getString("createdate");
        }
        if (jo.has("textcontent")) {
            textcontent = jo.getString("textcontent");
        }
        if (jo.has("likecount")) {
            likecount = jo.getInt("likecount");
        }
        if (jo.has("publishroleid")) {
            publishroleid = jo.getString("publishroleid");
        }
        if (jo.has("commentcount")) {
            commentcount = jo.getInt("commentcount");
        }
        if (jo.has("avatarurl")) {
            avatarurl = jo.getString("avatarurl");
        }
        if (jo.has("publishname")) {
            publishname = jo.getString("publishname");
        }
        if (jo.has("roleid")) {
            roleid = jo.getInt("roleid");
        }
        if (jo.has("isshield")) {
            isshield = jo.getInt("isshield");
        }
        if (jo.has("shareurl")) {
            setShareurl(jo.getString("shareurl"));
        }
    }

    public void initStatic(String localId) {
        id = localId;
        schoolid = DataInitConfig.getInstance().getSchoolID();
        publishteacherid = DataInitConfig.getInstance().getUserId();
        publishname = DataInitConfig.getInstance().getNameForRelationship();
        createdate = DateUtil.getCurrentTime("yyyy-MM-dd HH:mm:ss");
        if(DataInitConfig.getInstance().isDirector()){
            roleid = 1;
        }else {
            roleid = DataInitConfig.getInstance().isParentLogin() ? 3 : 2;
        }
        publishroleid = DataInitConfig.getInstance().isParentLogin() ? "10" : "11";
        likecount = 0;
        commentcount = 0;
        shareurl = "";
        avatarurl = DataInitConfig.getInstance().getAvatar();
        likeList = "";
        isLike = false;
//        if (jo.has("audittype")) {
//            audittype = jo.getString("audittype");
//        }
//        if (jo.has("publishteacherid")) {
//            publishteacherid = jo.getString("publishteacherid");
//        }
//        if (jo.has("createdate")) {
//            createdate = jo.getString("createdate");
//        }
//        if (jo.has("textcontent")) {
//            textcontent = jo.getString("textcontent");
//        }
//        if (jo.has("likecount")) {
//            likecount = jo.getInt("likecount");
//        }
//        if (jo.has("publishroleid")) {
//            publishroleid = jo.getString("publishroleid");
//        }
//        if (jo.has("commentcount")) {
//            commentcount = jo.getInt("commentcount");
//        }
//        if (jo.has("avatarurl")) {
//            avatarurl = jo.getString("avatarurl");
//        }
//        if (jo.has("publishname")) {
//            publishname = jo.getString("publishname");
//        }
//        if (jo.has("roleid")) {
//            roleid = jo.getInt("roleid");
//        }
//        if (jo.has("isshield")) {
//            isshield = jo.getInt("isshield");
//        }
//        if (jo.has("shareurl")) {
//            setShareurl(jo.getString("shareurl"));
//        }
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getLikeList() {
        return likeList;
    }

    public void setLikeList(String likeList) {
        this.likeList = likeList;
    }

    public boolean isLike() {
        return isLike;
    }

    public void setLike(boolean isLike) {
        this.isLike = isLike;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(String schoolid) {
        this.schoolid = schoolid;
    }

    public String getAudittype() {
        return audittype;
    }

    public void setAudittype(String audittype) {
        this.audittype = audittype;
    }

    public String getPublishteacherid() {
        return publishteacherid;
    }

    public void setPublishteacherid(String publishteacherid) {
        this.publishteacherid = publishteacherid;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getTextcontent() {
        return textcontent;
    }

    public void setTextcontent(String textcontent) {
        this.textcontent = textcontent;
    }

    public int getLikecount() {
        return likecount;
    }

    public void setLikecount(int likecount) {
        this.likecount = likecount;
    }

    public String getPublishroleid() {
        return publishroleid;
    }

    public void setPublishroleid(String publishroleid) {
        this.publishroleid = publishroleid;
    }

    public int getCommentcount() {
        return commentcount;
    }

    public void setCommentcount(int commentcount) {
        this.commentcount = commentcount;
    }

    public String getPublishname() {
        return publishname;
    }

    public void setPublishname(String publishname) {
        this.publishname = publishname;
    }

    public String getAvatarurl() {
        return avatarurl;
    }

    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl;
    }

    public String getShareurl() {
        return shareurl;
    }

    public void setShareurl(String shareurl) {
        this.shareurl = shareurl;
    }

    public int getIsshield() {
        return isshield;
    }

    public void setIsshield(int isshield) {
        this.isshield = isshield;

    }

    //--------------------------------------------------------------Parcel----------------------------------------------

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.schoolid);
        dest.writeString(this.audittype);
        dest.writeString(this.publishteacherid);
        dest.writeString(this.createdate);
        dest.writeString(this.textcontent);
        dest.writeInt(this.likecount);
        dest.writeString(this.publishroleid);
        dest.writeInt(this.commentcount);
        dest.writeString(this.avatarurl);
        dest.writeString(this.publishname);
        dest.writeByte(this.isLike ? (byte) 1 : (byte) 0);
        dest.writeString(this.likeList);
        dest.writeInt(this.roleid);
        dest.writeString(this.shareurl);
        dest.writeInt(this.isshield);
    }

    protected DynamicTextDataItem(Parcel in) {
        this.id = in.readString();
        this.schoolid = in.readString();
        this.audittype = in.readString();
        this.publishteacherid = in.readString();
        this.createdate = in.readString();
        this.textcontent = in.readString();
        this.likecount = in.readInt();
        this.publishroleid = in.readString();
        this.commentcount = in.readInt();
        this.avatarurl = in.readString();
        this.publishname = in.readString();
        this.isLike = in.readByte() != 0;
        this.likeList = in.readString();
        this.roleid = in.readInt();
        this.shareurl = in.readString();
        this.isshield = in.readInt();
    }

    public static final Creator<DynamicTextDataItem> CREATOR = new Creator<DynamicTextDataItem>() {
        @Override
        public DynamicTextDataItem createFromParcel(Parcel source) {
            return new DynamicTextDataItem(source);
        }

        @Override
        public DynamicTextDataItem[] newArray(int size) {
            return new DynamicTextDataItem[size];
        }
    };
}
