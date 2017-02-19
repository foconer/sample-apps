package spring.restws.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import spring.restws.rest.dto.CustomerEntity;

public class CustomerResourceTest extends BaseIT {
	
  @Test
  public void testGetCustomer() {
    CustomerEntity customer = customerTestClient.getCustomer("Test");
    assertEquals("Test", customer.getFirstName());
  }
}
