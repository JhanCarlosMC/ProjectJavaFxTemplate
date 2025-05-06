module co.edu.uniquindio.projectjavafxtemplate {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.projectjavafxtemplate to javafx.fxml;
    exports co.edu.uniquindio.projectjavafxtemplate;

    opens co.edu.uniquindio.projectjavafxtemplate.controller to javafx.fxml;
    exports co.edu.uniquindio.projectjavafxtemplate.controller;

    opens co.edu.uniquindio.projectjavafxtemplate.viewcontroller to javafx.fxml;
    exports co.edu.uniquindio.projectjavafxtemplate.viewcontroller;

    opens co.edu.uniquindio.projectjavafxtemplate.model to javafx.fxml;
    exports co.edu.uniquindio.projectjavafxtemplate.model;
}