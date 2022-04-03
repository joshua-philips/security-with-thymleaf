package io.joshuaphilips.securitywiththymleaf.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import io.joshuaphilips.securitywiththymleaf.model.User;
import io.joshuaphilips.securitywiththymleaf.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto userRegistrationDto);

}
