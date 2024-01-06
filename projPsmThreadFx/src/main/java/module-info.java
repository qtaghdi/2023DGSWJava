module com.example.projPsmThreadFx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.projpsmthreadfx to javafx.fxml;
    exports com.example.projpsmthreadfx.;
    exports com.example.demo;
    opens com.example.projpsmthreadfx to javafx.fxml;
}