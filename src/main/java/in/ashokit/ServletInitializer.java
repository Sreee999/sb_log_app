package in.ashokit;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SbRestAppApplication.class);
		
		
		int empId = 111;
		String name = "Siva";
		double sal = 99999.95;
		

	}

}
