package com.stackroute.keywords;

import com.stackroute.keywords.oopsconcept.Bajaj;
import com.stackroute.keywords.oopsconcept.Car;
import com.stackroute.keywords.oopsconcept.Fz;

public class Main {
    public static void main(String[] args) {
        //object of bajaj class that impllementing car interface
        Car car = new Bajaj();
        //calling run method of bajaj
        car.run();
        //object of inherited class fz
        Fz fz=new Fz();
        //calling methods of child and parentss
        fz.start();
        fz.run();
    }
}
