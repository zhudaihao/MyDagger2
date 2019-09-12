package cn.gxy.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import javax.inject.Inject;

import cn.gxy.myapplication.object.HttpObject;
import cn.gxy.myapplication.object.UserObject;

public class MainActivity extends AppCompatActivity {



    @Inject
    HttpObject httpObject;

    @Inject
    UserObject userObject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //实现接口方法
        ((MyApp)getApplication()).getHttpComponent().injectMainActivity(this);

        Log.e("zdh","--------------"+httpObject.hashCode());


        Log.e("zdh","--------------"+userObject.hashCode());
    }

    public void send(View view) {
        startActivity(new Intent(this,TextActivity.class));
    }
}
