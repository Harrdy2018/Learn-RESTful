package com.jingdong.config;

import com.jingdong.controller.WebService1;
import org.glassfish.jersey.server.ResourceConfig;

// 定义资源加载器
public class WebServiceConfig extends ResourceConfig {
    public WebServiceConfig() {
        // 方式一
//        register(WebService1.class);
        packages("com.jingdong.controller");
    }
}
