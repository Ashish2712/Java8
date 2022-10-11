package com.ashish.javacourse.lesson1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld(){

        Person ashish = new Person();
        assertEquals("Hello World", ashish.helloWorld());

    }

}
