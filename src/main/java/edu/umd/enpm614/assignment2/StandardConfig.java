package edu.umd.enpm614.assignment2;

import edu.umd.enpm614.assignment2.interfaces.*;
import edu.umd.enpm614.assignment2.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import static edu.umd.enpm614.assignment2.Assignment2Application.TASK_1_ENV;

@Profile(TASK_1_ENV)
@Configuration
public class StandardConfig {

public static final String Frontend_standard = "edu.umd.enpm614.Frontend";
    public static final String Middleware_standard = "edu.umd.enpm614.Middleware";
    public static final String Persistence_standard = "edu.umd.enpm614.Persistence";
    public static final String Authentication_standard = "edu.umd.enpm614.Authentication";
    public static final String FileSystem_standard = "edu.umd.enpm614.FileSystem";
    public static final String Connection_standard = "edu.umd.enpm614.Connection";


    @Bean(name = Frontend_standard)
    public Frontend getFrontend()
    {
return new FrontendHTML(getAuthentication()) ;
}

    @Bean(name = Middleware_standard)
    public Middleware getMiddleware()
    {
        return new MiddlewareTomcat();
    }
    @Bean(name = Persistence_standard)
    public Persistance getPersistence()
    {
        return new PersistanceMySQL(getFileSystem(),getConnection());
    }

    @Bean(name = Authentication_standard)
    public Authentication getAuthentication()
    {
        return new AuthenticationSSL();
    }
    @Primary
    @Bean(name = FileSystem_standard)
    public FileSystem getFileSystem()
    {
        return new FileSystemNTFS();
    }
    @Bean(name = Connection_standard)
    public Connection getConnection()
    {
        return new ConnectionPooled();
    }

}

