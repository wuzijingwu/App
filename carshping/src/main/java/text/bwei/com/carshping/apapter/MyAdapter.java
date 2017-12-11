package text.bwei.com.carshping.apapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import text.bwei.com.carshping.R;
import text.bwei.com.carshping.bean.GetCars;

/**
 * Created by dell on 2017/12/11.
 */

public class MyAdapter extends RecyclerView.Adapter {
    List<GetCars.DataBean.ListBean> list;
    Context context;

    public MyAdapter(List<GetCars.DataBean.ListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MyViewHoloder(inflate);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHoloder myViewHoloder = (MyViewHoloder) holder;
        myViewHoloder.textView.setText(list.get(position).getSubhead());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHoloder extends RecyclerView.ViewHolder {


        private final TextView textView;

        public MyViewHoloder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text);
        }
    }


}
