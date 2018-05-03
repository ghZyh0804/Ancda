package com.ancda.parents.model;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONException;
import org.json.JSONObject;

public class DynamicImageDataItem implements Parcelable {

    private String id;

    private String actionid;

    /** 原图地址 */
    private String bigimageurl;

    /** 200*200缩略图地址 */
    private String imageurl;

    private String createdate;

    private String tag;

    private String videourl;

    public DynamicImageDataItem() {

    }

    public DynamicImageDataItem(JSONObject jo) throws JSONException {
        if (jo.has("id")) {
            id = jo.getString("id");
        }
        if (jo.has("actionid")) {
            actionid = jo.getString("actionid");
        }
        if (jo.has("imageurl")) {
            imageurl = jo.getString("imageurl");
        }
        if (jo.has("createdate")) {
            createdate = jo.getString("createdate");
        }
        if (jo.has("bigimageurl")) {
            bigimageurl = jo.getString("bigimageurl");
        }
        if (jo.has("tag")) {
            tag = jo.getString("tag");
        }
    }

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

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.actionid);
        dest.writeString(this.bigimageurl);
        dest.writeString(this.imageurl);
        dest.writeString(this.createdate);
        dest.writeString(this.tag);
        dest.writeString(this.videourl);
    }

    protected DynamicImageDataItem(Parcel in) {
        this.id = in.readString();
        this.actionid = in.readString();
        this.bigimageurl = in.readString();
        this.imageurl = in.readString();
        this.createdate = in.readString();
        this.tag = in.readString();
        this.videourl = in.readString();
    }

    public static final Creator<DynamicImageDataItem> CREATOR = new Creator<DynamicImageDataItem>() {
        @Override
        public DynamicImageDataItem createFromParcel(Parcel source) {
            return new DynamicImageDataItem(source);
        }

        @Override
        public DynamicImageDataItem[] newArray(int size) {
            return new DynamicImageDataItem[size];
        }
    };
}
