package com.assignmentround1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.assignmentround1.R;

/**
 * Created by ttnd on 19/1/16.
 */
public class MainListAdapter extends BaseAdapter{

    private LayoutInflater mLayoutInflater;

    private Context mContext;

    private String[] titles;

    public MainListAdapter(Context context){
        mLayoutInflater = LayoutInflater.from(context);
        mContext = context;
        titles = context.getResources().getStringArray(R.array.list_title);
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Object getItem(int position) {
        return titles[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder;
        if(convertView == null || convertView.getTag() == null){
            convertView = mLayoutInflater.inflate(R.layout.list_item_main,null);
            holder = new Holder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }
        holder.titleTextView.setText(titles[position]);
        return convertView;
    }

    private class Holder{
        private TextView titleTextView;
        Holder(View view){
            titleTextView = (TextView) view.findViewById(R.id.textview_title);
        }
    }
}
