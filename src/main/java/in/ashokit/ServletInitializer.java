package in.ashokit;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SbRestAppApplication.class);
		int num = 10; 

		int num2 = 20;

		String name = "Sreee";
		
		int num3 = 30; 

		boolean status = false;
		int num10 = 1000; 
		double sal = 998875.78; 

		String university = "S V University"; 
		int num5 = 100; 
		int num50 = 50;

	}

}
