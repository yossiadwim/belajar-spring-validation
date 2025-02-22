package com.example.belajar_spring_validation.data;

import com.example.belajar_spring_validation.validation.Palindrome;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Foo {

    @Palindrome
    private String name;
}
