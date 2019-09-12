package cn.gxy.mydagger2.di;

import cn.gxy.mydagger2.object.UserObject;
import dagger.Module;
import dagger.Provides;


@Module
public class UserModule {

    @Provides
    public UserObject providerUser() {
        return new UserObject();
    }
}
