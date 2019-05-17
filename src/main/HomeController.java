/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class HomeController implements Initializable {

    @FXML
    private Button about;
    @FXML
    private JFXButton home;
    @FXML
    private JFXButton view;
    @FXML
    private JFXButton edit;
    @FXML
    private JFXButton search;
    @FXML
    private JFXButton tools;
    @FXML
    private JFXButton user;
    @FXML
    private JFXButton setting;
    @FXML
    private JFXButton exit;
    @FXML
    private JFXButton notification;
    @FXML
    private BorderPane content;
    @FXML
    private BorderPane c;
    @FXML
    private Button close;
    @FXML
    private Button max;
    @FXML
    private Button min;
    @FXML
    public static Stage loginstage,aboutstage;
    @FXML
    public  static String screen="small",loginstaus="hide",aboutstatus="hide";
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
      
        // TODO
    }    

    @FXML
    private void about(ActionEvent event) {
              aboutstage=new Stage();
              if(aboutstatus.equals("hide"))
              {
              try{
                    System.out.println("Hiii");
                    Parent root = FXMLLoader.load(getClass().getResource("about.fxml"));
                    Scene scene = new Scene(root);
                    aboutstage.setScene(scene);
                    aboutstage.setScene(scene);
                    scene.setFill(Color.TRANSPARENT);
                    aboutstage.initStyle(StageStyle.TRANSPARENT);
                    aboutstage.show();
                    aboutstatus="show";
              }catch(Exception e)
              {
                  
              }
              }
              if(aboutstatus.equals("show"))
              {
             
              }
    }

    @FXML
    private void home(ActionEvent event) {
    }

    @FXML
    private void view(ActionEvent event) {
           try{
        Parent fxml = FXMLLoader.load(getClass().getResource("view.fxml"));
        content.getChildren().removeAll();
        
        content.setCenter(fxml);
    
        content.setAlignment(fxml, Pos.CENTER);
        }
        catch(Exception e){
            
        }
    }

    @FXML
    private void edit(ActionEvent event) {
         try{
        Parent fxml = FXMLLoader.load(getClass().getResource("edit.fxml"));
        content.getChildren().removeAll();
        content.setCenter(fxml);
        content.setAlignment(fxml, Pos.CENTER);
        }
        catch(Exception e){
            
        }
    }

    @FXML
    private void search(ActionEvent event) {
    }

    @FXML
    private void tools(ActionEvent event) {
    }

    @FXML
    private void setting(ActionEvent event) {
    }

    @FXML
    private void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void notification(ActionEvent event) {
    }
    @FXML
    private void user(ActionEvent event) {
        loginstage=new Stage();
        if(loginstaus.equals("hide"))
        {
              try{
                    System.out.println("Hiii");
                    Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
                    Scene scene = new Scene(root);
                    loginstage.setScene(scene);
                    loginstage.setScene(scene);
                    scene.setFill(Color.TRANSPARENT);
                    loginstage.initStyle(StageStyle.TRANSPARENT);
                    loginstage.show();
                    loginstaus="show";
              }catch(Exception e)
              {
                  
              }
        }
        if(loginstaus.equals("show"))
        {
            loginstage.requestFocus();
        }
    }
    @FXML
    private void close(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void max(ActionEvent event) {
          System.out.println("min....");
           Stage stage = (Stage)max.getScene().getWindow();
         // stage.setFullScreen(true);
          if(screen.equals("small")){
         stage.setMaximized(true);
        
     
         screen="full";
          }
          else if(screen.equals("full")){
              stage.setMaximized(false);
              screen="small";
          }
    }

    @FXML
    private void min(ActionEvent event) {
        Stage stage = (Stage)min.getScene().getWindow();
        stage.setIconified(true);
    }
    
}
