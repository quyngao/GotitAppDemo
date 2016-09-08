
package com.example.mypc.gotitappdemo.model;

import com.google.gson.annotations.SerializedName;

public class Author {

    @SerializedName("uid")
    private String uid;
    @SerializedName("name")
    private String name;
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
