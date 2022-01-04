package com.aariyan.briefcase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.aariyan.briefcase.Network.APIs;
import com.aariyan.briefcase.Network.ApiClient;
import com.google.gson.JsonArray;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Sales extends AppCompatActivity {

    private String code;

    public TextView strSalesName;
    public TextView februaryTarget;
    public TextView febraurySales;
    public TextView febrauaryPercentage;
    public TextView januaryTarget;
    public TextView januarySales;
    public TextView januaryPercentage;
    public TextView decemberTarget;
    public TextView decemberSales;
    public TextView decemberPercentage;
    public TextView novemberTarget;
    public TextView novemberSales;
    public TextView novemberPercentage;
    public TextView octoberTarget;
    public TextView octoberSales;
    public TextView octoberPercentage;
    public TextView septemberTarget;
    public TextView septemberSales;
    public TextView septemberPercentage;
    public TextView augustTarget;
    public TextView augustSales;
    public TextView augustPercentage;
    public TextView julyTarget;
    public TextView julySales;
    public TextView julyPercentage;
    public TextView juneTarget;
    public TextView juneSales;
    public TextView junePercentage;
    public TextView mayTarget;
    public TextView maySales;
    public TextView mayPercentage;
    public TextView aprilTarget;
    public TextView aprilSales;
    public TextView aprilPercentage;
    public TextView marchTarget;
    public TextView marchSales;
    public TextView marchPercentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales);
        if (getIntent() != null) {
            code = getIntent().getStringExtra("code");
            loadSales(code);
        }
    }

    private void loadSales(String code) {
        APIs apiService = ApiClient.getClient().create(APIs.class);
        Call<ResponseBody> call = apiService.getSales(code);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {

                    JSONArray finalResponse = new JSONArray(response.body().string());
                    for (int i=0; i<finalResponse.length(); i++) {
                        JSONObject singleObject = finalResponse.getJSONObject(i);
                        String strSalesName = singleObject.getString("strSalesName");
                        String FebruaryTarget = singleObject.getString("FebruaryTarget");
                        String FebraurySales = singleObject.getString("FebraurySales");
                        String FebrauaryPercentage = singleObject.getString("FebrauaryPercentage");
                        String JanuaryTarget = singleObject.getString("JanuaryTarget");
                        String JanuarySales = singleObject.getString("JanuarySales");
                        String JanuaryPercentage = singleObject.getString("JanuaryPercentage");
                        String DecemberTarget = singleObject.getString("DecemberTarget");
                        String DecemberSales = singleObject.getString("DecemberSales");
                        String DecemberPercentage = singleObject.getString("DecemberPercentage");
                        String NovemberTarget = singleObject.getString("NovemberTarget");
                        String NovemberSales = singleObject.getString("NovemberSales");
                        String NovemberPercentage = singleObject.getString("NovemberPercentage");
                        String OctoberTarget = singleObject.getString("OctoberTarget");
                        String OctoberSales = singleObject.getString("OctoberSales");
                        String OctoberPercentage = singleObject.getString("OctoberPercentage");
                        String SeptemberTarget = singleObject.getString("SeptemberTarget");
                        String SeptemberSales = singleObject.getString("SeptemberSales");
                        String SeptemberPercentage = singleObject.getString("SeptemberPercentage");
                        String AugustTarget = singleObject.getString("AugustTarget");
                        String AugustSales = singleObject.getString("AugustSales");
                        String AugustPercentage = singleObject.getString("AugustPercentage");
                        String JulyTarget = singleObject.getString("JulyTarget");
                        String JulySales = singleObject.getString("JulySales");
                        String JulyPercentage = singleObject.getString("JulyPercentage");
                        String JuneTarget = singleObject.getString("JuneTarget");
                        String JuneSales = singleObject.getString("JuneSales");
                        String JunePercentage = singleObject.getString("JunePercentage");
                        String MayTarget = singleObject.getString("MayTarget");
                        String MaySales = singleObject.getString("MaySales");
                        String MayPercentage = singleObject.getString("MayPercentage");
                        String AprilTarget = singleObject.getString("AprilTarget");
                        String AprilSales = singleObject.getString("AprilSales");
                        String AprilPercentage = singleObject.getString("AprilPercentage");
                        String MarchTarget = singleObject.getString("MarchTarget");
                        String MarchSales = singleObject.getString("MarchSales");
                        String MarchPercentage = singleObject.getString("MarchPercentage");
                    }


                } catch (Exception e) {
                    e.getMessage();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Toast.makeText(Sales.this, "" + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}