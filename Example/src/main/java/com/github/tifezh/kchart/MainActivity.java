package com.github.tifezh.kchart;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by ShuLin on 2017/11/9.
 Email linlin.1016@qq.com
 Company Shanghai Quantpower Information Technology Co.,Ltd.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent();
        switch (v.getId())
        {
            case R.id.btn_style1:
                intent.setClass(this,ExampleActivity.class);
                intent.putExtra("type",0);
                break;
            case R.id.btn_style2:
                intent.setClass(this,ExampleActivity.class);
                intent.putExtra("type",1);
                break;
            case R.id.btn_loadmore:
                intent.setClass(this,LoadMoreActivity.class);
                break;
            case R.id.btn_minute:
                intent.setClass(this,MinuteChartActivity.class);
                break;
        }
        startActivity(intent);
    }
}
