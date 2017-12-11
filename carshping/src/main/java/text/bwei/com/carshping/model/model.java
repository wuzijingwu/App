package text.bwei.com.carshping.model;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import text.bwei.com.carshping.api.ApiServer;
import text.bwei.com.carshping.bean.GetCars;

/**
 * Created by dell on 2017/12/11.
 */

public class model implements Imodel {


    @Override
    public void RequestSuccess(String url, final Onselect onselect) {
//        product/getCarts?uid=1262&source=android
//        HashMap<String, String> map = new HashMap<>();
//        map.put("uid", uid + "");
//        map.put("source", "android");
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        ApiServer apiServer = retrofit.create(ApiServer.class);
//        "product/getCarts", map
        Observable<GetCars> getdates = apiServer.getdates();
        getdates.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<GetCars>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(GetCars getCars) {
                        List<GetCars.DataBean.ListBean> list = getCars.getData().get(0).getList();
                        onselect.dataSuccess(list);


                    }
                });


    }
}
