module com.bur1y.tts {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bur1y.tts to javafx.fxml;
    exports com.bur1y.tts;
}