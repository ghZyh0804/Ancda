package com.ancda.parents.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 作者： huangbiao
 * 时间： 2016-12-27
 */
public class CoreStickerParm implements Parcelable {
    public float left;
    public float top;
    public float scale;
    public float startTime;
    public float endTime;
    public String gifPath;
    //GIF图片长度
    public  int gifDuration;


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeFloat(this.left);
        dest.writeFloat(this.top);
        dest.writeFloat(this.scale);
        dest.writeFloat(this.startTime);
        dest.writeFloat(this.endTime);
        dest.writeString(this.gifPath);
        dest.writeInt(this.gifDuration);
    }

    public CoreStickerParm() {
    }

    protected CoreStickerParm(Parcel in) {
        this.left = in.readFloat();
        this.top = in.readFloat();
        this.scale = in.readFloat();
        this.startTime = in.readFloat();
        this.endTime = in.readFloat();
        this.gifPath = in.readString();
        this.gifDuration = in.readInt();
    }

    public static final Creator<CoreStickerParm> CREATOR = new Creator<CoreStickerParm>() {
        @Override
        public CoreStickerParm createFromParcel(Parcel source) {
            return new CoreStickerParm(source);
        }

        @Override
        public CoreStickerParm[] newArray(int size) {
            return new CoreStickerParm[size];
        }
    };
}
