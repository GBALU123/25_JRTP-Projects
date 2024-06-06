package in.ashokit.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.Entity.Passport;
import in.ashokit.Entity.Person;
import in.ashokit.repo.PassportRepo;
import in.ashokit.repo.PersonRepo;

@Service
public class PersonService {

	@Autowired
	private PersonRepo personRepo;
	
	@Autowired
	private PassportRepo passportRepo;
	
	public void savePerson() {
		
		Person person = new Person();
		person.setPersonName("Balu");
		person.setPersonGender("Male");
		person.setPersonDOB(LocalDate.now().minusYears(20));
		
		Passport passport = new Passport();
		passport.setPassportNum("edfgluio");
		passport.setIssuedDate(LocalDate.now());
		passport.setExpdate(LocalDate.now().plusYears(10));
		
		// association
		person.setPassport(passport);
		passport.setPerson(person);
		
		// save parent
		personRepo.save(person);
		
	}
	public void getperson() {
		personRepo.findById(1);
		
	}
	public void getpassport() {
		passportRepo.findById(1);
		
	}
	public void deleteperson() {
		personRepo.deleteById(1);
	}
}
