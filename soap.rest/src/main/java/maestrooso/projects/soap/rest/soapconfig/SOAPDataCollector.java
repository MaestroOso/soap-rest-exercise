package maestrooso.projects.soap.rest.soapconfig;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import maestrooso.projects.soap.rest.database.entities.User;
import maestrooso.projects.soap.rest.database.repository.CreditCardRepository;
import maestrooso.projects.soap.rest.database.repository.MovementRepository;
import maestrooso.projects.soap.rest.database.repository.UserRepository;
import maestrooso.projects.soap.rest.soapclient.CreditCard;
import maestrooso.projects.soap.rest.soapclient.CreditCardGetByUserCodeRequest;
import maestrooso.projects.soap.rest.soapclient.CreditCardGetByUserCodeResponse;
import maestrooso.projects.soap.rest.soapclient.CreditCardWithMovements;
import maestrooso.projects.soap.rest.soapclient.Movement;
import maestrooso.projects.soap.rest.soapclient.MovementGetByCreditCardTokenRequest;
import maestrooso.projects.soap.rest.soapclient.MovementGetByCreditCardTokenResponse;
import maestrooso.projects.soap.rest.soapclient.MovementGetByUserCodeRequest;
import maestrooso.projects.soap.rest.soapclient.MovementGetByUserCodeResponse;
import maestrooso.projects.soap.rest.soapclient.UserLoginRequest;
import maestrooso.projects.soap.rest.soapclient.UserLoginResponse;

@Component
public class SOAPDataCollector {
	
	@Autowired 
	private SOAPConnector soap;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private MovementRepository movementRepository;
	
	@Autowired
	private CreditCardRepository creditCardRepository;
	
	private String url = "http://18.222.184.108:8080/ws/";
	
	public void retreiveData(String username, String password) {
		/**
		 *	User Login Info 
		 **/
		UserLoginRequest req = new UserLoginRequest();
		req.setUsername(username);
		req.setPassword(password);
		UserLoginResponse res = (UserLoginResponse)soap.callWebService(url, req);
		/** Store User on db */
		User newUser = new User(res.getUser().getFullname(), res.getUser().getCode(),
				res.getUser().getDocumentType().value(), res.getUser().getDocumentNumber());
		userRepository.save(newUser);
		/** Print on screen*/
		System.out.println("Datos del usuario: ");
		System.out.println(res.getUser().getFullname());
		System.out.println(res.getUser().getDocumentNumber());
		System.out.println(res.getUser().getCode());
		System.out.println(res.getUser().getDocumentType());
		
		
		/**
		 *  Credit Card by User Code 
		 **/
		CreditCardGetByUserCodeRequest creditCardReq = new CreditCardGetByUserCodeRequest();
		creditCardReq.setCode(res.getUser().getCode());
		CreditCardGetByUserCodeResponse creditCardRes = (CreditCardGetByUserCodeResponse)soap.callWebService(url, creditCardReq);
		
		System.out.println("Cantidad de Tarjetas del usuario: " + res.getUser().getFullname() +": "+ creditCardRes.getCreditCards().size());
		for(CreditCard c: creditCardRes.getCreditCards()) {
			/**Store Credit Card on db*/
			maestrooso.projects.soap.rest.database.entities.CreditCard newCC = 
					new maestrooso.projects.soap.rest.database.entities.CreditCard(c.getToken(),
							c.getNumber(),c.getExpDate(),c.getFranchise().value(), newUser.getDocumentNumber());
			creditCardRepository.save(newCC);
			/**Print on Console*/
			System.out.println("Tarjeta: " + c.getNumber() + ", " + c.getFranchise().value() + 
					", " + c.getExpDate() + ", " + c.getFranchise().value());
		}
		
		
		/**
		 *	Test Movement Get By User Code
		 **/
		MovementGetByUserCodeRequest movementUserReq = new MovementGetByUserCodeRequest();
		movementUserReq.setCode(res.getUser().getCode());
		MovementGetByUserCodeResponse movementUserRes = (MovementGetByUserCodeResponse)soap.callWebService(url, movementUserReq);;
		System.out.println("***********************");
		System.out.println("Cantidad de Tarjetas: " + movementUserRes.getCreditCards().size());
		for(CreditCardWithMovements c: movementUserRes.getCreditCards()) {
			System.out.println("Movimientos para la tarjeta " + c.getNumber());
			for(Movement m: c.getMovements()) {
				/**Store Movement on db*/
				java.util.Date dt = m.getDate().toGregorianCalendar().getTime();
				maestrooso.projects.soap.rest.database.entities.Movement newM = 
						new maestrooso.projects.soap.rest.database.entities.Movement(m.getAmount(), 
								new Date(dt.getTime()), m.getType().value(), c.getNumber());
				movementRepository.save(newM);
				/**Print on console*/
				System.out.println("Movimiento: " + m.getType().value() + " de " + m.getAmount() + " el " + m.getDate());
			}
		}
		
		/**
		 *	Test Movement Get By Credit Card Token
		 **/
		MovementGetByCreditCardTokenRequest movementTokenReq = new MovementGetByCreditCardTokenRequest();
		System.out.println("***********************");
		for(CreditCardWithMovements c: movementUserRes.getCreditCards()) {
			System.out.println("Movimientos por el token: " + c.getToken());
			movementTokenReq.setToken(c.getToken());
			MovementGetByCreditCardTokenResponse movementTokenRes = (MovementGetByCreditCardTokenResponse)soap.callWebService(url,  movementTokenReq);
			for(Movement m: movementTokenRes.getMovements()) {
				System.out.println("Movimiento: " + m.getType().value() + " de " + m.getAmount() + " el " + m.getDate());
			}
		}
	}
}
