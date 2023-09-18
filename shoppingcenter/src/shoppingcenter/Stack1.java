/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoppingcenter;


public class Stack1 
{
    protected Object[] stk;
    protected int size;
    protected int top;
    
    public Stack1(int initialCapacity)
    {
        if(initialCapacity < 1)
        {
            throw new  IllegalArgumentException("intialcapacity must be >=1");
            
        }
        stk=new Object[initialCapacity];
        size=initialCapacity;
        top=0;
    }
    public Stack1()
    {
        stk=null;
        size=top=0;
    }
    public Object[] update()
    {
        return stk;
    }
    public boolean push(String element)
    {
        if(top==size)
        {
            return false;
        }
        stk[top]=element;
        top++;
        return true;
    }
    public Object pop()
    {
        if(top==0)
        {
            return false;
        }
        top--;
        return stk[top];
    }
}
