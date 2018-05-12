package com.example.ati.laborapp;


import org.robolectric.RuntimeEnvironment;
import org.robolectric.shadows.ShadowLog;

public class TestHelper {

	public static void setTestInjector() {
		ShadowLog.stream = System.out;
		CocktailsApplication application = (CocktailsApplication) RuntimeEnvironment.application;
		/*CocktailsApplicationComponent injector = DaggerTestComponent.builder().testModule(new TestModule(application.getApplicationContext())).build();
		application.setInjector(injector);*/
	}
}
