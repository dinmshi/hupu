package com.hupu.coric.detail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.hupu.coric.lib.router.provider.IDetailProvider;

@Route(path = IDetailProvider.DETAIL_MAIN_HOME)
public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }
}
