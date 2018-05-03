package com.ancda.parents.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author huangbiao
 * @date 2015年8月10日
 */
public class VideoModel implements Parcelable {
    private String id;
    private String actionid;
    private String videourl;
    private String thumburl;
    private String createdate;
    private String sharevideourl;
    private String duration;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getActionid() {
        return actionid;
    }

    public void setActionid(String actionid) {
        this.actionid = actionid;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }

    public String getThumburl() {
        return thumburl;
    }

    public void setThumburl(String thumburl) {
        this.thumburl = thumburl;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getSharevideourl() {
        return sharevideourl;
    }

    public void setSharevideourl(String sharevideourl) {
        this.sharevideourl = sharevideourl;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.actionid);
        dest.writeString(this.videourl);
        dest.writeString(this.thumburl);
        dest.writeString(this.createdate);
        dest.writeString(this.sharevideourl);
        dest.writeString(this.duration);
    }

    protected VideoModel(Parcel in) {
        this.id = in.readString();
        this.actionid = in.readString();
        this.videourl = in.readString();
        this.thumburl = in.readString();
        this.createdate = in.readString();
        this.sharevideourl = in.readString();
        this.duration = in.readString();
    }

    public static final Creator<VideoModel> CREATOR = new Creator<VideoModel>() {
        @Override
        public VideoModel createFromParcel(Parcel source) {
            return new VideoModel(source);
        }

        @Override
        public VideoModel[] newArray(int size) {
            return new VideoModel[size];
        }
    };
}
