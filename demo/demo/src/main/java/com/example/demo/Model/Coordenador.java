package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;

@Data
@Entity(name = "Coordenador")
@Table(name = "Coordenador")
@AllArgsConstructor
@NoArgsConstructor
public class Coordenador {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Chave_Autorizacao;
    private String nomeCompleto;
    private String CPF;
    private String email;
    private String Endereço;
    private String Senha;



}
