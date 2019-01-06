package com.org.togglz;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum CustomerFeatures implements Feature {

	/**
	 * Feature to display customer address. If the feature is true, display the
	 * address otherwise don't display.
	 */
	@EnabledByDefault
	@Label("Address Feature")
	FEATURE_ADDRESS,

	@Label("FirstName Feature")
	FEATURE_FIRST_NAME;

	/**
	 * Checks if the feature is active.
	 * 
	 * @return true is the feature is active, false otherwise
	 */
	public boolean isActive() {
		return FeatureContext.getFeatureManager().isActive(this);
	}

}
