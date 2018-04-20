package com.icool.main.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.icool.main.R;
import com.icool.main.bean.NewsBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhzy
 * @date 2018/4/20
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsHolder> {

    private Context mContext;
    private List<NewsBean> mNewsList;

    public NewsAdapter(Context context) {
        mContext = context;
    }

    public void addAll(List<NewsBean> newsList) {
        if (mNewsList == null) mNewsList = new ArrayList<>();
        mNewsList.addAll(newsList);
        notifyDataSetChanged();
    }


    @Override
    public NewsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_news, null);
        return new NewsHolder(view);
    }

    @Override
    public void onBindViewHolder(NewsHolder holder, int position) {
        holder.newsTitle.setText(mNewsList.get(position).getTitle());
        holder.newsSummary.setText(mNewsList.get(position).getSummary());
        int index = position % 3;
        switch (index) {
            case 0:
                holder.newsCover.setImageResource(R.drawable.kd1);
                break;
            case 1:
                holder.newsCover.setImageResource(R.drawable.kd2);
                break;
            case 2:
                holder.newsCover.setImageResource(R.drawable.kd3);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return mNewsList == null ? 0 : mNewsList.size();
    }

    static class NewsHolder extends RecyclerView.ViewHolder {
        ImageView newsCover;
        TextView newsTitle;
        TextView newsSummary;

        public NewsHolder(View itemView) {
            super(itemView);
            newsCover = itemView.findViewById(R.id.image_news);
            newsTitle = itemView.findViewById(R.id.text_news_title);
            newsSummary = itemView.findViewById(R.id.text_news_summary);
        }
    }
}
