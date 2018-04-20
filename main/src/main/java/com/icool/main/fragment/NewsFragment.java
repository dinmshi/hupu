package com.icool.main.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.hupu.coric.lib.base.BaseFragment;
import com.icool.main.R;
import com.icool.main.adapter.NewsAdapter;
import com.icool.main.bean.NewsBean;
import com.icool.main.contract.NewsContract;
import com.icool.main.presenter.INewsPresenterImpl;

import java.util.List;

/**
 * @author zhzy
 * @date 2018/4/20
 */

public class NewsFragment extends BaseFragment implements NewsContract.View {

    private RecyclerView mRecyclerView;
    private INewsPresenterImpl mNewsPresenter;
    private NewsAdapter mNewsAdapter;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_news;
    }

    @Override
    public void init(View view) {
        mRecyclerView = view.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mNewsAdapter = new NewsAdapter(getContext());
        mRecyclerView.setAdapter(mNewsAdapter);
    }

    @Override
    public void loadData() {
        mNewsPresenter.start();
    }


    @Override
    public void addAll(List<NewsBean> newsBeans) {
        mNewsAdapter.addAll(newsBeans);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void setPresenter(NewsContract.Presenter presenter) {
        mNewsPresenter = (INewsPresenterImpl) presenter;
    }
}
