package cn.gxy.myapplication.di;

import cn.gxy.myapplication.MainActivity;
import cn.gxy.myapplication.TextActivity;
import cn.gxy.myapplication.scope.HttpScope;
import dagger.Component;


/**
 * 自定义scpoe需要注意
 * 1一个组件对应一个scpoe
 * 2没有scpoe的组件不能依赖有scpoe的组件
 */
@HttpScope
@Component(modules = {HttpModule.class},
        dependencies = {UserComponent.class})
public interface HttpComponent {

    void injectMainActivity(MainActivity mainActivity);

    void injectTextActivity(TextActivity textActivity);

}
