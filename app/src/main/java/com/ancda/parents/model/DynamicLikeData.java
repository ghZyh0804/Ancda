package com.ancda.parents.model;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONException;
import org.json.JSONObject;

public class DynamicLikeData implements Parcelable {
    public String actionid;
    
    public String usertype;
    
    public String name;
    
    public String userid;
    public DynamicLikeData() {
    }
    public DynamicLikeData(JSONObject jo) throws JSONException {
        if(jo.has("actionid")){
            actionid = jo.getString("actionid");
        }
        if(jo.has("usertype")){
            usertype = jo.getString("usertype");
        }
        if(jo.has("name")){
            name = jo.getString("name");
        }
        if(jo.has("userid")){
            userid = jo.getString("userid");
        }
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.actionid);
        dest.writeString(this.usertype);
        dest.writeString(this.name);
        dest.writeString(this.userid);
    }

    protected DynamicLikeData(Parcel in) {
        this.actionid = in.readString();
        this.usertype = in.readString();
        this.name = in.readString();
        this.userid = in.readString();
    }

    public static final Creator<DynamicLikeData> CREATOR = new Creator<DynamicLikeData>() {
        @Override
        public DynamicLikeData createFromParcel(Parcel source) {
            return new DynamicLikeData(source);
        }

        @Override
        public DynamicLikeData[] newArray(int size) {
            return new DynamicLikeData[size];
        }
    };
}
