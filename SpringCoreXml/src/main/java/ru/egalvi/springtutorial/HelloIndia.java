package ru.egalvi.springtutorial;


/*
Spring - Bean Definition Inheritance

A bean definition can contain a lot of configuration information, including constructor arguments, property values, and container-specific information such as initialization method, static factory method name, and so on.

A child bean definition inherits configuration data from a parent definition. The child definition can override some values, or add others, as needed.

Spring Bean definition inheritance has nothing to do with Java class inheritance but inheritance concept is same. You can define a parent bean definition as a template and other child beans can inherit required configuration from the parent bean.

When you use XML-based configuration metadata, you indicate a child bean definition by using the parent attribute, specifying the parent bean as the value of this attribute.
 */
public class HelloIndia {
    private String message;
    private String message2;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMessage2(String message) {
        this.message2 = message;
    }

    public void getMessage() {
        System.out.println("India Message1 : " + message);
    }

    public void getMessage2() {
        System.out.println("India Message2 : " + message2);
    }
}
