package com.xoptimal.rcvhelper.view;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xoptimal.rcvhelper.R;

/**
 * Created by Freddie on 2018/4/4 0004 .
 * Description:
 */
public class ImplNetViewGroup extends INetViewGroup {


    public ImplNetViewGroup(Context context, ViewGroup root) {
        super(context, root);
    }

    @Override
    public View initNormal() {
        LinearLayout layout = new LinearLayout(mContext);
        Button       button = new Button(mContext);
        button.setText("加载更多");
        layout.addView(button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNetListener.onLoadMore();
            }
        });
        return layout;
    }

    @Override
    public View initEmptyView() {
        return LayoutInflater.from(mContext).inflate(R.layout.fd_view_empty, mRootView, false);
    }

    @Override
    public View initErrorView(Throwable e) {
        LinearLayout layout = new LinearLayout(mContext);
        Button       button = new Button(mContext);
        button.setText("加载更多失败,点击重试");
        layout.addView(button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNetListener.onLoadMore();
            }
        });
        return layout;
    }

    @Override
    public View initLoadingView() {
        LinearLayout layout = new LinearLayout(mContext);
        Button       button = new Button(mContext);
        button.setText("加载更多失败,点击重试");
        layout.addView(button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNetListener.onLoadMore();
            }
        });
        return layout;
    }

    @Override
    public View initMoreover() {
        LinearLayout layout   = new LinearLayout(mContext);
        TextView     textView = new TextView(mContext);
        textView.setText("没有更多数据啦~");
        layout.addView(textView);
        return layout;
    }
}
