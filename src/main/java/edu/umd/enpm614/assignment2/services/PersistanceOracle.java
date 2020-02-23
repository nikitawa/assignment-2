package edu.umd.enpm614.assignment2.services;

import edu.umd.enpm614.assignment2.interfaces.Persistance;
import org.springframework.stereotype.Component;

@Component
public class PersistanceOracle implements Persistance {
	@Override
	public String getType() {
		return "Oracle Persistance";
	}
	
	@Override
	public boolean run() {
		System.out.println("running " + this.getType());
		
		// invoke services here if applicable
		
		return true;
	}
}
