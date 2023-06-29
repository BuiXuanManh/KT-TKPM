module com.example.msjavafxdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;

    opens com.example.msjavafxdemo to javafx.fxml;
    exports com.example.msjavafxdemo;
    exports com.example.msjavafxdemo.entity;
    opens com.example.msjavafxdemo.entity to javafx.fxml;
}