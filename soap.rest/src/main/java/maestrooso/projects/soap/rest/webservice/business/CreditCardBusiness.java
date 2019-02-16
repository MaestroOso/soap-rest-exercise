package maestrooso.projects.soap.rest.webservice.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import maestrooso.projects.soap.rest.database.entities.CreditCard;
import maestrooso.projects.soap.rest.database.repository.CreditCardRepository;
import maestrooso.projects.soap.rest.webservice.core.Messages;
import maestrooso.projects.soap.rest.webservice.models.CreditCardModel;

@Component
public class CreditCardBusiness {

	@Autowired
	private CreditCardRepository creditCardRepository;
	
	public List<CreditCard> getAll(){
		return creditCardRepository.findAll();
	}
	
	public CreditCard findById(String number) {
		return creditCardRepository.findOneByNumber(number);
	}
	
	public String createCreditCard(CreditCardModel model) {
		CreditCard newCC = new CreditCard();
		newCC.setExpDate(model.getExpDate());
		newCC.setFranchise(model.getFranchise());
		newCC.setNumber(model.getNumber());
		newCC.setToken(model.getToken());
		creditCardRepository.save(newCC);
		return Messages.Succesful;
	}
	
	public String updateCreditCard(CreditCardModel model) {
		CreditCard newCC = creditCardRepository.findOneByNumber(model.getNumber());
		if(newCC != null) {
			newCC.setExpDate(model.getExpDate());
			newCC.setFranchise(model.getFranchise());
			newCC.setToken(model.getToken());
			creditCardRepository.save(newCC);
			return Messages.Succesful;
		}
		return Messages.Error;
	}
	
	public String deleteCreditCard(String number) {
		CreditCard newCC = creditCardRepository.findOneByNumber(number);
		if(newCC != null) {
			creditCardRepository.delete(newCC);
			return Messages.Succesful;
		}
		return Messages.Error;
	}
	
	public List<CreditCard> findByUserDocumentNumber(String number){
		return creditCardRepository.findByUserDocumentNumber(number);
	}
}
