package cn.gxy.myapplication.di;

import cn.gxy.myapplication.object.HttpObject;
import cn.gxy.myapplication.scope.HttpScope;
import dagger.Module;
import dagger.Provides;


/**
 * 注意类里面只要有一个方法使用@HttpSocpe注解，
 * 那类就需要使用@HttpScope注解
 *
 */
@HttpScope
@Module
public class HttpModule {

    @HttpScope
    @Provides
    public HttpObject providerHttpObject(){

        return new HttpObject();
    }
}
