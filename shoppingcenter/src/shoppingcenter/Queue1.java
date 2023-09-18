/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoppingcenter;


public class Queue1 
{
    
    public Object[] stk;
    public int size;
    public int rear;
    public int count;
    
    public Queue1(int initialCapacity)
    {
        if(initialCapacity<1)
        throw new IllegalArgumentException("initialcapacity must be >=1");
        stk=new Object[initialCapacity];
        size=initialCapacity;
        rear=0;
    }
    public Queue1()
    {
        stk=null;
        size=0;
        rear=0;
        count=0;
    }
    public Object[] update()
    {
        return stk;
    }
    public boolean enqueue(String element)
    {
        if(count==size)
        {
            return false;
        }
        stk[rear]=element;
        count++;
        rear++;
        return true;
    }
    public Object dequeue()
    {
        if(count==0)
        {
            return false;
        }
        count --;
        for(int i=0;i<stk.length-1;i++)
        {
            stk[i]=stk[i+1];
            
        }
        stk[--rear]=0;
        return stk[rear];
    }
}
