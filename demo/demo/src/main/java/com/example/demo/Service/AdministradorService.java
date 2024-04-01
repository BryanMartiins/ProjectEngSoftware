package com.example.demo.Service;


import com.example.demo.Model.Administrador;
import com.example.demo.Repository.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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



}
