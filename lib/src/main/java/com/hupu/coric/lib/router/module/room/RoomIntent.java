package com.hupu.coric.lib.router.module.room;

import com.hupu.coric.lib.router.ModuleManager;
import com.hupu.coric.lib.router.MyRouter;
import com.hupu.coric.lib.router.provider.IRoomProvider;

public class RoomIntent {
    private static boolean hasModule() {
        return ModuleManager.getInstance().hasModule(IRoomProvider.ROOM_MAIN_SERVICE);
    }
    public static void launchHome(int tabType) {
        //HomeActivity
        MyRouter.newInstance(IRoomProvider.ROOM_MAIN_HOME)
                .navigation();
    }
}
