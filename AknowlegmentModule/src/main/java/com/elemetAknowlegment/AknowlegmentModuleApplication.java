package com.elemetAknowlegment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;


@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class})
@EnableJpaRepositories("com.elemetAknowlegment.Repository")
public class AknowlegmentModuleApplication {

	public static void main(String[] args) {
SpringApplication.run(AknowlegmentModuleApplication.class, args);
		

}
}