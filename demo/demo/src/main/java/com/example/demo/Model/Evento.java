package com.example.demo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serial;
import java.util.Date;

@Data
@Table(name = "Eventos")
@Entity(name = "Eventos")
@AllArgsConstructor
@NoArgsConstructor

public class Evento{
    @Serial

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String nomeEvento;
    private Date data;
    private Double hora;
    private String local;
    private String responsavel;
    private String descriçao;

}
