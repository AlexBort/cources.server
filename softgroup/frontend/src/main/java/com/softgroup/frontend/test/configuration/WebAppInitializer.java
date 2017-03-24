package com.softgroup.frontend.test.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by User on 23.03.2017.
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{WebConfiguration.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{RestApplicationConfiguration.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
