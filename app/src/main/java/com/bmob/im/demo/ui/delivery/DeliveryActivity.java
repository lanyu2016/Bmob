package com.bmob.im.demo.ui.delivery;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.bmob.im.demo.adapter.OrderDeliverAdapter;
import com.bmob.im.demo.ui.BaseActivity;
import com.eson.cn.R;

/**
 * 快递代拿主界面
 * Created by Eson on 2016/12/11.
 */
public class DeliveryActivity extends BaseActivity implements View.OnClickListener {
    //代拿快递布局
    private LinearLayout ll_take_deliver;
    private LinearLayout ll_order_deliver;
    private LinearLayout ll_order_info;

    private ListView lv_order_deliver;
    //代拿快递
    private Button bt_take_deliver;
    //快递接单
    private Button bt_order_deliver;
    //接单信息
    private Button bt_order_info;

    private Button bt_release_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);

        initView();
        initData();
    }

    private void initView() {
        initTopBarForLeft("快递代拿中心");
        ll_take_deliver = (LinearLayout) findViewById(R.id.ll_take_deliver);
        ll_order_deliver= (LinearLayout) findViewById(R.id.ll_order_deliver);
        ll_order_info= (LinearLayout) findViewById(R.id.ll_order_info);

        lv_order_deliver= (ListView) findViewById(R.id.lv_order_deliver);

        bt_take_deliver = (Button) findViewById(R.id.bt_take_deliver);
        bt_order_deliver = (Button) findViewById(R.id.bt_order_deliver);
        bt_order_info = (Button) findViewById(R.id.bt_order_info);
        bt_release_info= (Button) findViewById(R.id.bt_release_info);


        bt_take_deliver.setOnClickListener(this);
        bt_order_deliver.setOnClickListener(this);
        bt_order_info.setOnClickListener(this);

    }

    private void initData() {

        OrderDeliverAdapter orderDeliverAdapter=new OrderDeliverAdapter(this);
        lv_order_deliver.setAdapter(orderDeliverAdapter);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            //点击代拿快递
            case R.id.bt_take_deliver:
                ll_take_deliver.setVisibility(View.VISIBLE);
                ll_order_deliver.setVisibility(View.GONE);
                ll_order_info.setVisibility(View.GONE);
                break;
            //点击快递接单
            case R.id.bt_order_deliver:
                ll_order_deliver.setVisibility(View.VISIBLE);
                ll_take_deliver.setVisibility(View.GONE);
                ll_order_info.setVisibility(View.GONE);
                break;
            //点击接单信息
            case R.id.bt_order_info:
                ll_order_info.setVisibility(View.VISIBLE);
                ll_order_deliver.setVisibility(View.GONE);
                ll_take_deliver.setVisibility(View.GONE);
                break;
            case R.id.bt_release_info:
                Toast.makeText(getApplicationContext(),"发布成功",Toast.LENGTH_LONG);
                bt_release_info.setBackgroundResource(R.color.base_color_text_gray);
                ll_order_deliver.setVisibility(View.VISIBLE);
                ll_take_deliver.setVisibility(View.GONE);
                ll_order_info.setVisibility(View.GONE);
                break;
        }

    }
}
