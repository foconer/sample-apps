package spring.restws;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import spring.restws.rest.CustomerResource;

@Configuration
public class JerseyConfig extends ResourceConfig{
  public JerseyConfig() {
	  register(CustomerResource.class);
  }
}
