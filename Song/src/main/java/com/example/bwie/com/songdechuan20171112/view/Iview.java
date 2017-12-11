package com.example.bwie.com.songdechuan20171112.view;

import com.example.bwie.com.songdechuan20171112.bean.MessageBean;

/**
 * Created by SDC on 2017/12/11.
 */
public interface Iview {
    void onSuccess(Object o);
    void onFailed(Exception e);

    void delSuccess(MessageBean listMessageBean);
}
