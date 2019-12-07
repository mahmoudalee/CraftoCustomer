package com.dell.crafto.network;


import com.dell.crafto.model.ProductData;

import retrofit2.Call;
import retrofit2.http.GET;


public interface EndPoint {

    @GET("154")
    Call<ProductData> Data();
}
