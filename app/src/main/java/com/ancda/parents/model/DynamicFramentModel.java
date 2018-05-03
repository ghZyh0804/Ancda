package com.ancda.parents.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.ancda.parents.R;
import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.ArrayList;

import cn.droidlover.xdroidmvp.net.IModel;

/**
 * 作者：DELL-002 on 2018/5/2 17:29
 */
public class DynamicFramentModel implements MultiItemEntity, Parcelable,IModel {

    @Override
    public int getItemType() {
        return 0;
    }

    public int publishStatus = -1; //-1：默认值（非本地动态） ；0：等待用户触发发布；1：发布中；
    public long staticId = 0;  //还在发布队列的本地动态id，仅用于显示静默动态（在publishStatus >= 0时有效）
    public int progress;  //发布的上传进度
    public ArrayList<CoreStickerParm> coreStickerParms;

    /**
     * 动态信息
     */
    public DynamicTextDataItem textdata;

    /**
     * 动态图片信息
     */
    public ArrayList<DynamicImageDataItem> imagesdata;

    /**
     * 评论列表
     */
    public ArrayList<DynamicCommentData> comments;

    /**
     * 已点赞列表
     */
    public ArrayList<DynamicLikeData> likes;

    public VideoModel video = null;

    public int currentLoadCommentCound = 10;

    public boolean isMoreComment = true;

    public boolean isDelete = false;

    public int roleidDrawableId = R.drawable.user_vip_type;


    public void initRoleidId() {
        switch (textdata.getRoleid()) {
            case 1: // 园丁
                roleidDrawableId = R.drawable.user_director_type;
                break;
            case 2: // 教师
                roleidDrawableId = R.drawable.user_teacher_type;
                break;
            case 3: // 家长
                roleidDrawableId = R.drawable.user_parent_type;
                break;
            case 4: // 家长vip
                roleidDrawableId = R.drawable.user_vip_type;
                break;
            default:
                break;
        }
    }


    @Override
    public boolean equals(Object st) {
        DynamicFramentModel temp = (DynamicFramentModel) st;
        if (textdata.getId().equals(temp.textdata.getId()))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return textdata.getId().hashCode();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.publishStatus);
        dest.writeLong(this.staticId);
        dest.writeInt(this.progress);
        dest.writeTypedList(this.coreStickerParms);
        dest.writeParcelable(this.textdata, flags);
        dest.writeTypedList(this.imagesdata);
        dest.writeTypedList(this.comments);
        dest.writeTypedList(this.likes);
        dest.writeParcelable(this.video, flags);
        dest.writeInt(this.currentLoadCommentCound);
        dest.writeByte(this.isMoreComment ? (byte) 1 : (byte) 0);
        dest.writeByte(this.isDelete ? (byte) 1 : (byte) 0);
        dest.writeInt(this.roleidDrawableId);
    }

    public DynamicFramentModel() {
    }

    protected DynamicFramentModel(Parcel in) {
        this.publishStatus = in.readInt();
        this.staticId = in.readLong();
        this.progress = in.readInt();
        this.coreStickerParms = in.createTypedArrayList(CoreStickerParm.CREATOR);
        this.textdata = in.readParcelable(DynamicTextDataItem.class.getClassLoader());
        this.imagesdata = in.createTypedArrayList(DynamicImageDataItem.CREATOR);
        this.comments = in.createTypedArrayList(DynamicCommentData.CREATOR);
        this.likes = in.createTypedArrayList(DynamicLikeData.CREATOR);
        this.video = in.readParcelable(VideoModel.class.getClassLoader());
        this.currentLoadCommentCound = in.readInt();
        this.isMoreComment = in.readByte() != 0;
        this.isDelete = in.readByte() != 0;
        this.roleidDrawableId = in.readInt();
    }

    public static final Creator<DynamicFramentModel> CREATOR = new Creator<DynamicFramentModel>() {
        @Override
        public DynamicFramentModel createFromParcel(Parcel source) {
            return new DynamicFramentModel(source);
        }

        @Override
        public DynamicFramentModel[] newArray(int size) {
            return new DynamicFramentModel[size];
        }
    };



    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public boolean isAuthError() {
        return false;
    }

    @Override
    public boolean isBizError() {
        return false;
    }

    @Override
    public String getErrorMsg() {
        return null;
    }
}
