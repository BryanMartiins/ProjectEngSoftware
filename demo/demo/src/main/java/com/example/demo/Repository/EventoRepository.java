package com.example.demo.Repository;
import com.example.demo.Model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository <Evento, Long> {
}
