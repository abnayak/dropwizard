package com.yammer.demo;

import com.yammer.demo.resources.HelloWorldResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

/**
 * Created by abhijeet on 5/22/2016.
 */
public class SampleService extends Service<SampleConfiguration> {
    public static void main (String[] args) throws Exception {
        new SampleService().run(args);
    }

    public void initialize (final Bootstrap<SampleConfiguration> bootstrap) {

    }

    public void run (final SampleConfiguration sampleConfiguration, final Environment environment) throws Exception {
        environment.addResource(new HelloWorldResource());
    }
}
