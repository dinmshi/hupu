package com.hupu.coric.lib.router.module.room;

import com.hupu.coric.lib.router.ModuleManager;
import com.hupu.coric.lib.router.provider.IRoomProvider;


public class RoomService {
    private static boolean hasModule() {
        return ModuleManager.getInstance().hasModule(IRoomProvider.ROOM_MAIN_SERVICE);
    }
}
