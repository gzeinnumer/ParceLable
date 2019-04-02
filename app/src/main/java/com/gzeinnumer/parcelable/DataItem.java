package com.gzeinnumer.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

//todo 1
class DataItem implements Parcelable {
    private String image;
    private String name;

    public DataItem(String image, String name) {
        this.image = image;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    //todo 2
    protected DataItem(Parcel in) {
        image = in.readString();
        name = in.readString();
    }

    public static final Creator<DataItem> CREATOR = new Creator<DataItem>() {
        @Override
        public DataItem createFromParcel(Parcel in) {
            return new DataItem(in);
        }

        @Override
        public DataItem[] newArray(int size) {
            return new DataItem[size];
        }
    };


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(image);
        dest.writeString(name);
    }
}
