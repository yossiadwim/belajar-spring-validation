package com.example.belajar_spring_validation;

import com.example.belajar_spring_validation.data.Foo;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

@SpringBootTest
public class PalindromeTest {

    @Autowired
    private Validator validator;


    @Test
    void palindromValid() {
        Set<ConstraintViolation<Foo>> constraintViolations = validator.validate(new Foo("katak"));
        Assertions.assertTrue(constraintViolations.isEmpty());
    }

    @Test
    void palindromeNotValid() {
        Set<ConstraintViolation<Foo>> constraintViolations = validator.validate(new Foo("yossia"));
        Assertions.assertFalse(constraintViolations.isEmpty());
        Assertions.assertEquals(1, constraintViolations.size());
    }

    @Test
    void palindromeInvalidMessage() {
        Set<ConstraintViolation<Foo>> constraintViolations = validator.validate(new Foo("yossia"));
        Assertions.assertFalse(constraintViolations.isEmpty());
        Assertions.assertEquals(1, constraintViolations.size());

        String message = constraintViolations.stream().findFirst().get().getMessage();
        Assertions.assertEquals("Data bukan palindrome", message);
    }
}
