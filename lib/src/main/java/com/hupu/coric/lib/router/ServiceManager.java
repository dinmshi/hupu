package com.hupu.coric.lib.router;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.launcher.ARouter;
import com.hupu.coric.lib.router.provider.IRoomProvider;
import com.hupu.coric.lib.router.provider.IDetailProvider;

public class ServiceManager {
    //服务注入看自己的具体实现
    //自动注入
    @Autowired
    IRoomProvider homeProvider;
    //可以不使用@Autowired，手动发现服务
    IDetailProvider module1Provider;


    public ServiceManager() {
        ARouter.getInstance().inject(this);

    }

    private static final class ServiceManagerHolder {
        private static final ServiceManager instance = new ServiceManager();
    }

    public static ServiceManager getInstance() {
        return ServiceManagerHolder.instance;
    }

    /**
     * @return
     */
    public IRoomProvider getHomeProvider() {
        return homeProvider;
    }


    public IDetailProvider getModule1Provider() {
        return  module1Provider != null ? module1Provider : (module1Provider = ((IDetailProvider) MyRouter.newInstance(IDetailProvider.DETAIL_MAIN_SERVICE).navigation()));
    }
}
