/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoppingcenter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import javafx.scene.control.Alert;



public class FileOperation 
{
    AlertBox ab=new AlertBox();
    boolean isTrue=false;
    public boolean LoginFileread(String user,String pass,String filename)
    {
        //this method perform the login vertification
        try
        {
            Scanner scan=new Scanner(new File(filename));
            while(scan.hasNext())
            {
                String tempuser=user;
                String temppass=pass;
                String checkuser=scan.next();
                String checkpass=scan.next();
                if(tempuser.equals(checkuser)&& temppass.equals(checkpass))
                {
                    isTrue=true;
                }
            }
            scan.close();
            
        }
        catch(FileNotFoundException ex)
        {
            Alert errorAlert=new Alert(Alert.AlertType.ERROR);
            errorAlert.setTitle("An error occured");
            errorAlert.setHeaderText(null);
            errorAlert.setContentText("oops ! An error occured sorry for your inconvinence");
            errorAlert.showAndWait();
        }
        return isTrue;
    }
    public void Filewrite(String[] brandstr,String[] modelstr,String[] catergorystr,String[] yearstr,String[] pricestr,String FileName,boolean  append)
    {
        //this writes data in a file
        try{
            FileWriter fw=new FileWriter(new File(FileName),append);
            BufferedWriter bw=new BufferedWriter(fw);
            for(int i=0; i<brandstr.length;i++)
            {
                
                bw.write(brandstr[i]+","+modelstr[i]+","+catergorystr[i]+","+yearstr[i]+","+pricestr[i]+"\n");
                
            }
            bw.close();
        }
        catch(IOException ex)
        {
            Alert errorAlert=new Alert(Alert.AlertType.ERROR);
            errorAlert.setTitle("An error occured");
            errorAlert.setHeaderText(null);
            errorAlert.setContentText("oops ! An error occured sorry for your inconvinence");
            errorAlert.showAndWait();
        }
    }
    
    public void Feedbackwrite(String[] feedback,String filename,boolean  append)
    {
        try{
            FileWriter fw=new FileWriter(new File(filename),append);
            BufferedWriter bw=new BufferedWriter(fw);
            for(int i=0;i<feedback.length;i++)
            {
                bw.write(feedback[i]+"\n");
            }
            bw.close();
            
        }
        catch(IOException ex)
        {
             Alert errorAlert=new Alert(Alert.AlertType.ERROR);
            errorAlert.setTitle("An error occured");
            errorAlert.setHeaderText(null);
            errorAlert.setContentText("oops ! An error occured sorry for your inconvinence");
            errorAlert.showAndWait();
        }
    }
    
    public void deleteDulicateData(String FileName)
    {
        //this method delete dulicate data from the file
        try
        {
            String input=null;
            File tempfile=new File(FileName);
            File inputfile=new File("productdetails.txt");
            Scanner sc=new Scanner(tempfile);
            FileWriter fw=new FileWriter(inputfile,false);
            Set<String> set=new HashSet<String>();
            while(sc.hasNextLine())
            {
                input=sc.nextLine();
                if(set.add(input))
                {
                    fw.append(input+"\n");
                }
            }
            fw.flush();
            sc.close();
            fw.close();
        }
        catch(Exception e)
        {
              Alert errorAlert=new Alert(Alert.AlertType.ERROR);
            errorAlert.setTitle("An error occured");
            errorAlert.setHeaderText(null);
            errorAlert.setContentText("oops ! An error occured sorry for your inconvinence");
            errorAlert.showAndWait();
            e.printStackTrace();
        }
    }
    public void sortFiledata(String Filename)
    {
        //this methos sorts data in the file
        try
        {
            BufferedReader reader=new BufferedReader(new FileReader(Filename));
            ArrayList<String> str=new ArrayList<>();
            String line="";
            while((line=reader.readLine())!=null)
            {
                str.add(line);
            }
            reader.close();
            Collections.sort(str);
            FileWriter writer=new FileWriter("tempproductdetails.txt");
            for(String s: str)
            {
                writer.write(s);
                writer.write("\r\n");
            }
            writer.close();
            deleteDulicateData("tempproductdetails.txt");
        }
        catch(Exception e)
        {
              Alert errorAlert=new Alert(Alert.AlertType.ERROR);
            errorAlert.setTitle("An error occured");
            errorAlert.setHeaderText(null);
            errorAlert.setContentText("oops ! An error occured sorry for your inconvinence");
            errorAlert.showAndWait();
            e.printStackTrace();
        }
       
            
        
        
            
        
    }
    public void ArrayToQueue(Queue<String> brandqueue,Queue<String> modelqueue,Queue<String> catergoryqueue,Queue<String> yearqueue,Queue<String> priceQueue,String Filename)
    {
       //this method saves data from file to queue
        try{
            ArrayList<String> brand=new ArrayList<>();
             ArrayList<String> model=new ArrayList<>();
             ArrayList<String> catergory=new ArrayList<>();
             ArrayList<String> year=new ArrayList<>();
             ArrayList<String> price=new ArrayList<>();
             List<String> tempdate=Files.readAllLines(Paths.get(Filename));
             
             for(String line : tempdate)
             {
                 String[] fields=line.split(",");
                 brand.add(fields[0]);
                 model.add(fields[1]);
                 catergory.add(fields[2]);
                 year.add(fields[3]);
                 price.add(fields[4]);
             }
             brandqueue.addAll(brand);
             modelqueue.addAll(model);
             catergoryqueue.addAll(catergory);
             yearqueue.addAll(year);
             priceQueue.addAll(price);
             
             
            
            
            
        }
        catch(Exception e)
        {
            ab.ErrorAlert();
        }
    }
    public void fileupdate(ArrayList<String> brandAl,ArrayList<String> modelAl,ArrayList<String> catergoryAl,ArrayList<String> yearAl,ArrayList<String> priceAl,String Filename,boolean append)
    {
        try
        {
            FileWriter fw=new FileWriter(new File(Filename),append);
            BufferedWriter bw=new BufferedWriter(fw);
            for(int i=0;i<brandAl.size();i++)
            {
                bw.write(brandAl.get(i)+","+modelAl.get(i)+","+catergoryAl.get(i)+","+yearAl.get(i)+","+priceAl.get(i)+"\n");
                
            }
            bw.close();
        }
        catch(IOException e)
        {
              Alert errorAlert=new Alert(Alert.AlertType.ERROR);
            errorAlert.setTitle("An error occured");
            errorAlert.setHeaderText(null);
            errorAlert.setContentText("oops ! An error occured sorry for your inconvinence");
            errorAlert.showAndWait();
            
        }
    }
        
    
    
    
    
}
