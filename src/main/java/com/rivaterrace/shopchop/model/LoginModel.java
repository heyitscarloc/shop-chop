package com.rivaterrace.shopchop.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LoginModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private String login;
	private String password;

}