package com.stackroute.keywords.typesofclasses;

// A sample functional interface (An interface with
// single abstract method
interface FuncInterface
{
    // An abstract function
    void abstractFun();
}
class LambdaExpression
{
    public static void main(String args[])
    {
        // lambda expression to implement above functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fobj = ()->System.out.println("this is lambda expression");

        // This calls above lambda expression and prints 10.
        fobj.abstractFun();
    }
}