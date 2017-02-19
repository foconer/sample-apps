package spring.restws.test.client;

import static java.lang.String.format;

import org.springframework.web.client.RestTemplate;

import spring.restws.rest.dto.CustomerEntity;

public class CustomerResourceTestClient {
  
  private static final String REQUEST_URL_TEMPLATE = "http://localhost:8080/customer/%s";
  
  public CustomerEntity getCustomer(String name) {
    return (new RestTemplate()).getForObject(format(REQUEST_URL_TEMPLATE, name), CustomerEntity.class);
  }
}
