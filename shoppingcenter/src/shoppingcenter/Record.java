/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoppingcenter;

import javafx.beans.property.SimpleStringProperty;


public class Record
{
    private SimpleStringProperty brand;
    private SimpleStringProperty model;
    private SimpleStringProperty year;
    private SimpleStringProperty price;
    private SimpleStringProperty catergory;

    public String getBrand() {
        return brand.get();
    }

    public String getModel() {
        return model.get();
    }

    public String getYear() {
        return year.get();
    }

    public String getPrice() {
        return price.get();
    }

    public String getCatergory() {
        return catergory.get();
    }
    Record(String newbrand,String newmodel,String newcatergory,String newyear,String newprice)
    {
        this.brand=new SimpleStringProperty(newbrand);
        this.model=new SimpleStringProperty(newmodel);
        this.catergory=new SimpleStringProperty(newcatergory);
        this.year=new SimpleStringProperty(newyear);
        this.price=new SimpleStringProperty(newprice);
    }
    
    
}
