package com.athira;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        /* ApplicationContext is required to create the Spring container
        To include ApplicationContext, we need spring-context dependency in the pom.xml
        BeanFactory not initialized or already closed
        Earlier version of Spring uses BeanFactory not ApplicationContext.
        XML configuration is required to make the BeanFactory usable and it can be done through spring.xml
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        //bean is not created unless we mention the bean in the spring.xml
        Laptop obj = context.getBean(Laptop.class);
        obj.compile();

    }
}
