package cn.gxy.mydagger2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import javax.inject.Inject;

import cn.gxy.mydagger2.object.DataBaseObject;
import cn.gxy.mydagger2.object.HttpObject;
import cn.gxy.mydagger2.object.UserObject;


public class MainActivity extends AppCompatActivity {


    @Inject
    public HttpObject httpObject;

    @Inject
    public HttpObject httpObject2;

    @Inject
    public DataBaseObject dataBaseObject;

    @Inject
    public UserObject userObject;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





//        DaggerMyComponent.builder()

//        ((MyApp) getApplication()).getMyComponent().injectMainActivity(this);
//        DaggerMyComponent.builder()
//                .httpModule(new HttpModule())
//                .build()
//                .injectMainActivity(this);


        Log.e("zdh", "-------------" + httpObject.hashCode());
        Log.e("zdh", "-------------" + httpObject2.hashCode());

        Log.e("zdh","-------------"+dataBaseObject.hashCode());
        Log.e("zdh","-------------user  "+userObject.hashCode());
    }

    public void send(View view) {
        startActivity(new Intent(this, TextActivity.class));
    }
}
