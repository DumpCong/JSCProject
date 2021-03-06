package com.jinshangcheng.net;


import com.jinshangcheng.config.ConstParams;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by xu on 2016/11/16.
 */
public class RetrofitService {

    private static final String HOST = "http://ewowang.polyhome.net";

    private static final String BASE_URL = HOST + "/ewo/app/";

    private static NetApi netApi;
    private static GsonConverterFactory gsonConverterFactory = GsonConverterFactory.create();
    private static CallAdapter.Factory rxJavaCallAdapterFactory = RxJava2CallAdapterFactory.create();
    private static OkHttpClient client = new OkHttpClient.Builder()
            .addInterceptor(new HttpLoggingInterceptor()//
                    .setLevel(HttpLoggingInterceptor.Level.BASIC))//
            .addNetworkInterceptor(new LogInterceptor())//
            .writeTimeout(ConstParams.WRITE_TIMEOUT, TimeUnit.SECONDS)
            .connectTimeout(ConstParams.CONNNCET_TIMEOUT, TimeUnit.SECONDS)
            .readTimeout(ConstParams.READ_TIMEOUT, TimeUnit.SECONDS)
            .build();


    public static NetApi getRetrofit() {
        if (netApi == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)//
                    .addConverterFactory(gsonConverterFactory)//
                    .client(client)//
                    .addCallAdapterFactory(rxJavaCallAdapterFactory)//
                    .build();
            netApi = retrofit.create(NetApi.class);
        }
        return netApi;
    }
}