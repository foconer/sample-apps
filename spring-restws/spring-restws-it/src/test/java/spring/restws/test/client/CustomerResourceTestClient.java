package spring.restws.test.client;

import org.springframework.web.client.RestTemplate;

import spring.restws.rest.dto.CustomerEntity;

public class CustomerResourceTestClient {
  
  private static final RestTemplate restTemplate = new RestTemplate();
  
  private static final String customerResourceTemplace = "http://localhost:8080/customer/%s";
  
  public CustomerEntity getCustomer(String name) {
	  return restTemplate.getForObject(String.format(customerResourceTemplace, name), CustomerEntity.class);
  }
}
