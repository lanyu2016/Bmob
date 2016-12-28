package com.bmob.im.demo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bmob.im.demo.bean.InfoBean;
import com.eson.cn.R;

import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.listener.FindListener;

/**
 * 资讯Adapter
 * Created by Eson on 2016/12/9.
 */
public class InfoAdapter extends BaseAdapter {
    private Context context;
    public InfoAdapter(Context context){
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
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_info, null);
            viewHolder = new ViewHolder();
            viewHolder.tv_info_title= (TextView) convertView.findViewById(R.id.tv_info_title);
            viewHolder.tv_info_message= (TextView) convertView.findViewById(R.id.tv_info_message);
            viewHolder.iv_info_picture= (ImageView) convertView.findViewById(R.id.iv_info_picture);
            viewHolder.tv_info_time= (TextView) convertView.findViewById(R.id.tv_info_time);

            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        BmobQuery<InfoBean> bmobQuery=new BmobQuery<InfoBean>();
        bmobQuery.addWhereEqualTo("InfoName","资讯");
        bmobQuery.setLimit(50);


        bmobQuery.findObjects(context, new FindListener<InfoBean>() {
            @Override
            public void onSuccess(List<InfoBean> list) {
                for (InfoBean infoBean:list) {

                    infoBean.getTv_info_title();
                    infoBean.getTv_info_message();
                    infoBean.getIv_info_picture();
                    infoBean.getCreatedAt();

                    System.out.println(infoBean.getTv_info_title());
                }
            }

            @Override
            public void onError(int i, String s) {


            }
        });
        return convertView;
    }

    public static class ViewHolder{
        TextView tv_info_title;
        TextView tv_info_message;
        ImageView iv_info_picture;
        TextView tv_info_time;
    }
}
