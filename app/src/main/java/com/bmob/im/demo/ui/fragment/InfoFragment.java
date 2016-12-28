package com.bmob.im.demo.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.bmob.im.demo.adapter.InfoAdapter;
import com.bmob.im.demo.ui.FragmentBase;
import com.bmob.im.demo.ui.NewsActivity;
import com.bmob.im.demo.ui.citycard.CityCardInfoActivity;
import com.bmob.im.demo.ui.delivery.DeliveryActivity;
import com.bmob.im.demo.ui.lecture.LectureActivity;
import com.eson.cn.R;

/**
 * 资讯fragment
 * Created by Eson on 2016/8/23.
 */
public class InfoFragment extends FragmentBase implements View.OnClickListener{
   private ListView lv_info;
    //新闻资讯
    private LinearLayout ll_news;
    //讲座
    private LinearLayout ll_lecture;
    //一卡通
    private LinearLayout ll_city_card;
    //玩游戏
    private LinearLayout ll_play_game;
    //拿快递
    private LinearLayout ll_deliver;
    //各种活动
    private LinearLayout ll_campaign;
    //六个模块
    private LinearLayout ll_six_module;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_info, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initView();
        initData();
    }



    private void initView() {
        initTopBarForOnlyTitle("资讯");
        ll_news= (LinearLayout) findViewById(R.id.ll_news);
        ll_lecture= (LinearLayout) findViewById(R.id.ll_lecture);
        ll_city_card= (LinearLayout) findViewById(R.id.ll_city_card);
        ll_play_game= (LinearLayout) findViewById(R.id.ll_play_game);
        ll_deliver= (LinearLayout) findViewById(R.id.ll_deliver);
        ll_campaign= (LinearLayout) findViewById(R.id.ll_campaign);
        ll_six_module= (LinearLayout) findViewById(R.id.ll_six_module);
        lv_info= (ListView) findViewById(R.id.lv_info);

        ll_news.setOnClickListener(this);
        ll_lecture.setOnClickListener(this);
        ll_city_card.setOnClickListener(this);
        ll_play_game.setOnClickListener(this);
        ll_deliver.setOnClickListener(this);
        ll_campaign.setOnClickListener(this);

        ll_six_module.setVisibility(View.VISIBLE);

        InfoAdapter infoAdapter=new InfoAdapter(getActivity());
        lv_info.setAdapter(infoAdapter);
    }
    //初始化数据
    private void initData() {

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.ll_news:
                //进入新闻资讯中心
                startActivity(new Intent(getActivity(), NewsActivity.class));
                break;
            case R.id.ll_lecture:
               //进入大学城讲座中心
               startActivity(new Intent(getActivity(), LectureActivity.class));
                break;
            case R.id.ll_city_card:
              //进入一卡通寻回中心
                startActivity(new Intent(getActivity(), CityCardInfoActivity.class));
                break;

            case R.id.ll_play_game:
             //进入小游戏中心
                break;

            case R.id.ll_deliver:
                //进入快递代拿中心
                startActivity(new Intent(getActivity(), DeliveryActivity.class));
                break;

            case R.id.ll_campaign:
                //进入大学城活动中心

                break;


        }
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();

    }


}
