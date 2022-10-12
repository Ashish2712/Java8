package com.ashish.javacourse.lesson1;

import com.ashish.javacourse.lesson3.LoggingLevel;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private static final String[] MY_STATE_VALUES = {"PENDING", "PROCESSING", "PROCESSED"};

    public String[] states(){
        return Arrays.copyOf(MY_STATE_VALUES, MY_STATE_VALUES.length);
    }

    @Test
    public void shouldReturnHelloWorld(){

        Person ashish = new Person();
        assertEquals("Hello World", ashish.helloWorld());

    }

    @Test
    public void shouldReturnPersonName(){
        Person person = new Person();
        assertEquals("Hello Ashish", person.hello("Ashish"));
    }

    @Test
    public void shouldReturnNumberOfPersons(){
        Person person1 = new Person();
        Person person2 = new Person();
        Person myPerson = new Person();

        assertEquals(3, myPerson.numberOfPersons());
    }

    @Test
    public void demonstrateArrays(){
//        Person[] persons = new Person[4];
////        for(int i=0; i<4; i++){
////            persons[i] = new Person();
////            System.out.println(persons[i]);
////        }
//        // for each
//        System.out.println(persons.length);
//        for(Person person : persons){
////            person.helloWorld();
//            person = new Person();
//            System.out.println(person.helloWorld());
//        }
//        Person myPerson = new Person();
//        Person myPerson2 = null;
//        Person[] persons2 = {persons[0], persons[3], myPerson, myPerson2, null};
//        System.out.println(persons2.length);

        for(LoggingLevel state: LoggingLevel.values()) {

            if (state.equals(LoggingLevel.PENDING)) {
                String sf1 = String.format("your request is in %s state", state);
                System.out.println(sf1);
            }
        }
            for(String state1 : states()){
                System.out.println(state1);
            }
//            System.out.println(states());


    }

//    @Test
//    public void demonstrateBoolean(){
//
//        boolean monday = true;
//        boolean raining = true;
//
//        if(monday && raining){
//            eatSomething();
//        }
//        if(isItMonday() && isItRaining())
//    }

}
