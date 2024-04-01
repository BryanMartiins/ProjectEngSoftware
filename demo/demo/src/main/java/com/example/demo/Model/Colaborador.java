package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.io.Serial;

@Data
@Entity(name = "Colaborador")
@Table(name = "Colaborador")
@AllArgsConstructor
@NoArgsConstructor
public class Colaborador {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Chave_Autorizacao;
    private String Nome_Completo;
    private String CPF;
    private String Email;
    private String Endereço;
    private String Senha;



}
