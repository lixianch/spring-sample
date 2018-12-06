package com.lixianch.spring.beans;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lixianch on 2018/12/6.
 */
public class BeansTest {
    @Test
    public void testBean(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        PersonService personService = (PersonService) context.getBean("personService");
        System.out.println(personService.getName());

    }
}
