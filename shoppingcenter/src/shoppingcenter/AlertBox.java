/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoppingcenter;

import javafx.scene.control.Alert;


public class AlertBox 
{
    public void ErrorAlert()
    {
        Alert errorAlert=new Alert(Alert.AlertType.ERROR);
        errorAlert.setTitle("An error occured");
        errorAlert.setHeaderText(null);
        errorAlert.setContentText("Empty text fields! kindly Fill them");
        errorAlert.showAndWait();
    }
    public void EmptyidPassalert()
    {
        Alert emtyidpassalert=new Alert(Alert.AlertType.ERROR);
        emtyidpassalert.setTitle("Login Error");
        emtyidpassalert.setHeaderText(null);
        emtyidpassalert.setContentText("Empty text fields! kindly Fill them");
        emtyidpassalert.showAndWait();
    }
    public void EmptyFieldAlert()
    {
        Alert emptyfielderror=new Alert(Alert.AlertType.ERROR);
        emptyfielderror.setTitle("empty fields error");
        emptyfielderror.setHeaderText(null);
        emptyfielderror.setContentText("Empty text fields! kindly Fill them");
        emptyfielderror.showAndWait();
    }
    public void wrongidpassalert()
    {
        Alert wrongidpassalert=new Alert(Alert.AlertType.ERROR);
        wrongidpassalert.setTitle("Login error");
        wrongidpassalert.setHeaderText(null);
        wrongidpassalert.setContentText("You have been entered wrong assword or id");
        wrongidpassalert.showAndWait();

    }
    public void dataeditedalert()
    {
        Alert wrongidpassalert=new Alert(Alert.AlertType.ERROR);
        wrongidpassalert.setTitle("Data edited");
        wrongidpassalert.setHeaderText(null);
        wrongidpassalert.setContentText("data has been successfully editted");
        wrongidpassalert.showAndWait();
    }
    
}
