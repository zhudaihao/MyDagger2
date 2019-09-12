package cn.gxy.mydagger2.di;

import cn.gxy.mydagger2.object.DataBaseObject;
import dagger.Module;
import dagger.Provides;


@Module
public class DataBaseModule {


    @Provides
    public DataBaseObject providerDataBaseObject() {
        return new DataBaseObject();
    }
}
