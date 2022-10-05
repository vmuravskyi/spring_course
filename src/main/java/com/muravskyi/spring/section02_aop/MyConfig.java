package com.muravskyi.spring.section02_aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.muravskyi.spring.section02_aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
