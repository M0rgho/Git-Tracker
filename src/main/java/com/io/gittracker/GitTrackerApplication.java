package com.io.gittracker;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTrackerApplication {
    public static void main(String[] args) {
        Application.launch(UIApplication.class, args);
    }
}
