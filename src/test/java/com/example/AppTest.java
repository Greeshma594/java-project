// File: src/test/java/com/example/AppTest.java
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testPrintMessage() {
        // Since printMessage just prints to console, we'll just ensure it runs without exceptions
        assertDoesNotThrow(() -> Utils.printMessage("Testing Utils.printMessage"));
    }
}

