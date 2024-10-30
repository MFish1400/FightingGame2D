module com.example.fightinggame2d {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.fightinggame2d to javafx.fxml;
    exports com.example.fightinggame2d;
}