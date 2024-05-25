package com.example.demo.Controller;

import com.example.demo.Model.Administrador;
import com.example.demo.Model.Aluno;
import com.example.demo.Service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("Aluno")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @GetMapping
    public List<Aluno> getALL() {
        return alunoService.ListarAluno();
    }
    @GetMapping("/Consulta/{nomeCompleto}")
    public List<Aluno> Consultar(@PathVariable String nomeCompleto){
        return alunoService.returnSearch(nomeCompleto);
    }

    @PostMapping("")
    public ResponseEntity<Aluno> SalvarAluno(@RequestBody Aluno aluno) {
        Boolean response = alunoService.SalvarAluno(aluno);


        if (response == Boolean.TRUE) {
            return ResponseEntity.status(HttpStatus.CREATED).body(aluno);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(aluno);
        }
    }
    @PutMapping("")
    public ResponseEntity<Aluno> AlteraAluno(@RequestBody Aluno aluno){
        boolean response = alunoService.alterarAluno(aluno);
        if(response == Boolean.TRUE){
            return  ResponseEntity.status(HttpStatus.ACCEPTED).body(aluno);
        }
        else{
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(aluno);

        }
    }
    @DeleteMapping("/Deletar/{ra}")
    public ResponseEntity<Aluno> deletarAluno(@RequestBody Aluno aluno){
        boolean response = alunoService.deletarAluno(aluno);
        if(response == Boolean.TRUE) {
            return ResponseEntity.status(HttpStatus.OK).body(aluno);
        }
        else{
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(aluno);
        }
    }

}
