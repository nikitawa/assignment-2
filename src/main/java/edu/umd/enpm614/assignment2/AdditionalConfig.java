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
    public Frontend getFrontend_temp()
    {
        return new FrontendGWT(null);
    }

    @Bean(name = Middleware_additional)
    public Middleware getMiddleware_temp()
    {
        return new MiddlewareJBoss();
    }
    @Bean(name = Persistence_additional)
    public Persistance getPersistence_temp()
    {
        return new PersistanceOracle();
    }

    @Bean(name = Authentication_additional)
    public Authentication getAuthentication_temp()
    {
        return new AuthenticationTSL();
    }
    @Primary
    @Bean(name = FileSystem_additional)
    public FileSystem getFileSystem_temp()
    {
        return new FileSystemNFS();
    }
    @Bean(name = Connection_additional)
    public Connection getConnection_temp()
    {
        return new ConnectionJDBC();
    }




}
