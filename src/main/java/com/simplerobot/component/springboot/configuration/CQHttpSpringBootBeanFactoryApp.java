package com.simplerobot.component.springboot.configuration;

import com.forte.component.forcoolqhttpapi.CoolQHttpApp;
import com.forte.component.forcoolqhttpapi.CoolQHttpConfiguration;
import com.forte.qqrobot.SimpleRobotApplication;
import com.forte.qqrobot.sender.MsgSender;
import com.forte.qqrobot.utils.CQCodeUtil;
import org.springframework.beans.factory.BeanFactory;

/**
 * @author <a href="https://github.com/ForteScarlet"> ForteScarlet </a>
 */
@SimpleRobotApplication(resources = "/application.properties")
public class CQHttpSpringBootBeanFactoryApp implements CoolQHttpApp {

    private BeanFactory beanFactory;


    public CQHttpSpringBootBeanFactoryApp(BeanFactory beanFactory){
        this.beanFactory = beanFactory;
    }

    @Override
    public void before(CoolQHttpConfiguration configuration) {
        // 整合Spring的DependGetter
        configuration.setDependGetter(new CQHttpSpringBootDependGetter(beanFactory));
    }

    @Override
    public void after(CQCodeUtil cqCodeUtil, MsgSender sender) { }
}
