package com.example.demo.Service;

import com.example.demo.Repository.CoordenadorRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;
@Service
public class CoordenadorService {
    private final CoordenadorRepository colaboradorRepository;


    public CoordenadorService(CoordenadorRepository colaboradorRepository) {
        this.colaboradorRepository = colaboradorRepository;
    }

    public List<com.example.demo.Model.Coordenador> ListarCoordenador() {
        return colaboradorRepository.findAll();
    }

    public Boolean SalvarColaborador(com.example.demo.Model.Coordenador colaborador) {
        try {
            colaboradorRepository.save(colaborador);
            return Boolean.TRUE;
        }
        catch (Exception e) {
            return Boolean.FALSE;
        }
    }

    public Boolean alterarColaborador(com.example.demo.Model.Coordenador colaborador) {

        try {
            colaboradorRepository.save(colaborador);
            return Boolean.TRUE;
        } catch (Exception e) {
            return Boolean.FALSE;
        }
    }
    @DeleteMapping
    public Boolean deletarColaborador (com.example.demo.Model.Coordenador colaborador){
        try {
            colaboradorRepository.delete(colaborador);
            return Boolean.TRUE;
        }
        catch (Exception e) {
            return Boolean.FALSE;
        }
    }
}
