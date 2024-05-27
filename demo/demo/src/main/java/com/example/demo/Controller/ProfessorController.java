package com.example.demo.Controller;

import com.example.demo.Model.Coordenador;
import com.example.demo.Model.Professor;
import com.example.demo.Service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("professor")
public class ProfessorController {
    @Autowired
    private ProfessorService professorService;

    @GetMapping
    public List<Professor> getALL(){
        return professorService.ListarProfessor();
    }

    @PostMapping("")
    public ResponseEntity<Professor> SalvarProfessor(@RequestBody Professor professor){
        Boolean response = professorService.SalvarProfessor(professor);
        if(response == Boolean.TRUE){
            return ResponseEntity.status(HttpStatus.CREATED).body(professor);
        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(professor);
        }
    }
    @PutMapping("")
    public ResponseEntity<Professor> alterarProfessor(@RequestBody Professor professor){
        boolean response = professorService.alterarProfessor(professor);
        if(response == Boolean.TRUE){
            return  ResponseEntity.status(HttpStatus.ACCEPTED).body(professor);
        }
        else{
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(professor);

        }
    }
    @DeleteMapping("/Deletar")
    public ResponseEntity<Professor> deletarProfessor(@RequestBody Professor professor){
        boolean response = professorService.deletarProfessor(professor);
        if(response == Boolean.TRUE) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(professor);
        }
        else{
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(professor);
        }
    }

}
