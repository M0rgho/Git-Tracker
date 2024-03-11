package com.io.gittracker;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.springframework.stereotype.Component;
import org.springframework.context.ApplicationListener;

@Component
public class UIMain implements ApplicationListener<StageReadyEvent> {
    @Override
    public void onApplicationEvent(StageReadyEvent event) {
        Stage stage = event.getStage();
        Scene scene = new Scene(new GridPane());
        stage.setScene(scene);
        stage.show();
    }
}
