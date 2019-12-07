package com.dell.crafto.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBase {
    public static Retrofit retrofit =null;

    public static Retrofit getData(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://ec2-18-189-203-171.us-east-2.compute.amazonaws.com:8080/Crafto/productsAPI/")
                    .addConverterFactory(GsonConverterFactory.create() )
                    .build();
        }
        return retrofit;
    }
}
