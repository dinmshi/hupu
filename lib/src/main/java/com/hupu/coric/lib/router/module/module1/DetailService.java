package com.hupu.coric.lib.router.module.module1;

import android.support.v4.app.Fragment;

import com.hupu.coric.lib.router.ModuleManager;
import com.hupu.coric.lib.router.ServiceManager;
import com.hupu.coric.lib.router.provider.IDetailProvider;


public class DetailService {
    private static boolean hasModule1() {
        return ModuleManager.getInstance().hasModule(IDetailProvider.DETAIL_MAIN_SERVICE);
    }

    public static Fragment getModule1Frgment(Object... args) {
        if(!hasModule1()) return null;
        return ServiceManager.getInstance().getModule1Provider().newInstance(args);
    }
}
