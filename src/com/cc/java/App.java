package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat1 = new Cat("Grizabella", "white", 29); // Klasse --> Objekt / Instanz
        
        output("Name: " + cat1.getStringsAttributes("#name"));
        output("Fellfarbe: " + cat1.getStringsAttributes("#color"));

        output("Alter: " + cat1.getAge());

        output("------------------------");

        Cat cat2 = new Cat("Alonzo", "black", 35); // Klasse --> Objekt / Instanz
        // cat2.setName("#?!3$");
        
        output("Name: " + cat2.getStringsAttributes("#name"));
        output("Fellfarbe: " + cat2.getStringsAttributes("#color"));
        
        output("Alter: " + cat2.getAge());


        // output("--------- Info -----------");
        // //output(2); //Typ muss konvertiert werden!
        // output("Zahl: " + 2);
        // output(String.valueOf(2));  // int --> String
        // output(Integer.toString(2)); // int --> String

    }

    public static void output(String outputStr){
        System.out.println(outputStr);
    }

}
