package com.io.gittracker;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
public class UIApplication extends Application {
    private ConfigurableApplicationContext context;
    @Override
    public void init() {
        this.context = new SpringApplicationBuilder(GitTrackerApplication.class).run();
    }
    @Override
    public void start(Stage primaryStage) {
        this.context.publishEvent(new StageReadyEvent(primaryStage));
    }
    @Override
    public void stop() {
        context.close();
        Platform.exit();
    }
}