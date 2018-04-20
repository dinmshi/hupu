package com.hupu.coric.lib.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author zhzy
 * @date 2018/4/19
 */
public abstract class BaseFragment extends Fragment {

    public abstract int getLayoutId();

    public abstract void init(View view);

    public abstract void loadData();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);
        init(view);
        loadData();
        return view;
    }
}
