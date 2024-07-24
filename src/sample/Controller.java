package sample;
/**
 * Sample Skeleton for 'sample.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;

public class Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="TitleLabel"
    private Label TitleLabel; // Value injected by FXMLLoader

    @FXML // fx:id="generatePasswordButton"
    private Button generatePasswordButton; // Value injected by FXMLLoader

    @FXML // fx:id="generatedPasswordTextArea"
    private TextArea generatedPasswordTextArea; // Value injected by FXMLLoader

    @FXML // fx:id="resetSettingsButton"
    private Button resetSettingsButton; // Value injected by FXMLLoader

    @FXML // fx:id="titleHorizontalSeparator"
    private Separator titleHorizontalSeparator; // Value injected by FXMLLoader

    @FXML
    void generatePassword(ActionEvent event) {
        event.consume();
        System.out.println("button is working");
    }

    @FXML
    void resetSettings(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert TitleLabel != null : "fx:id=\"TitleLabel\" was not injected: check your FXML file 'sample.fxml'.";
        assert generatePasswordButton != null : "fx:id=\"generatePasswordButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert generatedPasswordTextArea != null : "fx:id=\"generatedPasswordTextArea\" was not injected: check your FXML file 'sample.fxml'.";
        assert resetSettingsButton != null : "fx:id=\"resetSettingsButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert titleHorizontalSeparator != null : "fx:id=\"titleHorizontalSeparator\" was not injected: check your FXML file 'sample.fxml'.";

    }

}
