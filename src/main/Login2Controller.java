/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class Login2Controller implements Initializable {

    @FXML
    private Button close;
    @FXML
    private Button min;
    @FXML
    private JFXTextField email;
    @FXML
    private JFXPasswordField pass;
    @FXML
    private JFXButton signin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void close(ActionEvent event) {
        Stage stage = (Stage)close.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void min(ActionEvent event) {
        Stage stage = (Stage)min.getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    private void signin(ActionEvent event) {
        if((email.getText()).equals("jemisgoti67@outlook.com") && (pass.getText().toString()).equals("255abcde"))
        {
            System.exit(0);
        }
        
    }
    
}
