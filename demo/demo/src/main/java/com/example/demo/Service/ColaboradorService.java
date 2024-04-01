package com.example.demo.Service;

import com.example.demo.Model.Colaborador;
import com.example.demo.Repository.ColaboradorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ColaboradorService {
    private final ColaboradorRepository colaboradorRepository;


    public ColaboradorService(ColaboradorRepository colaboradorRepository){
        this.colaboradorRepository = colaboradorRepository;
    }

    public List<Colaborador> ListarColaborador(){
        return colaboradorRepository.findAll();
    }

    public Boolean SalvarColaborador(Colaborador colaborador){
        try{
            colaboradorRepository.save(colaborador);
            return Boolean.TRUE;
        }
        catch(Exception e){
            return Boolean.FALSE;
        }
    }

}
