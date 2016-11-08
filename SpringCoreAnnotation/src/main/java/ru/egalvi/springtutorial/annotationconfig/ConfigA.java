package ru.egalvi.springtutorial.annotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigA {
    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public A a() {
        return new A();
    }
}
