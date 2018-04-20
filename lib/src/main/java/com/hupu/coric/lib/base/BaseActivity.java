package com.hupu.coric.lib.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author zhzy
 * @date 2018/4/19
 */
public abstract class BaseActivity extends AppCompatActivity {

    public abstract int getLayoutId();

    public abstract void init();

    public abstract void loadData();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        init();
        loadData();
    }
}
