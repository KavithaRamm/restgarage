package com.riis.restgarage;

import com.riis.restgarage.resource.FilledSlots;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

/**
 * Hello world!
 *
 */
public class App extends Application
{
	public static void main(String[] args) throws Exception {
		new App().run(args);
	}

	@Override
	public void run(Configuration configuration, Environment environment) throws Exception {
		environment.jersey().register(new FilledSlots());
		
	}

}
