package com.example.androideatltserver.Remote;


import com.example.androideatltserver.Model.MyResponse;
import com.example.androideatltserver.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAHW7HFdw:APA91bFUl9JiB3a1e6MM9TaXDUsJKMHSrh_Fo8RY8sZueK3rXBRq9LzTlz2sIio_G6dHsdPio_BmyX4jMdOQ_6em5_M5J5yadiIi0TmL0YWG1LcoRbTq6ZKmc0HQy7ZaUKY4c2OscLXo"
            }
    )
    @POST("fcm/send")

    Call<MyResponse> sendNotification(@Body Sender body);
}
