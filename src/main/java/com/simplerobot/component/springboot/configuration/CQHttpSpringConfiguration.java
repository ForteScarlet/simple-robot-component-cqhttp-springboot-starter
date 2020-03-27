package com.simplerobot.component.springboot.configuration;

import com.forte.component.forcoolqhttpapi.CoolQHttpApplication;
import com.simplerobot.core.springboot.configuration.SpringbootQQLogBack;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * cq http configuration
 */
@Configuration
public class CQHttpSpringConfiguration {

    @Bean
    public CQHttpSpringBootBeanFactoryApp getCQHttpApp(BeanFactory beanFactory) {
        return new CQHttpSpringBootBeanFactoryApp(beanFactory);
    }

    @Bean
    public CoolQHttpApplication getCQHttpApplication(SpringbootQQLogBack logBack) {
        return new CoolQHttpApplication(logBack.getLogBack());
    }

}
