package com.xrh.onlineservice;

import com.xrh.onlineservice.filter.DemoFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xuruhong on 2017/9/21.
 */
@Configuration
public class WebConfig {
    @Bean
    public FilterRegistrationBean filterRegistrationBean(DemoFilter demoFilter){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(demoFilter);
        filterRegistrationBean.setEnabled(true);
        filterRegistrationBean.addUrlPatterns("/bb");
        return filterRegistrationBean;
    }
}
