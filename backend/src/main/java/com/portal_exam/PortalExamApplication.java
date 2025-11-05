package com.portal_exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.portal_exam.service.UserService;

@SpringBootApplication
public class PortalExamApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(PortalExamApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		System.err.println("STARTING CODE");

		// User user = new User();

		// user.setFirstName("alhanuf");
		// user.setLastName("allazzam");
		// user.setUsername("hnf.lz");
		// user.setPassword("123456");
		// user.setEmail("aaa@gmail.com");

		// Role role1 = new Role();
		// role1.setRoleId(44L);
		// role1.setRoleName("ADMIN");

		// Set<UserRole> userRoleSet = new HashSet<>();
		// UserRole userRole = new UserRole();

		// userRole.setRole(role1);
		// userRole.setUser(user);

		// userRoleSet.add(userRole);

		// User user1 = this.userService.createUser(user, userRoleSet);
		// System.err.println(user1.getUsername());

	}

}
