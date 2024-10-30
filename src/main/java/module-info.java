module com.androbohij {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.androbohij to javafx.fxml;
    exports com.androbohij;
}
