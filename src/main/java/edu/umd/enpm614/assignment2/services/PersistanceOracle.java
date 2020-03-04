package edu.umd.enpm614.assignment2.services;

import edu.umd.enpm614.assignment2.interfaces.Connection;
import edu.umd.enpm614.assignment2.interfaces.FileSystem;
import edu.umd.enpm614.assignment2.interfaces.Persistance;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class PersistanceOracle implements Persistance {

	private final FileSystem fileSystem;
	private final Connection connection;
	@Inject
	public PersistanceOracle(FileSystem fileSystem,Connection connection) {
		this.fileSystem = fileSystem;
		this.connection=connection;

	}
	@Override
	public String getType() {
		return "Oracle Persistance";
	}
	
	@Override
	public boolean run() {
		System.out.println("running " + this.getType());
		fileSystem.run();
		connection.run();
		// invoke services here if applicable
		
		return true;
	}
}
