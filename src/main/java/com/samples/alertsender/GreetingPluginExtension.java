package com.samples.alertsender;

import org.gradle.api.Project;
import org.gradle.api.provider.Property;


public class GreetingPluginExtension {

    final Property<String> message;

    GreetingPluginExtension(Project project) {
        message = project.getObjects().property(String.class);
        message.set("Hello from GreetingPlugin");
    }
}

