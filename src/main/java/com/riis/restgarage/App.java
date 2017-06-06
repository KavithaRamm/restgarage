package com.riis.restgarage;

import com.riis.restgarage.resource.FilledSlots;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;


public class App extends Application<RestGarageConfiguration>
{
	public static void main(String[] args) throws Exception {
		new App().run(args);
	}

	@Override
	public void run(RestGarageConfiguration configuration, Environment environment) throws Exception {
		environment.jersey().register(new FilledSlots());
		
	}

}
