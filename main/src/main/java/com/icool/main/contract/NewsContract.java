package com.icool.main.contract;

import com.hupu.coric.lib.base.BasePresenter;
import com.hupu.coric.lib.base.BaseView;
import com.icool.main.bean.NewsBean;

import java.util.List;

/**
 * This specifies the contract between the view and the presenter.
 * Created by ZhaoZongyao on 2018/4/20.
 */

public interface NewsContract {

    interface View extends BaseView<Presenter> {

        void addAll(List<NewsBean> newsBeans);

        void showLoading();

        void hideLoading();
    }

    interface Presenter extends BasePresenter {
        void refresh();

        void loadMore();

        void retry();

    }
}
