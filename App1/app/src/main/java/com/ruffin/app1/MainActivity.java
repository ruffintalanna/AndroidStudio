package com.ruffin.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mUserInfo, mHandTremor, mHeartBeat, mSendInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUserInfo = (Button) findViewById(R.id.btn_userInfo);
        mHandTremor = (Button) findViewById(R.id.btn_handTremors);
        mHeartBeat = (Button) findViewById(R.id.btn_handTremors);
        mSendInfo = (Button) findViewById(R.id.btn_sendInfo);

        mUserInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startUserInfo();
            }
        });
    }

    private void startUserInfo() {
        Intent intent = new Intent(this, UserInfo.class);
        startActivity(intent);
    }
}
