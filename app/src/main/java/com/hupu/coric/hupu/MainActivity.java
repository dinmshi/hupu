package com.hupu.coric.hupu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.hupu.coric.lib.router.provider.IDetailProvider;
import com.hupu.coric.lib.router.provider.IRoomProvider;

/**
 * Created by coric on 21/01/2018.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.room).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(IRoomProvider.ROOM_MAIN_HOME).navigation();
            }
        });

        findViewById(R.id.detail).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build(IDetailProvider.DETAIL_MAIN_HOME).navigation();
            }
        });
    }
}