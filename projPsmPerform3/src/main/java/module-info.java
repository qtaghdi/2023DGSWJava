module com.example.projpsmperform3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.projpsmperform3 to javafx.fxml;
    exports com.example.projpsmperform3;
}