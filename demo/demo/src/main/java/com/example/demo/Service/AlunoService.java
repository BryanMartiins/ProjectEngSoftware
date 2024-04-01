package com.example.demo.Service;

import com.example.demo.Model.Aluno;
import com.example.demo.Repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class AlunoService {
    private final AlunoRepository alunoRepository;

    @Autowired
    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository= alunoRepository;
    }
    public List<Aluno> ListarAluno(){
       return alunoRepository.findAll();
    }

    public Boolean SalvarAluno(Aluno aluno){
        try{
            alunoRepository.save(aluno);
            return Boolean.TRUE;
        }
        catch (Exception e){
            return Boolean.FALSE;
        }
    }
}
