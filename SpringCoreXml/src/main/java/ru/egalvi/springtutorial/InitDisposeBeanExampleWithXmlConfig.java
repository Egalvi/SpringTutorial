package ru.egalvi.springtutorial;

public class InitDisposeBeanExampleWithXmlConfig {
    /*
In the case of XML-based configuration metadata, you can use the init-method attribute to specify the name of the method that has a void no-argument signature. For example:

<bean id="exampleBean"
         class="examples.ExampleBean" init-method="init"/>
     */
    public void init() throws Exception {
        System.out.println("init-method called");
    }

    /*
In the case of XML-based configuration metadata, you can use the destroy-method attribute to specify the name of the method that has a void no-argument signature. For example:

<bean id="exampleBean"
         class="examples.ExampleBean" destroy-method="destroy"/>
     */
    public void destroy() throws Exception {
        System.out.println("destroy-method called");
    }
}
