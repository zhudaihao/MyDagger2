package cn.gxy.mydagger2;

import android.app.Application;

import cn.gxy.mydagger2.di.DaggerMyComponent;
import cn.gxy.mydagger2.di.DaggerUserComponent;
import cn.gxy.mydagger2.di.DataBaseModule;
import cn.gxy.mydagger2.di.HttpModule;
import cn.gxy.mydagger2.di.MyComponent;

public class MyApp extends Application {

    private MyComponent myComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        myComponent = DaggerMyComponent.builder()
                .dataBaseModule(new DataBaseModule())
                .httpModule(new HttpModule())
                .userComponent(DaggerUserComponent.create())
                .build();


    }

    public MyComponent getMyComponent() {
        return myComponent;
    }


}
