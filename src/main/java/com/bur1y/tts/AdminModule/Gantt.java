package com.bur1y.tts.AdminModule;

import com.flexganttfx.view.GanttChart;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Gantt extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // <- Our Gantt chart
        GanttChart<?> gantt = new GanttChart<>();

        Scene scene = new Scene(gantt);

        stage.setScene(scene);
        stage.setTitle("Time Tracking System");
        stage.centerOnScreen();
        stage.sizeToScene();
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}