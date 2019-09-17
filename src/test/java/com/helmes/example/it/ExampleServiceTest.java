package com.helmes.example.it;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleServiceTest {

    @Test
    public void fast() {
        ExampleService es = new ExampleService();
        assertEquals(1, es.fast());
    }
}
