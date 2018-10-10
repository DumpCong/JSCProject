package com.jinshangcheng.ui.mine;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;

import com.jinshangcheng.R;
import com.jinshangcheng.adapter.CarListPagerAdapter;
import com.jinshangcheng.base.BaseFragment;
import com.jinshangcheng.bean.Car;
import com.jinshangcheng.ui.car.CarContract;
import com.jinshangcheng.ui.car.CarPresenter;
import com.jinshangcheng.utils.DensityUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.Unbinder;


/**
 * 我的Fragment
 */
public class MineFragment extends BaseFragment implements CarContract.IView {


    private static MineFragment mineFragment;

    private CarContract.IPresenter mPresenter;

    public MineFragment() {
        // Required empty public constructor
        mPresenter = new CarPresenter(this);
    }

    public static MineFragment getInstance() {
        if (mineFragment == null) {
            synchronized (MineFragment.class) {
                if (mineFragment == null) {
                    mineFragment = new MineFragment();
                }
            }
        }
        return mineFragment;
    }


    @Override
    public View createView(LayoutInflater inflater) {
        return LayoutInflater.from(getContext()).inflate(R.layout.fragment_mine, null, false);
    }


    @Override
    public void initData() {

    }

    @Override
    public void initView() {
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mPresenter.getCarList();

    }

    @Override
    public void onDetach() {
        super.onDetach();
//        mListener = null;
    }

    @Override
    public void setPresenter(CarContract.IPresenter presenter) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showCarList() {

    }

}
