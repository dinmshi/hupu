package com.hupu.coric.room;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.hupu.coric.lib.router.provider.IRoomProvider;

@Route(path = IRoomProvider.ROOM_MAIN_HOME)
public class RoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
    }
}
