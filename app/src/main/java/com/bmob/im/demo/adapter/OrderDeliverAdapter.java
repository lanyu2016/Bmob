package com.bmob.im.demo.adapter;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.eson.cn.R;

/**
 * Created by Eson on 2016/12/19.
 */
public class OrderDeliverAdapter  extends BaseAdapter{
    private Context context;
    private Dialog dialog;

    public OrderDeliverAdapter(Context context){

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
            convertView = LayoutInflater.from(context).inflate(R.layout.item_order_deliver, null);
            viewHolder=new ViewHolder();
            Button bt_order = (Button) convertView.findViewById(R.id.bt_order);

            final  View dialogView = LayoutInflater.from(context).inflate(R.layout.dialog_defect_content, null);
            final  TextView tv_cancel= (TextView) dialogView.findViewById(R.id.tv_cancel);
            final  TextView tv_confirm= (TextView)dialogView.findViewById(R.id.tv_confirm);

            bt_order.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    AlertDialog.Builder builder = new AlertDialog.Builder(context).setView(dialogView);
                    dialog = builder.show();

                }
            });

            tv_cancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    dialog.dismiss();

                }
            });

            tv_confirm.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    dialog.dismiss();

                }
            });

            convertView.setTag(viewHolder);
        }else {

            viewHolder = (ViewHolder) convertView.getTag();
        }


        return convertView;
    }


    class ViewHolder{

        Button bt_order;



    }
}
