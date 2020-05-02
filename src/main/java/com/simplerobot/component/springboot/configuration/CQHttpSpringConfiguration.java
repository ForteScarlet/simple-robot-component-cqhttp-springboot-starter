package com.simplerobot.component.springboot.configuration;

import com.forte.component.forcoolqhttpapi.CoolQHttpApplication;
import com.simplerobot.core.springboot.configuration.SpringBootDependGetter;
import com.simplerobot.core.springboot.configuration.SpringbootQQLogBack;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * cq http configuration
 */
@Configuration
public class CQHttpSpringConfiguration {

    @Bean
    public CQHttpSpringBootBeanFactoryApp getCQHttpApp(SpringBootDependGetter dependGetter) {
        return new CQHttpSpringBootBeanFactoryApp(dependGetter);
    }

    @Bean
    public CoolQHttpApplication getCQHttpApplication(SpringbootQQLogBack logBack) {
        return new CoolQHttpApplication(logBack.getLogBack());
    }

}
