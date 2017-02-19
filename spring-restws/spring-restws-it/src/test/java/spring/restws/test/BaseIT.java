package spring.restws.test;

import javax.inject.Inject;

import org.junit.runner.RunWith;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import spring.restws.test.client.CustomerResourceTestClient;

@RunWith(SpringRunner.class)
@Import(value=BaseIT.ITConfiguration.class)
public class BaseIT {
  
  @Inject
  CustomerResourceTestClient customerTestClient;
  
  @Configuration
  public static class ITConfiguration {
    @Bean
    public CustomerResourceTestClient customerResourceTestClient() {
      return new CustomerResourceTestClient();
    }
  }
}
