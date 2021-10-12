module com.bur1y.tts {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.sun.jna;
    requires com.sun.jna.platform;
    requires com.flexganttfx.core;
    requires com.flexganttfx.extras;
    requires com.flexganttfx.model;
    requires com.flexganttfx.view;
    requires license4j;
    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.materialdesign;

    opens com.bur1y.tts.AdminModule to javafx.fxml;
    exports com.bur1y.tts.AdminModule;
    exports com.bur1y.tts.functions;
}