package com.appsmith.server.solutions;

import com.appsmith.server.services.FeatureFlagService;
import com.appsmith.server.solutions.ce.ScheduledTaskCEImpl;

public class ScheduledTaskImpl extends ScheduledTaskCEImpl implements ScheduledTask {
    public ScheduledTaskImpl(FeatureFlagService featureFlagService) {
        super(featureFlagService);
    }
}