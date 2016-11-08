package ru.egalvi.springtutorial.annotationconfig;

public class A {
    public void init() {
        // initialization logic
        System.out.println("Inside ru.egalvi.springtutorial.annotationconfig.A.init");
    }
    public void cleanup() {
        // destruction logic
        System.out.println("Inside ru.egalvi.springtutorial.annotationconfig.A.cleanup");
    }
}
