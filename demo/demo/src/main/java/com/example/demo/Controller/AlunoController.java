package com.example.demo.Controller;

import com.example.demo.Model.Aluno;
import com.example.demo.Repository.AlunoRepository;
import com.example.demo.Service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Aluno")
public class AlunoController {
    @Autowired
    AlunoService alunoService;

    @GetMapping
    public List<Aluno> getALL() {
        return alunoService.ListarAluno();
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

}
