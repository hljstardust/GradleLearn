package com.autohome.common.gradlelearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StringBuilder sb = new StringBuilder();
        sb.append("appname=").append(getResources().getString(R.string.app_name)).append("&");
        sb.append("api_url=").append(BuildConfig.API_URL);
        Log.i(Constants.TAG, sb.toString());
    }
}
