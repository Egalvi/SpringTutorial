package ru.egalvi.springtutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AbstractApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

//        singletonExample(context);
//
//        prototypeExample(context);
//
//        HelloIndia objB = (HelloIndia) context.getBean("helloIndia");
//        objB.getMessage();
//        objB.getMessage2();
//
//        HelloIndia objC = (HelloIndia) context.getBean("helloIndia2");
//        objC.getMessage();
//        objC.getMessage2();

        TextEditor te = (TextEditor) context.getBean("textEditor");
        te.spellCheck();
        te = (TextEditor) context.getBean("textEditor");


        JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();

        context.registerShutdownHook();
    }

    private static void prototypeExample(ApplicationContext context) {
        HelloWorld objA = (HelloWorld) context.getBean("helloWorldPrototype");

        objA.setMessage("I'm object A");
        objA.getMessage();

        HelloWorld objB = (HelloWorld) context.getBean("helloWorldPrototype");
        objB.getMessage();
    }

    private static void singletonExample(ApplicationContext context) {
        HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

        objA.setMessage("I'm object A");
        objA.getMessage();

        HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
        objB.getMessage();
    }
}
