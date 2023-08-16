module GitHubCarProj {
    requires javafx.controls;
    requires javafx.fxml;

    opens CarApplication.User to javafx.fxml;


    exports CarApplication.User.Controllers;
    opens CarApplication.User.Controllers to javafx.fxml;

    exports CarApplication.User.List;
    opens CarApplication.User.List to javafx.fxml;

    opens CarApplication.Cars to javafx.fxml;
    exports CarApplication.Cars;

    opens CarApplication.Cars.Controllers to javafx.fxml;
    exports CarApplication.Cars.Controllers;

    opens CarApplication.Cars.CarTypes to javafx.fxml;
    exports CarApplication.Cars.CarTypes;

}