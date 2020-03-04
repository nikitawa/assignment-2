package edu.umd.enpm614.assignment2.application;

import edu.umd.enpm614.assignment2.interfaces.Frontend;
import edu.umd.enpm614.assignment2.interfaces.Middleware;
import edu.umd.enpm614.assignment2.interfaces.Persistance;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Component
public class WebServer {
	private final Frontend frontend;
	private final Middleware middleware;
	private final Persistance persistance;

	@Inject
	public WebServer(@Named("edu.umd.enpm614.Frontend")Frontend frontend,@Named("edu.umd.enpm614.Middleware") Middleware middleware, @Named("edu.umd.enpm614.Persistence") Persistance persistance) {
		this.frontend = frontend;
		this.middleware = middleware;
		this.persistance = persistance;
	}
	
	public String getType() {
		return "WebServer";
	}

	public boolean run() {
		System.out.println("running " + this.getType());
		
		// invoke services here if applicable
		frontend.run();
		middleware.run();
		persistance.run();



		
		return true;
	}
}
