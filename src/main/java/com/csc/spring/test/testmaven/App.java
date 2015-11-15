package com.csc.spring.test.testmaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person)context.getBean("person");
        person.setTaxId("100");
        System.out.println(person);
        Person p2 = (Person)context.getBean("person2");
        System.out.println(p2);
        Address add=(Address)context.getBean("address2");
        System.out.println(add);
        ((ClassPathXmlApplicationContext)context).close();
    }
}
