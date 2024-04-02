package com.example.demo.Controller;

import com.example.demo.Model.Colaborador;
import com.example.demo.Service.ColaboradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Colaborador")

public class ColaboradorController {
    @Autowired
    private ColaboradorService colaboradorService;

    @GetMapping
    public List<Colaborador> getAll(){
        return colaboradorService.ListarColaborador();

    }
    @PostMapping("")
    public ResponseEntity<Colaborador> SalvarColaborador(@RequestBody Colaborador colaborador){
        Boolean response = colaboradorService.SalvarColaborador(colaborador);
        if(response == Boolean.TRUE){
            return ResponseEntity.status(HttpStatus.CREATED).body(colaborador);
        }
        else{
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(colaborador);
        }
    }

}
