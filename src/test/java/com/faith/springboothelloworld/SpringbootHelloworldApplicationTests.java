package com.faith.springboothelloworld;

import com.faith.springboothelloworld.bean.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 * SpringBoot单元测试；
 *
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器的
 */
@SpringBootTest
class SpringbootHelloworldApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    void contextLoads() {
    System.out.println(person.toString());
    }

    @Test
    void test1(){
        boolean helloService = ioc.containsBean("helloService");
    System.out.println(helloService);
    }

    //记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    void testLog(){

        //日志的级别：
        //由低到高 trace<debug<info<warn<error
        //可以调整输出的日志级别：日志就只会在这个级别以后的高级别生效

        for (int i = 0;i<10000;i++){
            logger.trace("这是trace日志..."+i);
            logger.debug("这是debug日志..."+i);
            logger.info("这是info日志..."+i);
            logger.warn("这是warn日志..."+i);
            logger.error("这是error日志..."+i);
        }


    }


}
