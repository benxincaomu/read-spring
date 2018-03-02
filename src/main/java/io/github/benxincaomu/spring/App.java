package io.github.benxincaomu.spring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.core.env.Environment;
import io.github.benxincaomu.spring.config.AppConfig;

/**
 * Hello world!
 */
public class App {
    private static Logger log = LogManager.getLogger();

    public static void main(String[] args){
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Environment evn = ctx.getBean(Environment.class);
        log.info("读取到配置文件中aa的值为："+evn.getProperty("aa"));
        ctx.close();
    }
}
