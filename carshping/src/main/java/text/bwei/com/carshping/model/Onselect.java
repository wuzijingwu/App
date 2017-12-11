package text.bwei.com.carshping.model;

import java.util.List;

import text.bwei.com.carshping.bean.GetCars;

/**
 * Created by dell on 2017/12/11.
 */

public interface Onselect {
    void dataSuccess(List<GetCars.DataBean.ListBean> list);

}
