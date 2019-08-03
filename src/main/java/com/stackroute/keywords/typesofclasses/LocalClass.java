package com.stackroute.keywords.typesofclasses;

//A class i.e. created inside a method is called local inner class in java.
// If you want to invoke the methods of local inner class, you must instantiate this class inside the method.

public class LocalClass{
    private String message="hello stackroute";//instance variable
    void display(){
        class Local{
            void msg(){System.out.println(message);}
        }
        Local l=new Local();
        l.msg();
    }
    public static void main(String args[]){
        LocalClass obj=new LocalClass();
        obj.display();
    }
}