package maestrooso.projects.soap.rest.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import maestrooso.projects.soap.rest.payment.UserLoginRequest;
import maestrooso.projects.soap.rest.payment.UserLoginResponse;

public class UserLoginSOAP  extends WebServiceGatewaySupport{
	/*
	 * https://spring.io/guides/gs/consuming-web-service/
	 * https://howtodoinjava.com/spring-boot/spring-soap-client-webservicetemplate/
	 * https://docs.spring.io/spring-ws/site/apidocs/org/springframework/ws/client/core/WebServiceTemplate.html
	 */
	
	private static final Logger log = LoggerFactory.getLogger(UserLoginSOAP.class);
	
	public UserLoginResponse login(String username, String password){
		UserLoginRequest request = new UserLoginRequest();
		request.setUsername(username);
		request.setPassword(password);
		
		UserLoginResponse response = (UserLoginResponse) getWebServiceTemplate()
				.marshalSendAndReceive("http://localhost:8080/ws/countries", request,
						new SoapActionCallback(
								"http://spring.io/guides/gs-producing-web-service/GetCountryRequest"));

		return response;
	}
}
