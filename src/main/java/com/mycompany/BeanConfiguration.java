package com.mycompany;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = {"com.mycompany.jukebox"}, lazyInit = true)
public class BeanConfiguration {
}
