package edu.umd.enpm614.assignment2.services;

import edu.umd.enpm614.assignment2.interfaces.Frontend;
import org.springframework.stereotype.Component;

@Component
public class FrontendGWT implements Frontend {
	@Override
	public String getType() {
		return "GWT Frontend";
	}
	
	@Override
	public boolean run() {
		System.out.println("running " + this.getType());
		
		// invoke services here if applicable
		
		return true;
	}
}