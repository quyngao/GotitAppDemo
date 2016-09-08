package com.example.mypc.gotitappdemo.retrofit;

import com.example.mypc.gotitappdemo.app.MyApplication;
import com.example.mypc.gotitappdemo.model.APIError;
import com.example.mypc.gotitappdemo.util.ErrorUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Quylt on 9/8/2016.
 */
public abstract class RestCallBack<T> implements Callback<T> {
    public abstract void failure(APIError restError);

    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        if (response.isSuccessful()) {

        } else {
            APIError error = ErrorUtils.parseError(response, MyApplication.getInstance());
            failure(error);
        }
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {

    }
}
