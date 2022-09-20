package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView;
        listView = findViewById(R.id.listview);
        ArrayList<monan> arrayList;
        adapter adapter;
        arrayList = new ArrayList<>();
        arrayList.add(new monan("Mì Xào","xiêu cay",R.drawable.mixao,R.drawable.tru,R.drawable.add));
        arrayList.add(new monan("Bún đậu mắm tôm","mắm tôm đậm vị",R.drawable.bdmt,R.drawable.tru,R.drawable.add));
        arrayList.add(new monan("Phở cung đình","yêu phở Hà Nội - thử ngay cùng đình",R.drawable.phocd,R.drawable.tru,R.drawable.add));
        arrayList.add(new monan("Bánh Xèo","bánh xèo quảng nam",R.drawable.bx,R.drawable.tru,R.drawable.add));
        arrayList.add(new monan("Bánh Căn","ngon khó cưởng ",R.drawable.banhcan,R.drawable.tru,R.drawable.add));
        adapter = new adapter(MainActivity.this,R.layout.layout_monan,arrayList);
        listView.setAdapter(adapter);

    }
}