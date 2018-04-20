package com.icool.main;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;

import com.alibaba.android.arouter.launcher.ARouter;
import com.hupu.coric.lib.base.BaseActivity;
import com.hupu.coric.lib.router.provider.IDetailProvider;
import com.hupu.coric.lib.router.provider.IRoomProvider;
import com.icool.main.fragment.NewsFragment;
import com.icool.main.presenter.INewsPresenterImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Main
 *
 * @author zhzy
 * @date 2018/4/20
 */

public class MainActivity extends BaseActivity {
    private ViewPager mPager;
    private List<Fragment> mFragments;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void init() {
        mFragments = new ArrayList<>();
        NewsFragment newsFragment1 = new NewsFragment();
        NewsFragment newsFragment2 = new NewsFragment();
        NewsFragment newsFragment3 = new NewsFragment();
        mFragments.add(newsFragment1);
        mFragments.add(newsFragment2);
        mFragments.add(newsFragment3);
        new INewsPresenterImpl(this, newsFragment1);
        new INewsPresenterImpl(this, newsFragment2);
        new INewsPresenterImpl(this, newsFragment3);

        mPager = findViewById(R.id.viewPager);
        mPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return mFragments.get(position);
            }

            @Override
            public int getCount() {
                return mFragments.size();
            }
        });
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            int i = item.getItemId();
            if (i == R.id.navigation_news) {
                mPager.setCurrentItem(0);
                return true;
            } else if (i == R.id.navigation_dashboard) {
                mPager.setCurrentItem(1);
                return true;
            } else if (i == R.id.navigation_game) {
                mPager.setCurrentItem(2);
                return true;
            }
            return false;
        }

    };

    @Override
    public void loadData() {

    }
}
