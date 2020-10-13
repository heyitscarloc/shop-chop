package com.rivaterrace.shopchop.service;

import com.rivaterrace.shopchop.domain.User;
import com.rivaterrace.shopchop.dto.RegistrationDTO;

public interface UserService {

	User registerNewUserAccount(RegistrationDTO registrationDto);

}
