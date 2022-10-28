package com.example.appgk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ThucAn_Adapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<ThucAn> thucanList;

    public ThucAn_Adapter(Context context, int layout, List<ThucAn> thucanList) {
        this.context = context;
        this.layout = layout;
        this.thucanList = thucanList;
    }

    @Override
    public int getCount() {
        return thucanList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);
        // anh xa
        TextView txt_tenThucAn= view.findViewById(R.id.txtTenThucAn);
        ImageView img = view.findViewById(R.id.imgHinh);

        ThucAn thucAn =  thucanList.get(i);
        img.setImageResource(thucAn.getImg());
        txt_tenThucAn.setText(thucAn.getTenThucAn());

        return view;
    }
}
