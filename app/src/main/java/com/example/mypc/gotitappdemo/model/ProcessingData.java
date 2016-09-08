
package com.example.mypc.gotitappdemo.model;

import com.google.gson.annotations.SerializedName;

public class ProcessingData {
    @SerializedName("uid")
    private String uid;
    @SerializedName("name")
    private String name;
    @SerializedName("orig_name")
    private String origName;
    @SerializedName("avatar")
    private String avatar;

    /**
     * @return The uid
     */
    public String getUid() {
        return uid;
    }

    /**
     * @param uid The uid
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The origName
     */
    public String getOrigName() {
        return origName;
    }

    /**
     * @param origName The orig_name
     */
    public void setOrigName(String origName) {
        this.origName = origName;
    }

    /**
     * @return The avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @param avatar The avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

}
