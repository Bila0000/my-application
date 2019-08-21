package com.salsabil.chatapp.Fragments;

import com.salsabil.chatapp.Notification.MyResponse;
import com.salsabil.chatapp.Notification.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers({
            "content-Type:application/json",
            "Authorization:Key=AAAAniM1M-I:APA91bEoHHRpoHTCHSLqeYhuJx3eJy7gctJem6ZMGmZg2KmAWUq_G8HeiedX_Fn9YjNB2OQRXdYL4d6d8UvGnwOrJHkCo6AeYGS4IK9FeZghxTqB2GoSHKQnKqC6s5-LanJJ2IHC0R4I"
    })
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
