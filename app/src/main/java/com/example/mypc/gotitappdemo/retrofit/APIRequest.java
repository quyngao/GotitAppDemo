package com.example.mypc.gotitappdemo.retrofit;

import com.example.mypc.gotitappdemo.model.Account;
import com.example.mypc.gotitappdemo.model.Question;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by MyPC on 06/09/2016.
 */
public interface APIRequest {
    @FormUrlEncoded
    @POST("/accounts/auth")
    Call<Account> login(@Field("email") String email, @Field("password") String password);

    @DELETE("/accounts/auth")
    Call<ResponseBody> logout();

    @GET("/questions")
    Call<List<Question>> getQuestions();
}
