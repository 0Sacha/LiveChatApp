package com.example.co26seq07projet_bilan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class InChatController {

    @FXML
    private Button ExitButton;

    @FXML
    private Button accountButton;

    @FXML
    public TextField inputInChatMessageTextField;

    @FXML
    private HBox menuNavBarHbox;

    @FXML
    private Button sendButton;

    @FXML
    private Label theNameOfConvLabel;

    @FXML
    void onAccountClickButton(ActionEvent event) {

    }

    @FXML
    void onExitClickButton(ActionEvent event) throws IOException {
        Scene dataScene = HelloApplication.loadChatMenuScene();
        HelloApplication.getInstance().getChangeStage().setScene(dataScene);
    }

    @FXML
    void onInputMessageTextField(InputMethodEvent event) {

    }

    @FXML
    void onSendClickButton(ActionEvent event) {
        inputInChatMessageTextField.getText();
    }

}
