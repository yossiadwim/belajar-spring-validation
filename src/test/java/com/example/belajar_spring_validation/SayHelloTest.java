package com.example.belajar_spring_validation;

import com.example.belajar_spring_validation.helper.SayHello;
import jakarta.validation.ConstraintViolationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SayHelloTest {

    @Autowired
    private SayHello sayHello;


    @Test
    void testSuccess() {
        String message = sayHello.sayHello("Yossia");
        Assertions.assertEquals("Hello Yossia", message);
    }

    @Test
    void testFailed() {
        Assertions.assertThrows(ConstraintViolationException.class, () -> sayHello.sayHello(""));
    }
}
