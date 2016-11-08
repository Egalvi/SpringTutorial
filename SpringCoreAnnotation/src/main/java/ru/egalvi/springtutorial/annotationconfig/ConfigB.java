package ru.egalvi.springtutorial.annotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(ConfigA.class)
public class ConfigB {
    @Bean
    @Scope("prototype")
    public B b() {
        return new B();
    }
}
