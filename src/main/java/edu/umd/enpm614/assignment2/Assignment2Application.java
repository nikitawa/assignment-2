package edu.umd.enpm614.assignment2;

import edu.umd.enpm614.assignment2.application.WebApplication;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@SpringBootApplication
public class Assignment2Application implements ApplicationRunner {
	public static final String TASK_1_ENV = "task1";
	public static final String TASK_2_ENV = "task2";

	@Inject
	WebApplication webApplication;

	@Inject
	private ConfigurableEnvironment env;

	public static void main(String[] args) {
		// Change ENV string here to switch between StandardConfig and AdditionalConfig
		//Uncomment to run TASK_1

		//System.setProperty("spring.profiles.active", TASK_1_ENV);


		// Uncomment to run TASK_2
		 System.setProperty("spring.profiles.active", TASK_2_ENV);
		SpringApplication.run(Assignment2Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		webApplication.run();
	}
}
/*
@Aspect
@Component
public class LoggingAspect{

	//@Around("within(edu.umd.enpm614.assignment2..*)&& execution(* public)")




}
*/


