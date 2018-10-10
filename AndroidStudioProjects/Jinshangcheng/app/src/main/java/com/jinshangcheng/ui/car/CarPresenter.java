package com.jinshangcheng.ui.car;

import com.jinshangcheng.base.BasePresenterImpl;

import platform.cston.httplib.bean.CarListResult;
import platform.cston.httplib.search.CarInfoSearch;
import platform.cston.httplib.search.OnResultListener;

public class CarPresenter extends BasePresenterImpl implements CarContract.IPresenter {

    private CarModel model;
    private CarContract.IView carView;

    public CarPresenter(CarContract.IView carView) {
        this.model = new CarModel();
        this.carView = carView;
        carView.setPresenter(this);
    }

    @Override
    public void getCarList() {
        CarInfoSearch.newInstance().GetCarInfoResult(new OnResultListener.OnGetCarListResultListener() {
            @Override
            public void onGetCarListResult(CarListResult carListResult, boolean b, Throwable throwable) {

            }
        });
    }
}
