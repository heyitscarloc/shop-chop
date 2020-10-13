package com.rivaterrace.shopchop.validator.annotation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.rivaterrace.shopchop.validator.PasswordMatchesValidator;

@Target({ TYPE, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = PasswordMatchesValidator.class)
public @interface PasswordMatches {
	String Message() default "Passwords don't match";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
