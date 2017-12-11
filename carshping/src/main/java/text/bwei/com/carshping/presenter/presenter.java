package text.bwei.com.carshping.presenter;

import java.util.List;

import text.bwei.com.carshping.bean.GetCars;
import text.bwei.com.carshping.model.Imodel;
import text.bwei.com.carshping.model.Onselect;
import text.bwei.com.carshping.model.model;
import text.bwei.com.carshping.view.Iview;

/**
 * Created by dell on 2017/12/11.
 */

public class presenter {
    Imodel imodel;
    Iview iview;

    public presenter(Iview iview) {
        this.iview = iview;
        imodel = new model();
    }

    public void getOK(String url) {
        imodel.RequestSuccess(url, new Onselect() {
            @Override
            public void dataSuccess(List<GetCars.DataBean.ListBean> list) {
                iview.showgetCars(list);

            }
        });


    }

}
