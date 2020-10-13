package com.rivaterrace.shopchop.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.rivaterrace.shopchop.dto.RegistrationDTO;
import com.rivaterrace.shopchop.validator.annotation.PasswordMatches;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatches, Object> {

	@Override
	public void initialize(PasswordMatches constraintAnnotation) {

	}

	@Override
	public boolean isValid(Object obj, ConstraintValidatorContext context) {
		RegistrationDTO registrationDto = (RegistrationDTO) obj;
		return registrationDto.getPassword().equals(registrationDto.getConfirmPassword());
	}

}
