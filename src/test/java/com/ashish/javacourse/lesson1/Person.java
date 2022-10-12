package com.ashish.javacourse.lesson1;

import com.ashish.javacourse.lesson2.Name;

public class Person {

    private Name personName;
    private static int personCounter;


    public Person(Name personName){
        this.personName = personName;
    }

    public Person(){

        personCounter++;
        /*
        Empty constructor
         */
    }

    public String helloWorld(){
        return "Hello World";
    }

    public String hello(String name) {
        return "Hello "+ name;
    }

    public static int numberOfPersons() {
        return personCounter;
    }
}
