package com.example.olive.dialler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    List<Log> List;
    Context c;

    public MyAdapter(java.util.List<Log> list, Context c) {
        List = list;
        this.c = c;
    }

    @Override
    public int getCount() {
        return List.size();
    }

    @Override
    public Object getItem(int i) {
        return List.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        View v=LayoutInflater.from(c).inflate(R.layout.call_log,viewGroup,false);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        TextView phoneText=v.findViewById(R.id.phone);
        TextView timeText=v.findViewById(R.id.time);
        phoneText.setText(List.get(i).getPhone());
        timeText.setText(List.get(i).getTime());
        return v;
    }
}
