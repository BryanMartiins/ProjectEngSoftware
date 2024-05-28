package com.example.demo.Service;

import com.example.demo.Model.Professor;
import com.example.demo.Repository.ProfessorRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

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
    public Boolean alterarProfessor(com.example.demo.Model.Professor professor) {

        try {
            professorRepository.save(professor);
            return Boolean.TRUE;
        } catch (Exception e) {
            return Boolean.FALSE;
        }
    }
    @DeleteMapping
    public Boolean deletarProfessor(com.example.demo.Model.Professor professor){
        try {
            professorRepository.delete(professor);
            return Boolean.TRUE;
        }
        catch (Exception e) {
            return Boolean.FALSE;
        }
    }

}
