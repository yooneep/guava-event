package com.example.demo.advance;

import com.google.common.eventbus.Subscribe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @ClassName: EventBusPostProcessor
 * @Description: EventBusPostProcessor
 * @Author: qiaozhi@58.com
 * @Date: 2020/1/2 17:06
 * @Version: 1.0
 **/
@Service
public class EventBusPostProcessor implements BeanPostProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(EventBusPostProcessor.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // for each method in the bean
        Method[] methods = bean.getClass().getMethods();
        for (Method method : methods) {
            // check the annotations on that method
            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
                // if it contains the Subscribe annotation
                if (annotation.annotationType().equals(Subscribe.class)) {
                    // 检查到bean声明了Guava EventBus Subscribe注解, 则自动注册到全局的EventBus上
                    EventBusFactory.getDefault().eventBus().register(bean);
                    LOGGER.info("Bean " + beanName + "  was subscribed to EventBus");
                    // we only need to register once
                    return bean;
                }
            }
        }

        return bean;
    }

}
