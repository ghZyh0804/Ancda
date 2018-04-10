package com.ancda.parents;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.ancda.parents.callback.JsonCallback;
import com.ancda.parents.utils.Urls;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.model.Response;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.tv);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                OkGo.<JSONObject>get(Urls.URL_JSONOBJECT)//
                        .execute(new JsonCallback<JSONObject>() {
                            @Override
                            public void onSuccess(Response<JSONObject> response) {
                                System.out.println(response.body());
                            }

                            @Override
                            public void onError(Response<JSONObject> response) {
                                response.getException().printStackTrace();
                            }
                        });


            }
        });
    }
}
