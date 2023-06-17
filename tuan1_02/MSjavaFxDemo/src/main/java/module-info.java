module com.example.msjavafxdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.msjavafxdemo to javafx.fxml;
    exports com.example.msjavafxdemo;
}