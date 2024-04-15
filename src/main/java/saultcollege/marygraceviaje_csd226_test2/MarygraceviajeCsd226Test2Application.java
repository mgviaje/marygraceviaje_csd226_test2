package saultcollege.marygraceviaje_csd226_test2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

//@SpringBootApplication
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class MarygraceviajeCsd226Test2Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext app = SpringApplication.run(MarygraceviajeCsd226Test2Application.class, args);
	}


}

//@SpringBootApplication
//public class MarygraceviajeCsd226Test2Application {
//
//	public static void main(String[] args) {
//		SpringApplication.run(MarygraceviajeCsd226Test2Application.class, args);
//	}
//
//}
