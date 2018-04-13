package com.schoolcloudy.web;

import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.schoolcloudy.web.configuration.DataSourceConfig;
import com.schoolcloudy.web.mvc.DispatcherConfiguration;


public class AppAnnotationDispatcherInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {DataSourceConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {DispatcherConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/"};
	}
	
	@Override
	protected WebApplicationContext createRootApplicationContext() {
	    WebApplicationContext context = (WebApplicationContext)super.createRootApplicationContext();
	    ((ConfigurableEnvironment)context.getEnvironment()).setActiveProfiles("prod");
	    return context;
	}

}
