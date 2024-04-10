package com.example.demo.Controller;

import com.example.demo.Model.Administrador;
import com.example.demo.Service.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("Administrador")
public class AdministradorController {

    @Autowired
    private AdministradorService administradorService;

    @GetMapping
    public List<Administrador> getALL() {
        return administradorService.ListarAdministrador();
    }

    @PostMapping("")
    public ResponseEntity<Administrador> SalvarAdministrador(@RequestBody Administrador administrador){
        Boolean response = administradorService.SalvarAdministrador(administrador);
        if(response == Boolean.TRUE){
            return ResponseEntity.status(HttpStatus.CREATED).body(administrador);
        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(administrador);
        }
    }

    @PutMapping("")
    public ResponseEntity<Administrador> alterarAdministrador(@RequestBody Administrador administrador){
       boolean response = administradorService.alterarAdminitrador(administrador);
       if(response == Boolean.TRUE){
           return  ResponseEntity.status(HttpStatus.ACCEPTED).body(administrador);
       }
       else{
           return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(administrador);

       }
    }
    @DeleteMapping("/Deletar")
    public ResponseEntity<Administrador> deletarAdministrador(@RequestBody Administrador administrador){
        boolean response = administradorService.deletarAdministrador(administrador);
        if(response == Boolean.TRUE) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(administrador);
        }
        else{
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(administrador);
        }
    }


}

