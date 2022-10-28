package com.example.appgk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class FragmentTrangChu extends Fragment {
        private ListView listView;
        private ThucAn_Adapter adapter;
        private ArrayList<ThucAn> thucanList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragment_trang_chu,container,false);
        listView=  view.findViewById(R.id.listview_thucan);
        thucanList = new ArrayList<>();
        thucanList.add(new ThucAn("Tên thuc an: Mi quang",R.drawable.miquang,"Mô tả: Đặc sản Quảng Nam"));
        thucanList.add(new ThucAn("Tên thuc an: chao",R.drawable.chao,"Mô tả: Cháo Chí Phèo"));
        thucanList.add(new ThucAn("Tên thuc an: hu tieu",R.drawable.hutieu,"Mô tả: Ngon Bổ Rẻ"));
        thucanList.add(new ThucAn("Tên thuc an: banh mi",R.drawable.banhmi,"Mô tả: Rat ngon tuyet"));
        thucanList.add(new ThucAn("Tên thuc an: pho bo",R.drawable.phobo,"Mô tả: Chan com them pho"));
        adapter = new ThucAn_Adapter(getContext(),R.layout.custom_itemthucan,thucanList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(),MoTa.class);
                intent.putExtra("key1",thucanList.get(i).getImg());
                intent.putExtra("key2",thucanList.get(i).getTenThucAn());
                intent.putExtra("key3",thucanList.get(i).getMoTa());
                startActivity(intent);
            }
        });

        return view;
    }
}