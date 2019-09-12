package cn.gxy.myapplication.di;

import cn.gxy.myapplication.object.UserObject;
import dagger.Component;

@Component(modules = {UserModule.class})
public interface UserComponent {

    /**
     * 如果这个组件被另外个组件依赖就直接返回bean对象
     * @return
     */
    UserObject providerUserObject();
}
