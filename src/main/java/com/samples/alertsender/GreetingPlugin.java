package com.samples.alertsender;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class GreetingPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        GreetingPluginExtension extension
                = project.getExtensions().create("greeting", GreetingPluginExtension.class, project);

        project.getTasks().create("hello", Greeting.class, greetinTask -> {
            greetinTask.message = extension.message;
        });
    }
}



/*
class GreetingPlugin implements Plugin<Project> {
    void apply(Project project) {
        def extension = project.extensions.create('greeting', GreetingPluginExtension, project)
        project.tasks.create('hello', Greeting) {
            message = extension.message
//            outputFiles = extension.outputFiles
        }
    }
}*/
