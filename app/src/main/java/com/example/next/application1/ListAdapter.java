package com.example.next.application1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by next on 31/3/17.
 */
public class ListAdapter extends BaseAdapter {

LayoutInflater mLayoutInflater;
    ArrayList<LoginModel> mdata;
    Context context;

    public ListAdapter(ArrayList<LoginModel> mdata, Context context) {
        this.mdata = mdata;
        this.context = context;
    }

    @Override
    public int getCount() {
        return mdata.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
       convertView= LayoutInflater.from(context).inflate(R.layout.listitems,null);
    //   convertView= mLayoutInflater.inflate(R.layout.listitems,parent,null);
        TextView user,psswrd;
        user= (TextView) convertView.findViewById(R.id.user);
        psswrd= (TextView) convertView.findViewById(R.id.pwd);

        user.setText(mdata.get(position).getUserName());
       psswrd.setText( mdata.get(position).getPassword());

        return convertView;

    }
}
