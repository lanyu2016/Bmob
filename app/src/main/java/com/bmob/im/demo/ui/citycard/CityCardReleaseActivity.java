package com.bmob.im.demo.ui.citycard;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.bmob.im.demo.ui.BaseActivity;
import com.bmob.im.demo.view.HeaderLayout;
import com.eson.cn.R;

/**
 * 一卡通发布Activity
 * Created by Eson on 2016/12/13.
 */
public class CityCardReleaseActivity extends BaseActivity {
    private EditText et_city_card_info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_card);
        initView();
        initData();
    }



    private void initView() {
        et_city_card_info= (EditText) findViewById(R.id.et_city_card_info);

    }

    private void initData() {

        initTopBarForBoth("一卡通发布", R.drawable.release, new HeaderLayout.onRightImageButtonClickListener() {
            @Override
            public void onClick() {
                //点击发布按钮进入到一卡通丢失信息界面
                if (et_city_card_info.getText()!=null){

                    startActivity(new Intent(CityCardReleaseActivity.this, CityCardInfoActivity.class));
                    Toast.makeText(getApplicationContext(),"发送成功",Toast.LENGTH_LONG);
                }else {
                    Toast.makeText(getApplicationContext(),"一卡通丢失信息不能为空",Toast.LENGTH_LONG);
                }

            }
        });

    }
}
