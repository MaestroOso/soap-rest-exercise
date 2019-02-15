package maestrooso.projects.soap.rest.webservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import maestrooso.projects.soap.rest.database.entities.CreditCard;
import maestrooso.projects.soap.rest.webservice.business.CreditCardBusiness;
import maestrooso.projects.soap.rest.webservice.models.CreditCardModel;

@RestController
@RequestMapping(path = "/creditcard")
public class CreditCardController {
	
	@Autowired
	private CreditCardBusiness creditCardBusiness;
	
	@GetMapping("/all")
	public List<CreditCard> getAll(){
		return creditCardBusiness.getAll();
	}
	
	@GetMapping("/{number}")
	public CreditCard findById(@PathVariable String number) {
		return creditCardBusiness.findById(number);
	}
	
	@PostMapping("/create")
	public String createCreditCard(@RequestBody CreditCardModel model) {
		return creditCardBusiness.createCreditCard(model);
	}
	
	@PostMapping("/update")
	public String updateCreditCard(@RequestBody CreditCardModel model) {
		return creditCardBusiness.updateCreditCard(model);
	}
	
	@PostMapping("/delete/{id}")
	public String deleteCreditCard(@PathVariable String number) {
		return creditCardBusiness.deleteCreditCard(number);
	}
	
}
