package com.muravskyi.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<ValidateEmail, String> {

    private String endOfEmail;

    @Override
    public void initialize(ValidateEmail validateEmail) {
        endOfEmail = validateEmail.value();
    }

    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext context) {
        return enteredValue.endsWith(endOfEmail);
    }

}
