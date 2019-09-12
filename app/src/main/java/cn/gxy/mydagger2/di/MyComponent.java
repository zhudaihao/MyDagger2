package cn.gxy.mydagger2.di;

import cn.gxy.mydagger2.MainActivity;
import dagger.Component;

/**
 * 这就是一个组件
 * @Singleton只是一个模板，我们需要scope都自定义
 * dependencies:组件依赖
 * 1.多个组件之间的scope不能相同
 * 2.没有scope的不能依赖有scope的组件
 */

@Component(modules = {HttpModule.class})
public interface MyComponent {
      void injectMainActivity(MainActivity mainActivity);


}













