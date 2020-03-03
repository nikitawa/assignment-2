package edu.umd.enpm614.assignment2.services;

import edu.umd.enpm614.assignment2.interfaces.Authentication;
import edu.umd.enpm614.assignment2.interfaces.Frontend;
import edu.umd.enpm614.assignment2.interfaces.Middleware;
import edu.umd.enpm614.assignment2.interfaces.Persistance;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Component
public class FrontendHTML implements Frontend {


	private final Authentication authentication;
	@Inject
	public FrontendHTML(@Named("authenticationSSL") Authentication authentication) {
		this.authentication = authentication;

	}


	@Override
	public String getType() {
		return "HTML Frontend";
	}
	
	@Override
	public boolean run() {
		System.out.println("running " + this.getType());
		
		// invoke services here if applicable
		authentication.run();
		return true;
	}
}
