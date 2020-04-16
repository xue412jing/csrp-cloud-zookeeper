package org.csrp.cloud.erueka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
//@SpringCloudApplication
@SpringBootApplication
@EnableEurekaServer
public class Erue_Application_7001 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(Erue_Application_7001.class, args);
    }
}
