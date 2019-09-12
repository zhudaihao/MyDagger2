package cn.gxy.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

import cn.gxy.myapplication.object.HttpObject;

public class TextActivity extends AppCompatActivity {



    @Inject
    HttpObject httpObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);


        //实现接口方法
        ((MyApp)getApplication()).getHttpComponent().injectTextActivity(this);

        Log.e("zdh","--------------"+httpObject.hashCode());
    }
}
