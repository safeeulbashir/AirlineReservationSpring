package airlinereservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@EntityScan("DB.DAO")
public class AirlinereservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlinereservationApplication.class, args);
	}
}
