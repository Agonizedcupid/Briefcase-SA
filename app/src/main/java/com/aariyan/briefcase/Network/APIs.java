package com.aariyan.briefcase.Network;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIs {

    @GET("GetOrders.php?")
    Call<ResponseBody> getOrderList(@Query("customercode") String customerCode,@Query("dateFrom") String dateFrom, @Query("dateTo") String dateTo);


    @GET("GetOrderLines.php?")
    Call<ResponseBody> getItemList(@Query("orderline") String orderId);

    @GET("GetSalesvstargets.php?")
    Call<ResponseBody> getSales(@Query("RepCode") String code);

}
