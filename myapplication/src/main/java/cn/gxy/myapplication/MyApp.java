package cn.gxy.myapplication;

import android.app.Application;


import cn.gxy.myapplication.di.DaggerHttpComponent;
import cn.gxy.myapplication.di.DaggerUserComponent;
import cn.gxy.myapplication.di.HttpComponent;
import cn.gxy.myapplication.di.HttpModule;

public class MyApp extends Application {
    private HttpComponent httpComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        httpComponent=DaggerHttpComponent.builder()
                //添加模块
                .httpModule(new HttpModule())
                //一个组件依赖另外个组件需要 初始化这个组件
                .userComponent(DaggerUserComponent.create())
                .build();
    }


    public HttpComponent getHttpComponent(){
        return httpComponent;
    }
}
