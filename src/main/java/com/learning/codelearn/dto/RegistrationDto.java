package com.learning.codelearn.dto;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;

import lombok.Data;


@Data
public class RegistrationDto {
    private Long id;
    @NotNull
    private String username;
    @NotNull
    private String email;
    @NotNull
    private String password;


}
