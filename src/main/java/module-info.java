module mp3player {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    exports app.mp3player.main to javafx.graphics;
    opens app.mp3player.controller to javafx.fxml;
}