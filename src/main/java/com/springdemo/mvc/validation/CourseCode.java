package com.springdemo.mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    //define attributes

    //default course code
    public String value() default "LUV";

    //default message
    public String message() default "must start with LUV";

    //default group(not using here)
    public Class<?>[] groups() default {};

    //default payload(not using here)
    public Class<? extends Payload>[] payload() default {};
}
