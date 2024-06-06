package in.ashokit.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Role;
import in.ashokit.entity.User;
import in.ashokit.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	public void saveUser() {
		Role r1 = new Role();
		r1.setRoleName("Admin");
		
		Role r2 = new Role();
		r2.setRoleName("Manager");
		
		User u = new User();
		u.setUserName("Balu");
		u.setGender("Male");
		
		// set roles to user
		u.setRoles(Arrays.asList(r1,r2));
		
		// save parent
		userRepo.save(u);
		
	}
	
	
}
