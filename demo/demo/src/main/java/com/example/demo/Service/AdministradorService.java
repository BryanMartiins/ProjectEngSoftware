package com.example.demo.Service;


import com.example.demo.Model.Administrador;
import com.example.demo.Repository.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@Service
public class AdministradorService {

    private final AdministradorRepository administradorRepository;

    @Autowired
    public AdministradorService(AdministradorRepository administradorRepository){
        this.administradorRepository = administradorRepository;
    }

    public List<Administrador> ListarAdministrador(){
        return administradorRepository.findAll();
    }

    public Boolean SalvarAdministrador(Administrador administrador){
        try{
            administradorRepository.save(administrador);
            return Boolean.TRUE;
        }
        catch(Exception e){
            return Boolean.FALSE;
        }
    }

    public Boolean alterarAdminitrador(Administrador administrador){

        try {
            administradorRepository.save(administrador);
            return Boolean.TRUE;
        }
        catch(Exception e){
            return Boolean.FALSE;
        }

    }
    @DeleteMapping
    public Boolean deletarAdministrador(Administrador administrador){
        try{
            administradorRepository.delete(administrador);
            return Boolean.TRUE;
        }
        catch (Exception e){
            return Boolean.FALSE;
        }
    }


}
