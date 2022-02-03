package com.philiance.main;

import java.util.Date;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.philiance.model.Particulier;
import com.philiance.service.ParticulierService;

@RestController
@ComponentScan(basePackages = "com.philiance.service")
@EnableJpaRepositories(basePackages = "com.philiance.repository")
@EntityScan(basePackages = { "com.philiance.model" })
public class ParticulierController {
	@Autowired
	private ParticulierService particulierService;
	
	@PostMapping(path="/particulier/addNew") // Map ONLY POST Requests
	  public @ResponseBody String addNewUser (
			  @RequestParam String fullName
			  , @RequestParam String phoneNumber
			  , @RequestParam String email
			  , @RequestParam int birthdate
			  , @RequestParam String firstName
			  , @RequestParam String lastName
	     ) {
	    // @ResponseBody means the returned String is the response, not a view name
	    // @RequestParam means it is a parameter from the GET or POST request
		
		ParticulierService particulierService = new ParticulierService();
		Particulier particulier = new Particulier();
		particulier.setFullName(fullName);
		particulier.setPhoneNumber(phoneNumber);
		particulier.setEmail(email);
		particulier.setBirthdate(birthdate);
		particulier.setFirstName(firstName);
		particulier.setLastName(lastName);
		particulier.setPlaceDate(new Date());
		particulierService.save(particulier);
		
	    return "Saved";
	  }
	
	@PostMapping("/particulier/add")
	public ResponseEntity<Particulier> save (@RequestBody Particulier particulier){
		particulierService.save(particulier);
		return new ResponseEntity<Particulier>(particulier, HttpStatus.OK);
	}
	
	@GetMapping("/particulier/findAll")
	public ResponseEntity<List<Particulier>> findAll() {
		List<Particulier> particuliers = particulierService.findAll();
		return new ResponseEntity<List<Particulier>>(particuliers, HttpStatus.OK);
	}
	
	@GetMapping("/particulier/find/{idPerson}") 
	public ResponseEntity<Particulier> findById (@PathVariable ("idPerson") String idPerson){
		Particulier particulier = particulierService.findById(idPerson);
		return new ResponseEntity<Particulier>(particulier, HttpStatus.OK);
	}
}
