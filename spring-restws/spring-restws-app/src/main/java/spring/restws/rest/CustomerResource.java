package spring.restws.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import spring.restws.dto.CustomerDto;

@Path("/customer")
public class CustomerResource {
	
	@GET
	@Produces("application/json")
	@Path("{firstname}")
	public CustomerDto getCustomer(@PathParam("firstname") String firstname) {
		return new CustomerDto().setFirstName(firstname).setLastName("Last Name");
	}
}
