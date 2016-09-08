package com.example.mypc.gotitappdemo.util;

import android.content.Context;

import com.example.mypc.gotitappdemo.model.APIError;
import com.example.mypc.gotitappdemo.retrofit.ApiClient;

import java.io.IOException;
import java.lang.annotation.Annotation;

import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Response;

/**
 * Created by Quylt on 9/8/2016.
 */
public class ErrorUtils {
    public static APIError parseError(Response<?> response, Context c) {
        Converter<ResponseBody, APIError> converter =
                ApiClient.getClient(c)
                        .responseBodyConverter(APIError.class, new Annotation[0]);

        APIError error;

        try {
            error = converter.convert(response.errorBody());
        } catch (IOException e) {
            return new APIError();
        }

        return error;
    }
}
