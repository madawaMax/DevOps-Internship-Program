
package com.devops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testApplicationMessage() {
        assertEquals(
                "DEVOPS-059 Full CI/CD Pipeline is working!!3rd try",
                App.getMessage()
        );
    }

    @Test
    void testApplicationHealth() {
        assertEquals(
                "UP",
                App.getHealthStatus()
        );
    }
}

