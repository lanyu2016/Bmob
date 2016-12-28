package com.bmob.im.demo.ui.lecture;

import android.os.Bundle;
import android.widget.ListView;

import com.bmob.im.demo.adapter.LectureAdapter;
import com.bmob.im.demo.ui.ActivityBase;
import com.eson.cn.R;

/**
 * Created by Eson on 2016/12/12.
 */
public class LectureActivity extends ActivityBase {

    private ListView lv_lecture;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lecture);

        initView();
        initData();
    }



    private void initView() {

        initTopBarForLeft("大学城讲座");
        lv_lecture= (ListView) findViewById(R.id.lv_lecture);
    }

    private void initData() {

        LectureAdapter lectureAdapter=new LectureAdapter(this);

        lv_lecture.setAdapter(lectureAdapter);


    }
}
