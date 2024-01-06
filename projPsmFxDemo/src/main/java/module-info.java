module com.example.projpsmfxdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.projpsmfxdemo to javafx.fxml;
    exports com.example.projpsmfxdemo;
}