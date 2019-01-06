package com.toggler;
import javax.servlet.ServletContext;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class WebAppInitializer implements WebApplicationInitializer  {
    
        @Override
        public void onStartup(ServletContext servletContext) {
        	AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
           // rootContext.register(Configurations.class);
           // rootContext.refresh();

            servletContext.addListener(new ContextLoaderListener(rootContext));
        
        servletContext.setInitParameter("org.togglz.FEATURE_MANAGER_PROVIDED", "true");
        }
        
    
     }