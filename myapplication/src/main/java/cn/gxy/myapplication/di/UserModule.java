package cn.gxy.myapplication.di;

import cn.gxy.myapplication.object.UserObject;
import dagger.Module;
import dagger.Provides;

@Module
public class UserModule {

    @Provides
    public UserObject providerUserObject(){

        return new UserObject();
    }

}
