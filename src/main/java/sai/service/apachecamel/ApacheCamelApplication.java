package sai.service.apachecamel;

import org.apache.camel.CamelContext;
import org.apache.camel.RoutesBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApacheCamelApplication {

	private  final CamelContext camelContext;

	public ApacheCamelApplication (CamelContext camelContext){
		this.camelContext = camelContext;
	}


	public static void main(String[] args) {
		SpringApplication.run(ApacheCamelApplication.class, args);

	}

}
