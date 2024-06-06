package in.ashokit.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Address;
import in.ashokit.entity.Employee;
import in.ashokit.repo.AddressRepo;
import in.ashokit.repo.EmployeeRepo;

@Service
public class EmpServie {
	@Autowired
	private EmployeeRepo empRepo;
	
	@Autowired
	private AddressRepo addrRepo;
	
     public void saveEmp() {
    	 
    	 // one emp  can have multiple addresses
    	 
    	 Address a1 = new Address();
    	 
    	 a1.setCity("GNT");
    	 a1.setState("AP");
    	 a1.setCountry("INDIA");
    	 a1.setAddrType("permanent");
    	 
    	 Address a2 = new Address();
    	 
    	 a2.setCity("HYD");
    	 a2.setState("TG");
    	 a2.setCountry("INDIA");
    	 a2.setAddrType("present");
    	 
          Employee e = new Employee();
          e.setEmpName("Balu");
          e.setEmpSalary(50000.00);
          
          //associate emp with addresses
          a1.setEmp(e);
          a2.setEmp(e);
          
    	 // associate addresses with emp
          e.setAddr(Arrays.asList(a1,a2));
          
          // save parent record
          empRepo.save(e);
          
     }
     public void getEmployee() {
    	 empRepo.findById(1);
    	 
     }
     public void getAddress() {
    	 addrRepo.findById(1);
    	 
     }
     public void deleteEmp() {
    	 empRepo.deleteById(1);
     }
}
