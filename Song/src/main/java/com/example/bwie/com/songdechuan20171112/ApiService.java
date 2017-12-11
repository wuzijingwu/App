package com.example.bwie.com.songdechuan20171112;

import com.example.bwie.com.songdechuan20171112.bean.MessageBean;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by SDC on 2017/12/11.
 */

public interface ApiService {
//    http://120.27.23.105/product/deleteCart?uid=72&pid=1
    @GET("product/getCarts")
    Flowable<MessageBean<List<DatasBean>>> getDatas(@Query("uid") String uid);
    @GET("product/deleteCart")
    Flowable<MessageBean> deleteData(@Query("uid") String uid,@Query("pid") String pid);
}
