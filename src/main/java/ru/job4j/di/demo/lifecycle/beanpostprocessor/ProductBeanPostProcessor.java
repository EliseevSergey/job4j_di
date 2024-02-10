package ru.job4j.di.demo.lifecycle.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import ru.job4j.di.demo.lifecycle.model.Product;

public class ProductBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        if (bean instanceof Product product) {
            System.out.printf("3. BeanPostProcessBeforeInitialization: '%s'%n", product);
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        if (bean instanceof Product product) {
            System.out.printf("5. BeanPostProcessAfterInitialization: '%s'%n", product);
        }
        return bean;
    }
}
