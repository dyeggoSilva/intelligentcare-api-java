package com.apiIntelligentcare.entitiles;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@NonNull
@Getter
@Setter

public class Login {

    private String nome;
    private String senha;

}
