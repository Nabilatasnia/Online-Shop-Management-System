/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineprojectmanagement;

import java.io.IOException;
import java.io.Reader;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Lenovo
 */
public class OnlineProjectManagement extends Application{
    

    /**
     * @param stage
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
     
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("welcomewindow.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        launch(args);
        // TODO code application logic here
        DBConnect dbc = new DBConnect();
        dbc.connectToDB();
        String password="1234";
        int id=11;
        String query = "insert into customer(customerid, customer_password) values(190104018,'nabila')";
        System.out.println(query);
        boolean dataInserted = dbc.insertDataToDB(query);
        System.out.println("Inserted?: "+dataInserted);
        String squery = "select * from customer";
        ResultSet rs = dbc.queryToDB(squery);
        rs.next();
        while(rs.next()){
            String result;
            try (//            System.out.println(rs);
                    Reader reader = rs.getCharacterStream("customerid")) {
                int intValueOfChar;
                result = "";
                while ((intValueOfChar = reader.read()) != -1) {
                    result += (char) intValueOfChar;
                }
            }
            System.out.println(result);
        }
        dbc.disconnectFromDB();
    
    
}

 
}
