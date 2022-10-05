package com.muravskyi.spring.spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("myApp.properties")
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
