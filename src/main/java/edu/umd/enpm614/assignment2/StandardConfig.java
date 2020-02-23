package edu.umd.enpm614.assignment2;

import edu.umd.enpm614.assignment2.application.WebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.inject.Inject;

import static edu.umd.enpm614.assignment2.Assignment2Application.TASK_1_ENV;

@Profile(TASK_1_ENV)
@Configuration
public class StandardConfig {
}
