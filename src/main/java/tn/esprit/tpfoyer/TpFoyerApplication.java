package tn.esprit.tpfoyer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"entities"})
public class TpFoyerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TpFoyerApplication.class, args);
	}

}
