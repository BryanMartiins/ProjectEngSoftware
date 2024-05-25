package com.example.demo.Controller;

import com.example.demo.Model.Coordenador;
import com.example.demo.Service.CoordenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Colaborador")

public class CoordenadorController {
    @Autowired
    private CoordenadorService colaboradorService;

    @GetMapping
    public List<Coordenador> getAll(){
        return colaboradorService.ListarColaborador();

    }
    @PostMapping("")
    public ResponseEntity<Coordenador> SalvarColaborador(@RequestBody Coordenador coordenador){
        Boolean response = colaboradorService.SalvarColaborador(coordenador);
        if(response == Boolean.TRUE){
            return ResponseEntity.status(HttpStatus.CREATED).body(coordenador);
        }
        else{
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(coordenador);
        }
    }

    @PutMapping("")
    public ResponseEntity<Coordenador> alterarCoordenador(@RequestBody Coordenador coordenador){
        boolean response = colaboradorService.alterarColaborador(coordenador);
        if(response == Boolean.TRUE){
            return  ResponseEntity.status(HttpStatus.ACCEPTED).body(coordenador);
        }
        else{
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(coordenador);

        }
    }

    @DeleteMapping("/Deletar")
    public ResponseEntity<Coordenador> deletarCoordenador(@RequestBody Coordenador coordenador){
        boolean response = colaboradorService.deletarColaborador(coordenador);
        if(response == Boolean.TRUE) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(coordenador);
        }
        else{
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(coordenador);
        }
    }

}
