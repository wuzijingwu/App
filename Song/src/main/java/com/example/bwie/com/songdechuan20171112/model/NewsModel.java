package com.example.bwie.com.songdechuan20171112.model;

import com.example.bwie.com.songdechuan20171112.DatasBean;
import com.example.bwie.com.songdechuan20171112.bean.MessageBean;
import com.example.bwie.com.songdechuan20171112.presenter.NewsPresenter;
import com.example.bwie.com.songdechuan20171112.utils.RetrofitUtils;

import java.util.List;

import io.reactivex.Flowable;

/**
 * Created by SDC on 2017/12/11.
 */

public class NewsModel implements IModel {
    private NewsPresenter presenter;

    public NewsModel(NewsPresenter presenter){
        this.presenter = (NewsPresenter) presenter;

    }
    @Override
    public void getData(String uid,String pid) {
        Flowable<MessageBean<List<DatasBean>>> flowable = RetrofitUtils.getInstance().getApiService().getDatas(uid);
        presenter.getNews(flowable);

    }
}