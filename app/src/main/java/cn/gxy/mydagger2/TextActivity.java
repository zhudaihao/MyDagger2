package cn.gxy.mydagger2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class TextActivity extends AppCompatActivity {
//    @Inject
//    HttpObject httpObject;
//    @Inject
//    UserObject userObject;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);


//        ((MyApp) getApplication()).getMyComponent().injectTextActivity(this);
//        DaggerMyComponent.create().injectTextActivity(this);

//        DaggerMyComponent.builder()
//                .httpModule(new HttpModule())
//                .build()
//                .injectTextActivity(this);

//        Log.e("zdh", "-------------" + httpObject.hashCode());
//        Log.e("zdh", "-------------user " + userObject.hashCode());


    }
}
