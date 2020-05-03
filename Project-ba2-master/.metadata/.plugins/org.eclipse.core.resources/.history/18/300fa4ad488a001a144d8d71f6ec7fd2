package com.cts.ba2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	Set pc=new HashSet<String>(Arrays.asList("Application/json"));
	
	
	public static final Contact DEFAULT_CONTACT = new Contact("Divrit Saini", "8222055777", "Divrit.saini@cognizant.com");
	  public static final ApiInfo DEFAULTapiInfo= new ApiInfo("Employee Api Documentation", "Employee Documentation", "1.0", "urn:tos",
	          DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0");
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(DEFAULTapiInfo).produces(pc).consumes(pc);
	}

}
