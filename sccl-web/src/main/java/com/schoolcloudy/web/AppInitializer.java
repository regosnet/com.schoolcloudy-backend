 /*
package com.schoolutils.web;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.schoolutils.web.configuration.DataSourceConfig;
import com.schoolutils.web.configuration.DispatcherConfiguration;

public class AppInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext container) throws ServletException {
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(DataSourceConfig.class);
		rootContext.register(DispatcherConfiguration.class);
		container.addListener(new ContextLoaderListener(rootContext));
		container.setInitParameter("spring.profiles.active", "prod");
		
		ServletRegistration.Dynamic dispatcher = container.addServlet("dispatcher", new DispatcherServlet(rootContext));
		dispatcher.setLoadOnStartup(1);
	    dispatcher.addMapping("/");	
	}
	
}
*/