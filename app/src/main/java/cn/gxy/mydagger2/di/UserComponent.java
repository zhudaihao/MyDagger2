package cn.gxy.mydagger2.di;

import cn.gxy.mydagger2.object.UserObject;
import dagger.Component;



@Component(modules = {UserModule.class})
public interface UserComponent {

    UserObject providerUserObject();
}
