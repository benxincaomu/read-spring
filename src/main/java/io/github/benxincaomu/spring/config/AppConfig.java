package io.github.benxincaomu.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("io.github.benxincaomu.spring")
@PropertySource({"classpath:props.properties"})
public class AppConfig {

}
