package com.dell.craftoSeller.network;


import com.dell.craftoSeller.model.ProductData;

import retrofit2.Call;
import retrofit2.http.GET;


public interface EndPoint {

    @GET("154")
    Call<ProductData> Data();
}
