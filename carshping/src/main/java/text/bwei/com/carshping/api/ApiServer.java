package text.bwei.com.carshping.api;

import retrofit2.http.GET;
import rx.Observable;
import text.bwei.com.carshping.bean.GetCars;

/**
 * Created by dell on 2017/12/11.
 */

public interface ApiServer {
//    @POST
//    Observable<GetCars> getdates(@Url String url, @QueryMap Map<String,String> map);

    @GET("getCarts?uid=1262&source=android")
    Observable<GetCars> getdates();

}
