package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.io.Serial;

@Table(name = "Professores")
@Data
@Entity(name = "Professores")
@AllArgsConstructor
@NoArgsConstructor
public class Professor {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String numInscricao;
    private String NomeCompleto;
    private String CPF;
    private String email;
    private String Endereco;
    private String Senha;



}
