package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class adapter extends BaseAdapter {

    private Context context;
    private int layout;
    public List<monan> arraylist;

    public adapter(Context context, int layout, List<monan> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView =inflater.inflate(layout,null);
        monan monan =  arraylist.get(position);

        TextView txtnamemoan =convertView.findViewById(R.id.txtname);
        TextView txttitle =convertView.findViewById(R.id.txttitle);
        ImageView imagehinh = convertView.findViewById(R.id.imageHinh);
        ImageButton btnadd = convertView.findViewById(R.id.btnadd);
        ImageButton btntru = convertView.findViewById(R.id.btntru);

        txtnamemoan.setText(monan.getTenmonan());
        txttitle.setText(monan.getMota());
        imagehinh.setImageResource(monan.getHinh());

        btntru.setImageResource(monan.getTru());
        btnadd.setImageResource(monan.getAdd());


        return convertView;
    }
}
