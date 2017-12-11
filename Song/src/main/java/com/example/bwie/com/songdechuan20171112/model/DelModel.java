package com.example.bwie.com.songdechuan20171112.model;

import com.example.bwie.com.songdechuan20171112.presenter.DelPresenter;
import com.example.bwie.com.songdechuan20171112.bean.MessageBean;
import com.example.bwie.com.songdechuan20171112.utils.RetrofitUtils;

import io.reactivex.Flowable;

/**
 * Created by SDC on 2017/12/11.
 */

public class DelModel implements IModel {
    private DelPresenter presenter;

    public DelModel(DelPresenter presenter){
        this.presenter =  presenter;

    }
    @Override
    public void getData(String uid,String pid) {

        Flowable<MessageBean> delFlowable = RetrofitUtils.getInstance().getApiService().deleteData(uid,pid);
        presenter.delData(delFlowable);
    }
}