package com.sothree.slidinguppanel;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by Kevin LE GOFF
 */
public class BugFixedScrollRecyclerView extends RecyclerView{

    private int scrollY = 0;

    public BugFixedScrollRecyclerView(Context context) {
        super(context);
        init();
    }

    public BugFixedScrollRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BugFixedScrollRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public void init () {
        this.addOnScrollListener(new OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                scrollY += dy;
                super.onScrolled(recyclerView, dx, dy);
            }
        });
    }

    public int getFixedScrollY() {
        return scrollY;
    }

}
