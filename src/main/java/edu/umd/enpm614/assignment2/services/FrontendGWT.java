package edu.umd.enpm614.assignment2.services;

import edu.umd.enpm614.assignment2.interfaces.Authentication;
import edu.umd.enpm614.assignment2.interfaces.Frontend;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Component
public class FrontendGWT implements Frontend {

	private final Authentication authentication;
	@Inject
	public FrontendGWT(Authentication authentication) {
		this.authentication = authentication;

	}
	@Override
	public String getType() {
		return "GWT Frontend";
	}
	
	@Override
	public boolean run() {
		System.out.println("running " + this.getType());

		authentication.run();
		// invoke services here if applicable
		
		return true;
	}
}
