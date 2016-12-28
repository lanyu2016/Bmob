package com.bmob.im.demo.ui;

import android.os.Bundle;
import android.widget.ListView;

import com.bmob.im.demo.adapter.InfoAdapter;
import com.eson.cn.R;

/**
 * 资讯新闻
 * Created by Eson on 2016/12/11.
 */
public class NewsActivity  extends ActivityBase{
    private ListView lv_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_info);
        initView();
        initData();
    }


    private void initView() {
        initTopBarForLeft("新闻资讯中心");
        lv_info= (ListView) findViewById(R.id.lv_info);

    }

    private void initData() {


        InfoAdapter infoAdapter=new InfoAdapter(this);
        lv_info.setAdapter(infoAdapter);
    }
}
