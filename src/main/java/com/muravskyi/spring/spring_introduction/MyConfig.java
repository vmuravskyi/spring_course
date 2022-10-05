package com.muravskyi.spring.spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("com.muravskyi.spring.spring_introduction")
public class MyConfig {

    @Bean
    @Scope("singleton")
//    @Scope("prototype")
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }

}
