package br.com.softplan.demo.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@RequiredArgsConstructor
@Getter
@Setter
public class Xpto {

    private UUID id;

    private Integer codigo;

    private String nome;
}