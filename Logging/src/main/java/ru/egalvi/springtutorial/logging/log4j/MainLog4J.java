package ru.egalvi.springtutorial.logging.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 */
public class MainLog4J {

    static Logger log = LogManager.getLogger();

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beansLog4J.xml");

        log.info("Going to create HelloWord Obj");

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        obj.getMessage();

        log.info("Exiting the program");
    }
}
