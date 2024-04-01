package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.hibernate.boot.archive.scan.internal.ScanResultImpl;

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
    private String Nome_Completo;
    private String CPF;
    private String email;
    private String Alun_senha;

}
