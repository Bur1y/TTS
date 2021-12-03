open module com.bur1y.tts {
    requires com.sun.jna;
    requires com.sun.jna.platform;

    requires java.persistence;
    requires java.naming;
    requires java.sql;
    requires org.hibernate.orm.core;

    exports com.bur1y.tts.App;
    exports com.bur1y.tts.Check;
    exports com.bur1y.tts.Window;

}