package com.simplerobot.component.springboot.configuration;

import com.forte.component.forcoolqhttpapi.CoolQHttpApplication;
import com.forte.qqrobot.Application;
import com.forte.qqrobot.BaseApplication;
import com.simplerobot.core.springboot.configuration.SpringBootDependGetter;
import com.simplerobot.core.springboot.configuration.SpringbootQQLogBack;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * cq http configuration
 */
@Configuration
public class CQHttpSpringConfiguration {

    @Bean
    @ConditionalOnMissingBean(Application.class)
    public CQHttpSpringBootBeanFactoryApp getCQHttpApp(SpringBootDependGetter dependGetter) {
        return new CQHttpSpringBootBeanFactoryApp(dependGetter);
    }

    @Bean
    @ConditionalOnMissingBean(BaseApplication.class)
    public CoolQHttpApplication getCQHttpApplication(SpringbootQQLogBack logBack) {
        return new CoolQHttpApplication(logBack.getLogBack());
    }

}
