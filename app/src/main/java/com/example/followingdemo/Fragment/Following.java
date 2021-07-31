package com.example.followingdemo.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.followingdemo.DataBean;
import com.example.followingdemo.ItemAdapter;
import com.example.followingdemo.R;

import java.util.ArrayList;
import java.util.List;

public class Following extends Fragment {
    List<DataBean> dataBeans = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.following, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        RecyclerView recyclerView = getView().findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        ItemAdapter itemAdapter = new ItemAdapter(dataBeans);
        recyclerView.setAdapter(itemAdapter);

        initData();
    }

    private void initData() {
        for (int i=0;i<5;i++){
            DataBean dataBean = new DataBean(0,R.drawable.img1,"橙子味冰块","正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文正文"
                    ,R.drawable.a,"星星","描述商品描述描述",
                    "￥231",R.drawable.star,R.drawable.img,"宇航小屋","1212","3221");
            dataBeans.add(dataBean);
        }
    }
}
