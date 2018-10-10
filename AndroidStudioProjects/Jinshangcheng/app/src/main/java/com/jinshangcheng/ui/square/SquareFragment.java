package com.jinshangcheng.ui.square;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jinshangcheng.R;
import com.jinshangcheng.base.BaseFragment;

/**
 * 广场模块
 */
public class SquareFragment extends BaseFragment {

    private static SquareFragment fragment;

    public SquareFragment() {
        // Required empty public constructor
    }

    public static SquareFragment getInstance() {
        if (fragment == null) {
            synchronized (SquareFragment.class) {
                if (fragment == null) {
                    fragment = new SquareFragment();
                }
            }
        }
        return fragment;
    }


    @Override
    public View createView(LayoutInflater inflater) {
        return inflater.inflate(R.layout.fragment_square, null, false);
    }

    @Override
    public void initData() {

    }

    @Override
    public void initView() {

    }

}
