package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.SsaWebRequest;
import in.ashokit.binding.SsaWebResponse;
import in.ashokit.service.SsaWebService;

@RestController
public class SsaWebRestController {

	@Autowired
	private SsaWebService service;
	
	@PostMapping("/ssn")
	public SsaWebResponse getCitizenInfo(@RequestBody SsaWebRequest req) {
		
		return service.getCitizenInfo(req);
		
	}
}