package com.example.xhh.scrollviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ImageView imageView;
    private List<String>  listdata = new ArrayList<>();
//    private ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.mipmap.ic_launcher);
        listView = (ListView) findViewById(R.id.listviewId);
        initData();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,R.layout.item_layout,listdata);
        listView.setAdapter(adapter);
    }

    private void initData() {
        for(int i =0;i<10;i++){
            listdata.add("数据"+i);
        }
    }
}
