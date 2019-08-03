package com.stackroute.keywords.typesofclasses;

//A class that have no name is known as anonymous inner class in java.
// It should be used if you have to override method of class or interface
interface Eatable{
    void eat();
}
class AnnonymousClass{
    public static void main(String args[]){
        //A class is created but its name is decided by the compiler which
        // implements the Eatable interface and provides the implementation of the eat() method.
        Eatable e=new Eatable(){
            //overridden method
            public void eat(){System.out.println("nice fruits");}
        };
        e.eat();
    }
}