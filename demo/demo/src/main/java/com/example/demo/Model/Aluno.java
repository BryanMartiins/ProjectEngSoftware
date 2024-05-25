package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serial;


@Data
@Table(name= "Alunos")
@Entity(name="Alunos")
@AllArgsConstructor
@NoArgsConstructor
public class Aluno {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long Id;
    private String RA;
    @Column(name = "nome_completo")
    private String NomeCompleto;
    private String CPF;
    private String email;
    private String Alun_senha;

}
