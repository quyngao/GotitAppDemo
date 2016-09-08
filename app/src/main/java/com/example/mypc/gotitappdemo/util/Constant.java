package com.example.mypc.gotitappdemo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by MyPC on 06/09/2016.
 */
public class Constant {
    public static String[] status = {"In Progress", "Explained"};
    static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String getTime(String stime) {
        Date date = new Date(Long.parseLong(stime));
        return df.format(date);

    }

}
