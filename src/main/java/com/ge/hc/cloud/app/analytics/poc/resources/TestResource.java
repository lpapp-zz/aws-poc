package com.ge.hc.cloud.app.analytics.poc.resources;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 212476263 on 2016.11.11..
 */
@RestController
public class TestResource {

    @RequestMapping( value = "/health", method = RequestMethod.GET )
    @ResponseStatus( code = HttpStatus.OK )
    public void info() {
        try {
            Thread.sleep( 1000 );
        } catch ( InterruptedException e ) {
            e.printStackTrace();
        }
    }

}
