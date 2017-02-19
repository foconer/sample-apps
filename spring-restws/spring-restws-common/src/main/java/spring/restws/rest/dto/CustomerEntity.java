package spring.restws.rest.dto;

public class CustomerEntity { 
  private String firstName;
  private String lastName;
	  
  public String getFirstName() {
	return firstName;
  }
  public CustomerEntity setFirstName(String firstName) {
	this.firstName = firstName;
	return this;
  }
	  
  public String getLastName() {
	return lastName;
  }
  public CustomerEntity setLastName(String lastName) {
      this.lastName = lastName;
      return this;
  }
}
