package com.example.wu.wlive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> mList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i = 0; i < 10; i++) {
            mList.add("");
        }
        RecyclerView recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        BaseQuickAdapter adapter = new BaseQuickAdapter<String, BaseViewHolder>(R.layout.item_layout, mList) {

            @Override
            protected void convert(BaseViewHolder helper, String item) {
                helper.setText(R.id.tv_item_postion, "条目位置" + helper.getAdapterPosition());
            }
        };
        recyclerview.setAdapter(adapter);
    }
}
