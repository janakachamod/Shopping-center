/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package shoppingcenter;

//import java.awt.*;
//import java.awt.Label;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Dell
 */
public class Shoppingcenter extends Application {
    
   //Scenes declarations
    Scene mainscene,adminLoginScene,adminDashboardScene,addDataScene,editPriceScene,
    deleteDataScene,userDashboardScene,searchCarbybrandScene,costCalScene,viewAllcarScene;
    
    //Queus,stack Declaration
   Queue<String> BrandQueue=new LinkedList<String>();
    Queue<String> CatergoryQueue=new LinkedList<String>();
    Queue<String> ModelQueue=new LinkedList<String>();
    Queue<String> PriceQueue=new LinkedList<String>();
    Queue<String> YearQueue=new LinkedList<String>();
    Stack<String> feedBackStack=new Stack<String>();
    
    //global varible declaration
    private final ObservableList<Record> dataList=FXCollections.observableArrayList();
    private String DetailsFileName="productdetails.txt";
    private String feedBackFileName="feedBack.txt";
    private int withMoldingTax;
    private int freightcharges=10000;
    private int ownMoney=300000;
    
    //class declartion
    FileOperation fop=new FileOperation();
    bubblesort bs=new bubblesort();
    AlertBox ab=new AlertBox();
    
    
    @Override
    public void start(Stage primaryStage) 
    {
        
        
       
        
            fop.ArrayToQueue(BrandQueue, ModelQueue, CatergoryQueue, YearQueue, PriceQueue, DetailsFileName);
            
            //Main Screen Scene(main scene)
            AnchorPane mainScePane=new AnchorPane();
            
            Label titilelbl=new Label("new Shoping center");
            titilelbl.setFont(Font.font(null,FontWeight.BOLD,40));
            titilelbl.setTranslateX(200);
            titilelbl.setTranslateY(300);
            
            Button adminloginbutton=new Button("Admin Login");
            adminloginbutton.setTranslateX(50);
            adminloginbutton.setTranslateY(380);
            adminloginbutton.setPrefSize(200, 60);
            adminloginbutton.setFont(Font.font(null,FontWeight.SEMI_BOLD,16));
            
            adminloginbutton.setOnAction((ActionEvent event) -> {
                primaryStage.setScene(adminLoginScene);
                
            });
            
             Button Userdashboardbutton=new Button("User DashBoard");
            
             Userdashboardbutton.setTranslateX(350);
             Userdashboardbutton.setTranslateY(380);
             Userdashboardbutton.setPrefSize(200, 60);
             Userdashboardbutton.setFont(Font.font(null,FontWeight.SEMI_BOLD,16));
             Userdashboardbutton.setOnAction((ActionEvent event) -> {
                 primaryStage.setScene(userDashboardScene);
                 
                 
            });
             
             Button mainExitbutton=new Button("Exit");
             mainExitbutton.setTranslateX(200);
             mainExitbutton.setTranslateY(470);
             mainExitbutton.setPrefSize(200, 60);
             mainExitbutton.setFont(Font.font(null,FontWeight.SEMI_BOLD,16));
             mainExitbutton.setOnAction((ActionEvent event) -> {
                 System.exit(0);
            });
             
             Label footer1=new Label("develoloed by");
             footer1.setTranslateX(10);
             footer1.setTranslateY(570);
             footer1.setFont(Font.font(null,FontWeight.BOLD,12));
             
             mainScePane.getChildren().addAll(titilelbl,adminloginbutton,Userdashboardbutton,footer1,mainExitbutton);
             mainscene =new Scene(mainScePane,600,600);
             primaryStage.setScene(mainscene);
             primaryStage.show();
             
           
             
             
             
        
        
       
        
        
        
    }

   
    public static void main(String[] args) {
        launch(args);
    }
    
}
