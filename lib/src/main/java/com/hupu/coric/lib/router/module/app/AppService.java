package com.hupu.coric.lib.router.module.app;

import com.hupu.coric.lib.router.ModuleManager;
import com.hupu.coric.lib.router.provider.IAppProvider;

public class AppService {
    private static boolean hasModule() {
        return ModuleManager.getInstance().hasModule(IAppProvider.APP_MAIN_SERVICE);
    }

}
