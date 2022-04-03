package io.joshuaphilips.securitywiththymleaf.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * User Registration Data Transfer Object*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationDto {
	private String firstName;
	private String lastName;
	private String email;
	private String password;

}
