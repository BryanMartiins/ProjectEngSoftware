package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;


@Data
@Table(name = "administrador")
@Entity(name = "Administrador")
@AllArgsConstructor
@NoArgsConstructor
public class Administrador {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Num_Registro;
    private String Nome_Completo;
    private String CPF;
    private String Email;
    private String Endereço;
    private String Senha;


}
