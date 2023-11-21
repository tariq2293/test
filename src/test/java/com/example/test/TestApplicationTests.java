package com.example.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestApplicationTests {

    @Test
    void contextLoads() {
        int a = 10;
        int b = 20;
        assertEquals(30, a+b);
    }

}
