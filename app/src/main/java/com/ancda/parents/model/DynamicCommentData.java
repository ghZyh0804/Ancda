package com.ancda.parents.model;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONException;
import org.json.JSONObject;

public class DynamicCommentData implements Parcelable {
    public String id;

    public String parentcommentid;

    public String parentcommentname;

    public String userid;

    public String usertype;

    public String actionid;

    public String content;

    public String createdate;

    /** 评论人的姓名 */
    public String name;

    /** 后台删除人物后，用此字段显示评论 */
    public String username;
    // enabled 是否禁止显示 0-是 1-否
    public String enabled = "";

    public DynamicCommentData() {
    }

    public DynamicCommentData(JSONObject jo) throws JSONException {
        if (jo.has("id")) {
            id = jo.getString("id");
        }
        if (jo.has("parentcommentid")) {
            parentcommentid = jo.getString("parentcommentid");
        }
        if (jo.has("userid")) {
            userid = jo.getString("userid");
        }
        if (jo.has("username")) {
            username = jo.getString("username");
        }
        if (jo.has("usertype")) {
            usertype = jo.getString("usertype");
        }
        if (jo.has("actionid")) {
            actionid = jo.getString("actionid");
        }
        if (jo.has("content")) {
            content = jo.getString("content");
        }
        if (jo.has("createdate")) {
            createdate = jo.getString("createdate");
        }
        if (jo.has("name")) {
            name = jo.getString("name");
        }
        if (jo.has("parentcommentname") && !jo.isNull("parentcommentname")) {
            parentcommentname = jo.getString("parentcommentname");
        }
        if (jo.has("enabled")) {
            enabled = jo.getString("enabled");
        }
    }

    public String getParentcommentname() {
        return parentcommentname;
    }

    public void setParentcommentname(String parentcommentname) {
        this.parentcommentname = parentcommentname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentcommentid() {
        return parentcommentid;
    }

    public void setParentcommentid(String parentcommentid) {
        this.parentcommentid = parentcommentid;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object obj) {
        DynamicCommentData mdata = (DynamicCommentData) obj;
        return id.equals(mdata.id);
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.parentcommentid);
        dest.writeString(this.parentcommentname);
        dest.writeString(this.userid);
        dest.writeString(this.usertype);
        dest.writeString(this.actionid);
        dest.writeString(this.content);
        dest.writeString(this.createdate);
        dest.writeString(this.name);
        dest.writeString(this.username);
        dest.writeString(this.enabled);
    }

    protected DynamicCommentData(Parcel in) {
        this.id = in.readString();
        this.parentcommentid = in.readString();
        this.parentcommentname = in.readString();
        this.userid = in.readString();
        this.usertype = in.readString();
        this.actionid = in.readString();
        this.content = in.readString();
        this.createdate = in.readString();
        this.name = in.readString();
        this.username = in.readString();
        this.enabled = in.readString();
    }

    public static final Creator<DynamicCommentData> CREATOR = new Creator<DynamicCommentData>() {
        @Override
        public DynamicCommentData createFromParcel(Parcel source) {
            return new DynamicCommentData(source);
        }

        @Override
        public DynamicCommentData[] newArray(int size) {
            return new DynamicCommentData[size];
        }
    };
}
