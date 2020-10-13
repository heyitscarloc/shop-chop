package com.rivaterrace.shopchop.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.rivaterrace.shopchop.validator.annotation.PasswordMatches;
import com.rivaterrace.shopchop.validator.annotation.ValidEmail;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
// Validator
@PasswordMatches
public class RegistrationDTO {
	@NotNull
	@NotEmpty
	private String firstName;

	@NotNull
	@NotEmpty
	private String lastName;

	@ValidEmail
	@NotNull
	@NotEmpty
	private String email;

	@NotNull
	@NotEmpty
	private String password;
	private String confirmPassword;

}
