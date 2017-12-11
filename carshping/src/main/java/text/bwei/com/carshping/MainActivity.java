package text.bwei.com.carshping;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import text.bwei.com.carshping.apapter.MyAdapter;
import text.bwei.com.carshping.api.Api;
import text.bwei.com.carshping.bean.GetCars;
import text.bwei.com.carshping.presenter.presenter;
import text.bwei.com.carshping.view.Iview;

public class MainActivity extends AppCompatActivity implements Iview {

    private RecyclerView recyclerView;
    private text.bwei.com.carshping.presenter.presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        presenter = new presenter(MainActivity.this);
        presenter.getOK(Api.URL);

    }



    @Override
    public void showgetCars(List<GetCars.DataBean.ListBean> list) {

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(list, this));
    }
}
