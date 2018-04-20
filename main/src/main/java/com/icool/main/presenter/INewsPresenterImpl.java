package com.icool.main.presenter;

import android.content.Context;

import com.icool.main.bean.NewsBean;
import com.icool.main.contract.NewsContract;
import com.icool.main.fragment.NewsFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * news presenter
 *
 * @author zhzy
 * @date 2018/4/20
 */

public class INewsPresenterImpl implements NewsContract.Presenter {

    private Context mContext;
    private NewsContract.View mView;

    public INewsPresenterImpl(Context context, NewsContract.View view) {
        this.mContext = context;
        this.mView = view;
        mView.setPresenter(this);
    }

    @Override
    public void refresh() {

    }

    @Override
    public void loadMore() {

    }

    @Override
    public void retry() {

    }

    @Override
    public void start() {
        NewsBean newsBean1 = new NewsBean("", "KD 2017 FINAL MVP", "Golden State 4:1 Toronto Raptor", 1l);
        NewsBean newsBean2 = new NewsBean("", "F-MVP KD !", "Golden State 4:3 Boston Celtics", 1l);
        NewsBean newsBean3 = new NewsBean("", "KD FINAL MVP", "Golden State 4:0 MIA HEAT", 1l);
        List<NewsBean> list = new ArrayList<>();
        list.add(newsBean1);
        list.add(newsBean2);
        list.add(newsBean3);
        list.add(newsBean1);
        list.add(newsBean2);
        list.add(newsBean3);
        mView.addAll(list);
    }
}
