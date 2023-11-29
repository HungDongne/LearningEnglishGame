module com.example.guessingwordgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.guessingwordgame to javafx.fxml;
    exports com.example.guessingwordgame;
}