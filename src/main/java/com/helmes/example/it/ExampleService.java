package com.helmes.example.it;

public class ExampleService {
    public int fast() {
        return 1;
    }

    public int slow() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) { }
        return 1;
    }
}
