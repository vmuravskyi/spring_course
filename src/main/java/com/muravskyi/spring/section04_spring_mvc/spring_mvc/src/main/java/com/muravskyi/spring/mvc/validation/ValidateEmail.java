package com.muravskyi.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmailValidator.class)
public @interface ValidateEmail {

    String value() default "xyz.com";

    String message() default "Email must end with xyz.com";

    public Class<?> [] groups() default {};
    public Class<? extends Payload>[] payload() default {};

}
