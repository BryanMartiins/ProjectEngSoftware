package com.example.demo.Service;

import com.example.demo.Model.Evento;
import com.example.demo.Repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;
@CrossOrigin("*")
@Service
public class EventoService{
    private final EventoRepository eventoRepository;

    @Autowired
    public EventoService(EventoRepository eventosRepository){
        this.eventoRepository = eventosRepository;
    }

    public List<Evento> ListarEvento() {
        return eventoRepository.findAll();
    }

    public Boolean SalvarEvento(Evento evento){
        try{
            eventoRepository.save(evento);
            return Boolean.TRUE;
        }
        catch(Exception e){
            return  Boolean.FALSE;
        }
    }

    public Boolean alterarEvento(Evento evento){
        try{
            eventoRepository.save(evento);
            return Boolean.TRUE;
        }
        catch(Exception e){
            return Boolean.FALSE;
        }
    }
    @DeleteMapping
    public Boolean deletarEvento(Evento evento){
        try{
            eventoRepository.delete(evento);
            return Boolean.TRUE;
        }
        catch (Exception e){
            return Boolean.FALSE;
        }
    }
}
