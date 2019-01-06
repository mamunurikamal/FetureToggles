package com.toggler;
import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum MyFeatures implements Feature {
    

        @Label("Offers Feature")
        OFFERS_CONFIGURATION,
    
        @EnabledByDefault
        @Label("Refer an Employee Feature")
        REFER_AN_EMPLOYEE,
        
        @Label("Refer a Candidate Feature")
        REFER_A_CANDIDATE;
    
        public boolean isActive() {
            return FeatureContext.getFeatureManager().isActive(this);
        }
        
    }
