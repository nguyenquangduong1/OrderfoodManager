package com.example.androideatltserver.Common;

import android.location.Location;
import android.text.format.DateFormat;

import com.example.androideatltserver.Model.Request;
import com.example.androideatltserver.Model.User;
import com.example.androideatltserver.Remote.APIService;
import com.example.androideatltserver.Remote.RetrofitClient;

import java.util.Calendar;
import java.util.Locale;

import retrofit2.Retrofit;

public class Common {
    public static User currentUser;
    public static Request currentRequest;
    public  static final String UPDATE = "Chỉnh Sữa";
    public  static final String DELETE = "Xóa";
    public  static final int PICK_IMAGE_REQUEST = 71;

    public static String convertCodeToStatus(String code)
    {
        if (code.equals("0"))
            return "Đặt Hàng";
        else if (code.equals("1"))
            return "Đang Trên Đường";
        else
            return "Đã nhận";
    }

    public static final String fcmUrl = "https://fcm.googleapis.com/";

    public static APIService getFCMClient(){
        return RetrofitClient.getClient(fcmUrl).create(APIService.class);
    }

    public static String PHONE_TEXT ="userPhone";

    public static String getDate(long time)
    {
        Calendar calendar = Calendar.getInstance(Locale.ENGLISH);
        calendar.setTimeInMillis(time);
        StringBuilder date = new StringBuilder(DateFormat.format("dd-MM-yyyy HH:mm"
                ,calendar).toString());
        return date.toString();
    }
}
