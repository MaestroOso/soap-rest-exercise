package maestrooso.projects.soap.rest;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

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

import maestrooso.projects.soap.rest.soapconfig.SOAPConnector;
import maestrooso.projects.soap.rest.soapconfig.SOAPDataCollector;


@SpringBootApplication
@ComponentScan
public class Application {
	
	@Autowired 
	SOAPConnector soap;
	
	@Autowired
	SOAPDataCollector dataCollector;

	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
	@PostConstruct
	public void printInfo() {
		dataCollector.retreiveData("lola", "lola1");
		dataCollector.retreiveData("karen", "karen2");
	}
	
}

