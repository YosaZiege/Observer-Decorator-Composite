package com.school.designpatterns.observer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ObserverImpl2Test {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void computesRunningAverage() {
        ObserverImpl2 observer = new ObserverImpl2();

        observer.update(60);
        observer.update(80);
        observer.update(100);

        String output = out.toString();
        assertTrue(output.contains("60.0"));
        assertTrue(output.contains("70.0"));
        assertTrue(output.contains("80.0"));
    }
}
