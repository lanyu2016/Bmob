package com.bmob.im.demo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.eson.cn.R;

/**
 * Created by Eson on 2016/12/14.
 */
public class CityCardInfoAdapter extends BaseAdapter {
    private Context context;

    public CityCardInfoAdapter(Context context){
        this.context=context;
    }
    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder viewHolder = null;
        if (convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_city_card_info, null);
            viewHolder=new ViewHolder();

            convertView.setTag(viewHolder);
        }else {

            viewHolder = (ViewHolder) convertView.getTag();
        }


        return convertView;
    }


    class ViewHolder{


    }
}
