package com.pksure.dubbo.strategy.fail.consumer;

import com.pksure.dubbo.strategy.fail.api.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    private static Logger logger = LoggerFactory.getLogger(Consumer.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/dubbo-rc-consumer.xml");
        context.start();

        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("World"); // 执行远程方法

        logger.info(hello); // 显示调用结果

    }

}
