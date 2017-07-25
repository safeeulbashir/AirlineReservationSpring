package DB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
@EnableAutoConfiguration
public class SpringMvcApplication extends SpringBootServletInitializer{

@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	return application.sources(SpringMvcApplication.class);
}
 
	public static void main(String[] args)
	{
		SpringApplication.run(SpringMvcApplication.class, args);

		//airlineReservationDAO.addFlightDetails(flightDetails);

	}
//	

}