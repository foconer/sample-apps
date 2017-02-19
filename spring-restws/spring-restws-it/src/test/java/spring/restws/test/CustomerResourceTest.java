package spring.restws.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import spring.restws.rest.dto.CustomerEntity;
import spring.restws.test.client.CustomerResourceTestClient;

public class CustomerResourceTest {
	
  private static final CustomerResourceTestClient client = new CustomerResourceTestClient();
	
  @Test
  public void testGetCustomer() {
    CustomerEntity customer = client.getCustomer("Test");
    assertEquals("Test", customer.getFirstName());
  }
}
