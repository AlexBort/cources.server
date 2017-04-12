package com.softgroup.frontend.test.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by User on 23.03.2017.
 */


@Configuration
@ComponentScan(basePackages = {
        "com.softgroup.frontend.test"})
public class RestApplicationConfiguration  {
}
