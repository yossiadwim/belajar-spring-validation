package com.example.belajar_spring_validation.helper;

import jakarta.validation.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;

@Validated
public interface ISayHello {

    String sayHello(@NotBlank String name);
}
