package com.example.dmitrii.spring_practice;

import com.example.dmitrii.spring_practice.rockets.MyCustomAnnotation;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Method;

/**
 * @author Dmitrii Stepcenco
 * @created 03 September 2018
 **/

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(bean + " --postProcessBeforeInitialization()");
        Class<?> beanClass = beanName.getClass();
        Method[] beanClassMethods = beanClass.getMethods();
        for (Method beanClassMethod : beanClassMethods) {
            if(beanClassMethod.isAnnotationPresent(MyCustomAnnotation.class)){
                System.out.println("АННОТАЦИЯ НАШЛАСЬ В BeanPostProcessor");
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(bean + "postProcessAfterInitialization()");

        Class<?> beanClass = beanName.getClass();
        Method[] beanClassMethods = beanClass.getMethods();
        for (Method beanClassMethod : beanClassMethods) {
            if(beanClassMethod.isAnnotationPresent(MyCustomAnnotation.class)){
                System.out.println("АННОТАЦИЯ НАШЛАСЬ В BeanPostProcessor");
            }
        }
        return bean;
    }
}
