package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<Car, Data> cars = new HashMap<>();
        cars.put(new Car(1234,407),new Data(2001,"Honda Fit",3500,"yellow "));
        cars.put(new Car(2003,457),new Data(2013,"Mazda 3",3500,"pink "));
        cars.put(new Car(1134,607),new Data(2012,"Toyota Camry",12000,"white "));
        cars.put(new Car(4234,408),new Data(2011,"Toyota Opa",3700,"red "));
        cars.put(new Car(4634,513),new Data(2000,"Honda Accord",3800,"black "));
        
        //System.out.println(cars.entrySet());
        for (Map.Entry elem: cars.entrySet()
             ) {
            System.out.println(elem.getKey()+"  "+elem.getValue());
        }


    }
}
