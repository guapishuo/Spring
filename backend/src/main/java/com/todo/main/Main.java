package com.todo.main;

import com.todo.pojo.JuiceMaker;
import com.todo.pojo.JuiceMaker2;
import com.todo.processor.BeanPostProcessorImp;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
       ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-cfg.xml");

       JuiceMaker2 juiceMaker2 = (JuiceMaker2) ctx.getBean("juiceMaker2");

        System.out.println(juiceMaker2.makeJuice());

        ctx.close();
    }
}
