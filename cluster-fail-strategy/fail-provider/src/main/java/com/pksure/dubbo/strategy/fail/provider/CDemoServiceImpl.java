package com.pksure.dubbo.strategy.fail.provider;

import com.pksure.dubbo.strategy.fail.api.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CDemoServiceImpl implements DemoService {
    private static Logger logger = LoggerFactory.getLogger(CDemoServiceImpl.class);

    @Override
    public String sayHello(String name) {
        logger.info(" C receive name = {}.", name);

        return "Hello " + name;
    }

}
