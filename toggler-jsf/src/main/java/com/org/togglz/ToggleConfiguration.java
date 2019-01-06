package com.org.togglz;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Component;
import org.togglz.core.Feature;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.file.FileBasedStateRepository;
import org.togglz.core.user.FeatureUser;
import org.togglz.core.user.SimpleFeatureUser;
import org.togglz.core.user.UserProvider;

@Component
public class ToggleConfiguration implements TogglzConfig {

    /**
     * Retrieves the Togglz feature enum to be used.
     * 
     * @return the feature enum, <tt>CustomerFeatures</tt>
     */
    public Class<? extends Feature> getFeatureClass() {
	return CustomerFeatures.class;
    }

    /**
     * Retrieves the persistence repository to be used by Togglz to save the
     * feature state.
     * 
     * @return the repository used for storing Togglz feature state
     */
    public StateRepository getStateRepository()  {
	File tmp = null;
	try {
	    tmp = File.createTempFile("features", "properties");
	} catch (IOException e) {
	    e.printStackTrace();
	}
	return new FileBasedStateRepository(tmp);
    }

    /**
     * Retrieves the user provider used for logging on to Togglz console. This
     * method is only only called once by Togglz.
     * 
     * @return the feature user provider
     */
    public UserProvider getUserProvider() {
	return new UserProvider() {
	    public FeatureUser getCurrentUser() {
		return new SimpleFeatureUser("admin", true);
	    }
	};
    }
}
