package com.samples.alertsender;

import org.gradle.api.DefaultTask;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.TaskAction;

public class Greeting extends DefaultTask {

    Property<String> message = getProject().getObjects().property(String.class);

    @TaskAction
    void printMessage() {
        System.out.println(message.get());
    }
}