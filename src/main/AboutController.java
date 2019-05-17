/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Desktop;
import java.net.URI;
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
public class AboutController implements Initializable {

    @FXML
    private Button fb;
    @FXML
    private Button instagram;
    @FXML
    private Button git;
    @FXML
    private Button twitter;
    @FXML
    private Button close;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void fb(ActionEvent event) {
          Desktop br=Desktop.getDesktop();
        try{
        br.browse(new URI("https://www.facebook.com/jamspatel.goti"));
        }catch(Exception e)
        {
            
        }
    }

    @FXML
    private void instagram(ActionEvent event) {
          Desktop br=Desktop.getDesktop();
        try{
        br.browse(new URI("https://www.instagram.com/call_me__jems_0/"));
        }catch(Exception e)
        {
            
        }
    }

    @FXML
    private void git(ActionEvent event) {
          Desktop br=Desktop.getDesktop();
        try{
        br.browse(new URI("https://github.com/jemis67"));
        }catch(Exception e)
        {
            
        }
    }

    @FXML
    private void twitter(ActionEvent event) {
        Desktop br=Desktop.getDesktop();
        try{
        br.browse(new URI("https://github.com/jemis67"));
        }catch(Exception e)
        {
            
        }
    }

    @FXML
    private void close(ActionEvent event) {
     
        
       main.HomeController.aboutstatus="hide";
       main.HomeController.aboutstage.close();
      
    }
    
}
