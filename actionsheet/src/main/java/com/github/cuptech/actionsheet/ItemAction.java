package com.github.cuptech.actionsheet;

import android.os.Parcel;
import android.os.Parcelable;

public class ItemAction implements Parcelable {
    private int id;
    private String name;
    private boolean isWarning = false;

    public ItemAction(int id, String name){
        this.id = id;
        this.name = name;
    }

    public ItemAction(int id, String name, boolean isWarning){
        this.id = id;
        this.name = name;
        this.isWarning = isWarning;
    }

    private ItemAction(Parcel in) {
        id = in.readInt();
        name = in.readString();
        isWarning = in.readByte() != 0;
    }

    public static final Creator<ItemAction> CREATOR = new Creator<ItemAction>() {
        @Override
        public ItemAction createFromParcel(Parcel in) {
            return new ItemAction(in);
        }

        @Override
        public ItemAction[] newArray(int size) {
            return new ItemAction[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWarning() {
        return isWarning;
    }

    public void setWarning(boolean warning) {
        isWarning = warning;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeByte((byte) (isWarning ? 1 : 0));
    }
}
