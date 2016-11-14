package com.ge.hc.cloud.app.analytics.poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by 212476263 on 2016.11.11..
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.ge.hc.cloud.app.analytics.poc"})
public class Application {
    public static void main( String[] args ) {
        SpringApplication.run( Application.class, args );
    }
}
