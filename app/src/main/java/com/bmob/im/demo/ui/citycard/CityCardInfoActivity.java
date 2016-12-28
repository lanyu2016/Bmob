package com.bmob.im.demo.ui.citycard;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.bmob.im.demo.adapter.CityCardInfoAdapter;
import com.bmob.im.demo.ui.BaseActivity;
import com.bmob.im.demo.view.HeaderLayout;
import com.eson.cn.R;

/**
 * 一卡通丢失信息Activity
 * Created by Eson on 2016/12/13.
 */
public class CityCardInfoActivity extends BaseActivity {

    private ListView lv_city_card_info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_card_info);

        initView();
        initData();
    }


    private void initView() {
        lv_city_card_info= (ListView) findViewById(R.id.lv_city_card_info);

    }

    private void initData() {
        //设置titleBar界面以及点击事件
        initTopBarForBoth("一卡通丢失信息", R.drawable.edit, new HeaderLayout.onRightImageButtonClickListener() {
            @Override
            public void onClick() {
                //点击发布按钮进入到一卡通发布界面

                startActivity(new Intent(CityCardInfoActivity.this,CityCardReleaseActivity.class));
            }
        });

        CityCardInfoAdapter cityCardInfoAdapter=new CityCardInfoAdapter(this);
        lv_city_card_info.setAdapter(cityCardInfoAdapter);

    }

}
