package com.example.demo.Service;

import com.example.demo.Model.Aluno;
import com.example.demo.Repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.ArrayList;
import java.util.List;



@CrossOrigin("*")
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
    public List<Aluno> returnSearch(String pesquisa){
        List<Aluno> todosAlunos = ListarAluno();
        List<Aluno> contens = new ArrayList<>();

        for(Aluno aluno: todosAlunos){
            if (aluno.getNomeCompleto().contains(pesquisa)){
                contens.add(aluno);

            }
        }
        return contens;
    }
    @DeleteMapping
    public Boolean deletarAluno(Aluno aluno){
        try{
            alunoRepository.delete(aluno);
            return Boolean.TRUE;
        }
        catch (Exception e){
            return Boolean.FALSE;
        }
    }
    public Boolean alterarAluno(Aluno aluno){
        try {
            alunoRepository.save(aluno);
            return Boolean.TRUE;
        }
        catch(Exception e){
            return Boolean.FALSE;
        }

    }
}
