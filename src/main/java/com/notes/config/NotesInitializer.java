package com.notes.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class NotesInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class <?> [] configuration = {NotesAppConfig.class};
		System.out.println("Notes Initializer ...");
		return configuration;
	}

	@Override
	protected String[] getServletMappings() {
		String [] mapping = {"/"};
		return mapping;
	}

}
