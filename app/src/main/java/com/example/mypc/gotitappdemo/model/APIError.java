package com.example.mypc.gotitappdemo.model;

/**
 * Created by Quylt on 9/8/2016.
 */
public class APIError {
    private int statusCode;
    private String message;

    public APIError() {
    }

    public int status() {
        return statusCode;
    }

    public String message() {
        return message;
    }
}
