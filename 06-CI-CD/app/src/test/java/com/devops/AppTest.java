package com.devops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testApplicationMessage() {
        assertEquals(
                "DEVOPS-054 Build Pipeline is working!",
                App.getMessage()
        );
    }
}