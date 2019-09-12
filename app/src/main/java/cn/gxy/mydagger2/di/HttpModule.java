package cn.gxy.mydagger2.di;

import cn.gxy.mydagger2.object.HttpObject;
import dagger.Module;
import dagger.Provides;

/**
 * 用来提供对象
 */

@Module
public class HttpModule {


    @Provides
    public HttpObject providerHttpObject() {
        return new HttpObject();
    }



}
