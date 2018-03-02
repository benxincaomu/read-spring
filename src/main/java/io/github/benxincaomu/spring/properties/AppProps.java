package io.github.benxincaomu.spring.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@PropertySource({"classpath:aa.properties"})
public class AppProps {
    @Value("${aa}")
    private String aa;

    public String getAa(){
        return aa;
    }

    public void setAa(String aa){
        this.aa = aa;
    }
    
}
