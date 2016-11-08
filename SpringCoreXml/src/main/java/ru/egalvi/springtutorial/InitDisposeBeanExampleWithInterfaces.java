package ru.egalvi.springtutorial;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InitDisposeBeanExampleWithInterfaces
/*
The org.springframework.beans.factory.InitializingBean interface specifies a single method:
void afterPropertiesSet() throws Exception;
So you can simply implement above interface and initialization work can be done inside afterPropertiesSet() method
 */
        implements InitializingBean,
/*The org.springframework.beans.factory.DisposableBean interface specifies a single method:
void destroy() throws Exception;
So you can simply implement above interface and finalization work can be done inside destroy() method
 */
        DisposableBean {

    public void destroy() throws Exception {
        System.out.println("org.springframework.beans.factory.DisposableBean.destroy called");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("org.springframework.beans.factory.InitializingBean.afterPropertiesSet called");
    }
}
