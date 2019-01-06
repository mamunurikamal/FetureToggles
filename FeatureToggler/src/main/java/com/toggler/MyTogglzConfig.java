package com.toggler;

import java.io.File;

import org.togglz.core.Feature;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.file.FileBasedStateRepository;
import org.togglz.core.user.FeatureUser;
import org.togglz.core.user.SimpleFeatureUser;
import org.togglz.core.user.UserProvider;

public class MyTogglzConfig implements TogglzConfig {

	@Override
	public UserProvider getUserProvider() {
		return new UserProvider() {
			@Override
			public FeatureUser getCurrentUser() {
				return new SimpleFeatureUser("admin", true);
			}
		};
	}

	@Override
	public Class<? extends Feature> getFeatureClass() {
// TODO Auto-generated method stub
		return MyFeatures.class;
	}

	@Override
	public StateRepository getStateRepository() {
// TODO Auto-generated method stub
		FileBasedStateRepository fileBasedStateRepository = new FileBasedStateRepository(
				new File("C:\\Users\\vmamunur.ORADEV\\eclipse-workspace\\FeatureToggler\\target\\spring-mvc-showcase\\resources\\features.properties"));
		return fileBasedStateRepository;
	}

}
