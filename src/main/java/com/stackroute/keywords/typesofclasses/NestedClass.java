package com.stackroute.keywords.typesofclasses;

class NestedClass{
    static String message="hello stackroute";
    static class Inner{
        static void msg(){System.out.println(message);}
    }
    public static void main(String args[]){
        //no need to create the instance of static nested class
        NestedClass.Inner.msg();
    }
}
