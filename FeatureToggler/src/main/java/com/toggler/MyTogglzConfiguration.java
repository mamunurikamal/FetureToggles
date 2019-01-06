package com.toggler;
import org.springframework.stereotype.Component;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.manager.FeatureManagerBuilder;
import org.togglz.core.repository.mem.InMemoryStateRepository;
import org.togglz.core.spi.FeatureManagerProvider;

@Component
    public class MyTogglzConfiguration implements FeatureManagerProvider {
    
	 private static FeatureManager featureManager;

	    @Override
	    public int priority() {
	        return 30;
	    }

	    @Override
	    public synchronized FeatureManager getFeatureManager() {

	        if (featureManager == null) {
	            featureManager = new FeatureManagerBuilder()
	                    .featureClass(MyFeatures.class)
	                    .stateRepository(new InMemoryStateRepository())
	                    .togglzConfig(new MyTogglzConfig())
	                    .build();
	        }

	        return featureManager;

	    }
    }