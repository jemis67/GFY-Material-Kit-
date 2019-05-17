/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.mysql.cj.Messages;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.sql.*;
/**
 * FXML Controller class
 *
 * @author admin
 */
public class loginController implements Initializable {

    @FXML
    private BorderPane parent;
    @FXML 
    private JFXTextField uid;
    @FXML
    private JFXPasswordField pass;
    @FXML 
    private JFXButton siginin;
    @FXML
    private JFXButton reset;
    @FXML
    private JFXButton cancel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void siginin(ActionEvent event) {
           System.out.println("hiii login"+uid.getText()+":"+pass.getText().toString());
           try{
           Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
           Connection con=DriverManager.getConnection("jdbc:derby:database/user;create=true");
               System.out.println("con");
           String sql="create table user (user varchar(20),pass varchar(20))";
           String sql1="select * user";
           String sql2="insert into user values('jemis','255abcde')";
               System.out.println("sql");
                   int i=con.createStatement().executeUpdate(sql);
           int j=con.createStatement().executeUpdate(sql2);
               System.out.println("i"+i+" j:"+j);
           ResultSet rs=con.createStatement().executeQuery(sql1);
           while(rs.next())
           {
               System.out.println("user id:"+rs.getString(1));
           }
           
           System.out.println("Connection Established Successfull and the DATABASE NAME IS:"
                        + con.getMetaData().getUserName());
           
         
           
          
           }
           catch(Exception e)
           {
               
           }
        if((uid.getText()).equals("jemis67") && (pass.getText().toString()).equals("255abcde"))
        {
         
             main.HomeController.loginstage.close();
        }
    }

    @FXML
    private void reset(ActionEvent event) {
        uid.setText("");
        pass.setText("");
        
    }

    @FXML
    private void cancel(ActionEvent event) {
        
    main.HomeController.loginstaus="hide";
    main.HomeController.loginstage.close();

    }
    
}
