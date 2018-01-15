package com.pksure.dubbo.strategy.fail.provider;

import com.pksure.dubbo.strategy.fail.api.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class ADemoServiceImpl implements DemoService {
    private static Logger logger = LoggerFactory.getLogger(ADemoServiceImpl.class);

    @Override
    public String sayHello(String name) {
        logger.info(" A receive name = {}.", name);

        // 使用超时导致失败
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "Hello " + name;
    }

}
