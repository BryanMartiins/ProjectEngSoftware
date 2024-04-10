package com.example.demo.Controller;

import com.example.demo.Model.Evento;
import com.example.demo.Service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("Eventos")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @GetMapping
    public List<Evento> getAll(){
        return eventoService.ListarEvento();
    }

    @PostMapping("")
    public ResponseEntity<Evento> SalvarEvento(@RequestBody Evento evento){
        Boolean response = eventoService.SalvarEvento(evento);
        if (response == Boolean.TRUE){
            return ResponseEntity.status(HttpStatus.CREATED).body(evento);
        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(evento);
        }
    }

    @PutMapping
    public ResponseEntity<Evento> alterarEvento(@RequestBody Evento evento){
        boolean response = eventoService.alterarEvento(evento);
        if(response == Boolean.TRUE){
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(evento);
        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(evento);
        }

    }

    @DeleteMapping
    public ResponseEntity<Evento> DeletarEvento(@RequestBody Evento evento){
        boolean response = eventoService.deletarEvent(evento);
        if(response == Boolean.TRUE){
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(evento);
        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(evento);
        }
    }

}
