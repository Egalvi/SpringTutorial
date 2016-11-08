package ru.egalvi.springtutorial.annotationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainImportedConfig {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(ConfigB.class);
//        For two configs
//        ApplicationContext ctx =
//                new AnnotationConfigApplicationContext(ConfigA.class, ConfigB.class);
        // now both beans A and B will be available...
        A a = ctx.getBean(A.class);
        B b = ctx.getBean(B.class);


    }
}
