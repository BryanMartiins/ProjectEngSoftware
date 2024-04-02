package com.example.demo.Service;

import com.example.demo.Model.Professor;
import com.example.demo.Repository.ColaboradorRepository;
import com.example.demo.Repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository){
        this.professorRepository = professorRepository;
    }

    public List<Professor> ListarProfessor(){
        return professorRepository.findAll();
    }

    public Boolean SalvarProfessor(Professor professor){
        try{
            professorRepository.save(professor);
            return Boolean.TRUE;
        }
        catch(Exception e ){
            return Boolean.FALSE;
        }
    }

}
