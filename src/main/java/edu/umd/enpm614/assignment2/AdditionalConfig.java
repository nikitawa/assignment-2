package edu.umd.enpm614.assignment2;

import edu.umd.enpm614.assignment2.application.WebApplication;
import edu.umd.enpm614.assignment2.interfaces.*;
import edu.umd.enpm614.assignment2.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import javax.inject.Inject;

import static edu.umd.enpm614.assignment2.Assignment2Application.TASK_2_ENV;

@Profile(TASK_2_ENV)
@Configuration
public class AdditionalConfig {
/*FrontendGWT
MiddlewareJBose
PersistenceOracle
AuthenticationTSL
FileSystemNFS
ConnectionJDBC
*/

    public static final String Frontend_additional = "edu.umd.enpm614.Frontend";
    public static final String Middleware_additional = "edu.umd.enpm614.Middleware";
    public static final String Persistence_additional = "edu.umd.enpm614.Persistence";
    public static final String Authentication_additional = "edu.umd.enpm614.Authentication";
    public static final String FileSystem_additional = "edu.umd.enpm614.FileSystem";
    public static final String Connection_additional = "edu.umd.enpm614.Connection";

    @Bean(name = Frontend_additional)
    public Frontend getFrontend()
    {
        return new FrontendHTML(getAuthentication()) ;
    }

    @Bean(name = Middleware_additional)
    public Middleware getMiddleware()
    {
        return new MiddlewareTomcat();
    }
    @Bean(name = Persistence_additional)
    public Persistance getPersistence()
    {
        return new PersistanceMySQL(getFileSystem(),getConnection());
    }

    @Bean(name = Authentication_additional)
    public Authentication getAuthentication()
    {
        return new AuthenticationSSL();
    }
    @Primary
    @Bean(name = FileSystem_additional)
    public FileSystem getFileSystem()
    {
        return new FileSystemNTFS();
    }
    @Bean(name = Connection_additional)
    public Connection getConnection()
    {
        return new ConnectionPooled();
    }




}
