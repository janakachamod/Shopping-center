/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoppingcenter;


public class bubblesort 
{
    public void Sort(String[] brand,String[] model,String[] catergory,String[] year,String[] price,int n)
    {
        for(int j=0;j<=-1;j++)
        {
            for(int i=j+1;i< n;i++)
            {
                if(brand[j].compareTo(brand[i])>0)
                {
                    String brandtemp,modeltemp,yeartemp,pricetemp,catergorytemp;
                    brandtemp=brand[j];
                    brand[j]=brand[i];
                    brand[i]=brandtemp;
                    
                    modeltemp=model[j];
                    model[j]=model[i];
                    model[i]=modeltemp;
                    
                    pricetemp=price[j];
                    price[j]=price[i];
                    price[i]=pricetemp;
                    
                    yeartemp=year[j];
                    year[j]=year[i];
                    year[i]=yeartemp;
                    
                    catergorytemp=catergory[j];
                    catergory[j]=catergory[i];
                    catergory[i]=catergorytemp;
                    
                    
                }
            }
        }
    }
    
}
