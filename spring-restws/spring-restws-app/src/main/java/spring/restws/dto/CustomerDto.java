package spring.restws.dto;

public class CustomerDto {
  
  private String firstName;
  private String lastName;
  
  public String getFirstName() {
	return firstName;
  }
  public CustomerDto setFirstName(String firstName) {
	this.firstName = firstName;
	return this;
  }
  
  public String getLastName() {
	return lastName;
  }
  public CustomerDto setLastName(String lastName) {
	this.lastName = lastName;
	return this;
  }
}
