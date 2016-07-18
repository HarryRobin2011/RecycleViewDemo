package com.harryrobin.recycleviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    RecyclerView recycleView;
    private String[] datas;
    private RecyclerView.LayoutManager layoutManager;
    private RecycleDemoAdapter recycleDemoAdapter;
    private TextView alert;
    private String aa = "SourceTree";
    private String dd = "dd";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycleView = (RecyclerView) findViewById(R.id.recycleView);
        initOperation();
    }


    private void initOperation() {
        datas = new String[30];
        for (int position = 0; position < 20; position++) {
            datas[position] = "测试" + position;
        }
        layoutManager = new LinearLayoutManager(this);
        recycleView.setHasFixedSize(true);
        recycleView.setLayoutManager(layoutManager);
        recycleDemoAdapter = new RecycleDemoAdapter(datas);
        recycleView.setAdapter(recycleDemoAdapter);
        alert.setText(R.string.app_name);

    }
}
