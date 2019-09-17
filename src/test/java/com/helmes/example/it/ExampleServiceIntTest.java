package com.helmes.example.it;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleServiceIntTest {

    @Test
    public void slow() {
        ExampleService es = new ExampleService();
        assertEquals(1, es.slow());
    }
}
