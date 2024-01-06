module com.example.projpsmperform2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.projpsmperform2 to javafx.fxml;
    exports com.example.projpsmperform2;
}